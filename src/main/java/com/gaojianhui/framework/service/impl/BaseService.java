package com.gaojianhui.framework.service.impl;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.gaojianhui.framework.dao.BaseRepository;
import com.gaojianhui.framework.dtomapper.CommonMapper;
import com.gaojianhui.framework.model.BaseEntity;
import com.gaojianhui.framework.page.QueryParam;
import com.gaojianhui.framework.page.SanyiPage;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.jdbc.core.JdbcTemplate;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQueryFactory;

import net.sf.jxls.transformer.XLSTransformer;

public abstract class BaseService<T extends BaseEntity> {
	/**
	 * 注入mybitas的sqlSessionFactory，用于分页
	 */
	@Autowired
	protected SqlSessionFactory sqlSessionFactory;
	@Autowired
	private BaseRepository<T> repository;
	@Autowired
	protected JdbcTemplate jdbcTemplate;
	protected JPAQueryFactory queryFactory;
	// 注入EntityManager
	@PersistenceContext
	private EntityManager entityManager;
	@Autowired
    CommonMapper commonMapper;

	@PostConstruct
	private void initEntityManager() {
		queryFactory = new JPAQueryFactory(entityManager);
	}

	public T save(T entity) {
		return repository.save(entity);
	}

	public Iterable<T> saveAll(Iterable<T> entities) {
		return repository.saveAll(entities);
	}

	public T logicDelete(T entity) {
		entity.setDeleted(true);
		return repository.save(entity);
	}

	public Iterable<T> logicDeletedAll(Iterable<T> entities) {
		entities.forEach(entity -> {
			entity.setDeleted(true);
		});
		return repository.saveAll(entities);
	}

	public Iterable<T> findAll() {
		return repository.findAll();
	}

	public Iterable<T> findAllByPredicate(QueryParam<T> query) {
		return repository.findAll(packagePredicate(query),
				Sort.by(query.getSort().getDirection(), query.getSort().getSortName()));
	}

	public Optional<T> findById(String id) {
		return repository.findById(id);
	}

	public Iterable<T> findAllByIds(Iterable<String> ids) {
		return repository.findAllById(ids);
	}

	public Iterable<T> findAll(Predicate predicate, Sort sort) {
		return repository.findAll(predicate, sort);
	}

	public Iterable<T> findAll(Predicate predicate) {
		return repository.findAll(predicate);
	}

	public SanyiPage<T> selectByJpa(QueryParam<T> query) {
		Page<T> result = new PageImpl<T>(new ArrayList<>());
		if (query.getPaging()) {
			Pageable  pageable =PageRequest.of(query.getPage().getCurrentPage(), query.getPage().getSizePerPage(), query.getSort().getDirection(),
					query.getSort().getSortName());
			result=repository.findAll(packagePredicate(query),pageable);
			if(!result.hasContent()&& query.getPage().getCurrentPage()>0) {
//				query.getPage().setCurrentPage(query.getPage().getCurrentPage()-1);
				// 调整 最后一台数据删除时，没有调到前页问题
				pageable = PageRequest.of(query.getPage().getCurrentPage()-1, query.getPage().getSizePerPage(), query.getSort().getDirection(),
						query.getSort().getSortName());
				result =repository.findAll(packagePredicate(query),pageable);
			}
		} else {
			// 不分页
			Iterable<T> contents = findAllByPredicate(query);
			result = new PageImpl<T>(Lists.newArrayList(contents));
		}
		return new SanyiPage<T>(result);
	}

	public boolean exists(Predicate predicate) {
		return repository.exists(predicate);
	}

	public Optional<T> findOne(Predicate predicate) {

		return repository.findOne(predicate);
	}

	public boolean existsById(String id) {
		return repository.existsById(id);
	}

	public abstract Predicate packagePredicate(QueryParam<T> queryDto);

	public abstract Function<QueryParam, List> packageFindListMapper();

	public SanyiPage selectByBatis(QueryParam query) {
		query.getSort().getDirectionMethod();
		SanyiPage result = new SanyiPage();
		if (query.getPaging()) {
			try {
				PageInfo pageInfo = PageHelper
						.startPage(query.getPage().getCurrentPage() + 1, query.getPage().getSizePerPage())
						.doSelectPageInfo(() -> packageFindListMapper().apply(query));
				result.setContent(pageInfo.getList());
				result.setTotalElements(pageInfo.getTotal());
				result.setTotalPages(pageInfo.getPages());
			} finally {
				PageHelper.clearPage();
			}
		} else {
			result.setContent(packageFindListMapper().apply(query));

		}
		return result;
	}

	public SanyiPage selectByBatis(Function<QueryParam, List> mapperFunction, QueryParam query) {
		SanyiPage result = new SanyiPage();
		if (query.getPaging()) {
			try {
				PageInfo pageInfo = PageHelper
						.startPage(query.getPage().getCurrentPage() + 1, query.getPage().getSizePerPage())
						.doSelectPageInfo(() -> mapperFunction.apply(query));
				result.setContent(pageInfo.getList());
				result.setTotalElements(pageInfo.getTotal());
				result.setTotalPages(pageInfo.getPages());
			} finally {
				PageHelper.clearPage();
			}
		} else {
			result.setContent(mapperFunction.apply(query));

		}
		return result;
	}


	/**
	 * JXLS导出EXCEL重用代码
	 * 
	 * @param response
	 * @param realPath
	 * @param destFileName
	 * @param beans
	 * @param transformer
	 * @param in
	 * @param out
	 */
	public void jxlsExport(HttpServletResponse response, InputStream realPath, String destFileName,
			Map<String, Object> beans, XLSTransformer transformer, InputStream in, ServletOutputStream out) {
		// 设置响应
		try {
			response.setHeader("Content-Disposition","attachment;filename=" + new String(destFileName.getBytes(), "iso-8859-1"));
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		response.setContentType("application/vnd.ms-excel");
		try {
			in = new BufferedInputStream(realPath);
			out = response.getOutputStream();
			Workbook workbook = transformer.transformXLS(in, beans);
			Sheet sheet = workbook.getSheetAt(0);
			if (sheet == null) {
				return;
			}
			org.apache.poi.ss.usermodel.Row row = null;
			Cell cell = null;
			List<String> column0List = new LinkedList<String>();
			
			for (int rowNum = 0; rowNum <= sheet.getLastRowNum(); rowNum++) {
				row = sheet.getRow(rowNum);
				if (row == null) {
					continue;
				}
				
				// 找到第0列 遍历value
				cell = row.getCell(0);
				if (cell == null) {
					continue;
				}
				column0List.add(cell.getStringCellValue());
			}
			Object[] column0DistinctValue =column0List.stream().distinct().toArray();
			List<Pair> mergeCells = new LinkedList<Pair>();
			for(int j=0;j< column0DistinctValue.length;j++){
				mergeCells.add(new Pair(column0List.indexOf(column0DistinctValue[j]),column0List.lastIndexOf(column0DistinctValue[j])));
//				System.err.println(column0List.indexOf(column0DistinctValue[j])+":"+column0List.lastIndexOf(column0DistinctValue[j]));
			}
			for (int i = 4; i < mergeCells.size()-1; i++) {
				if(mergeCells.get(i).last>mergeCells.get(i).start){
					
					int cellRangeAddress1Value=0;
					int cellRangeAddress3Value=0;
					for(int k=mergeCells.get(i).start;k<=mergeCells.get(i).last;k++)
					{
						cellRangeAddress1Value=cellRangeAddress1Value+new Integer(sheet.getRow(k).getCell(1).getStringCellValue()).intValue();
						cellRangeAddress3Value=cellRangeAddress3Value+new Integer(sheet.getRow(k).getCell(3).getStringCellValue()).intValue();
					}
					for(int k=mergeCells.get(i).start;k<=mergeCells.get(i).last;k++)
					{
						sheet.getRow(k).getCell(1).setCellValue(cellRangeAddress1Value+"");
						sheet.getRow(k).getCell(3).setCellValue(cellRangeAddress3Value+"");
					}
					CellRangeAddress cellRangeAddress= new CellRangeAddress(mergeCells.get(i).start,mergeCells.get(i).last, 0, 0);
					CellRangeAddress cellRangeAddress1= new CellRangeAddress(mergeCells.get(i).start,mergeCells.get(i).last, 1, 1);
					CellRangeAddress cellRangeAddress3= new CellRangeAddress(mergeCells.get(i).start,mergeCells.get(i).last, 3, 3);
					CellRangeAddress cellRangeAddress4= new CellRangeAddress(mergeCells.get(i).start,mergeCells.get(i).last, 4, 4);
					
					
					sheet.addMergedRegion(cellRangeAddress);
					sheet.addMergedRegion(cellRangeAddress1);
					sheet.addMergedRegion(cellRangeAddress3);
					sheet.addMergedRegion(cellRangeAddress4);
				}
				
				
			}
			for (int i = 4; i < column0List.size()-1; i++) {
				int shichang = 0;
				int shichang0 = 0;
				if (!sheet.getRow(i).getCell(2).getStringCellValue().equals("")) {
					shichang= new Integer(sheet.getRow(i).getCell(2).getStringCellValue()).intValue();
				}
				int hh = shichang/60;
				int mm = shichang%60;
				String mmStr = String.format("%02d", mm);  
				sheet.getRow(i).getCell(2).setCellValue(hh + "小时"+ mmStr+"分钟");
				if (!sheet.getRow(i).getCell(3).getStringCellValue().equals("")) {
					shichang0 = new Integer(sheet.getRow(i).getCell(3).getStringCellValue()).intValue();
				}
				int hh0 = shichang0/60;
				int mm0 = shichang0%60;
				String mm0Str = String.format("%02d", mm0); 
				sheet.getRow(i).getCell(3).setCellValue(hh0 + "小时"+ mm0Str+"分钟");
			}
			// 将内容写入输出流并把缓存的内容全部发出去
			workbook.write(out);
			out.flush();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
				}
			}
		}
	}
	class Pair{
		
		public Pair(int start, int last) {
			super();
			this.start = start;
			this.last = last;
		}
		int start;
		int last;
		public int getStart() {
			return start;
		}
		public void setStart(int start) {
			this.start = start;
		}
		public int getLast() {
			return last;
		}
		public void setLast(int last) {
			this.last = last;
		}
		
	}
}
