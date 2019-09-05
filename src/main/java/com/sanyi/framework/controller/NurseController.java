package com.sanyi.framework.controller;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import com.sanyi.framework.service.impl.LienPersonnelService;
import com.sanyi.framework.service.impl.LienPersonnelTanHuaRelateService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.sanyi.framework.service.impl.HealthService;
import com.sanyi.framework.service.impl.NurseService;
import org.springframework.core.io.ClassPathResource;
import net.sf.jxls.transformer.XLSTransformer;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import com.sanyi.framework.util.StringUtil;
import com.sanyi.framework.page.QueryParam;
import com.sanyi.framework.page.SanyiPage;
import javax.servlet.ServletOutputStream;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.sanyi.framework.dao.LienPersonnelTanHuaRelateRepository;
import com.sanyi.framework.dto.StatisticTanHuaDto;
import com.sanyi.framework.exception.BusinessException;
import com.sanyi.framework.model.Health;
import com.sanyi.framework.model.LienPersonnelTanHuaRelate;
import com.sanyi.framework.model.Nurse;
import java.util.stream.Collectors;
import java.io.BufferedInputStream;
import java.text.SimpleDateFormat;
import java.io.InputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;
import java.util.Set;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 
 * @author 74308
 *
 */
@RestController
@RequestMapping(value = "/nurse")
public class NurseController {
	@Autowired
	NurseService nurseService;
	@Autowired
	LienPersonnelService lienPersonnelService;
	@Autowired
	HealthService healthService;
	@Autowired
	LienPersonnelTanHuaRelateService lienPersonnelTanHuaRelateService;
	@Autowired
	LienPersonnelTanHuaRelateRepository lienPersonnelTanHuaRelateRepository;

	/**
	 * 查询列表
	 * 
	 * @param query
	 * @return
	 */
	@RequestMapping(value = "findNurse", method = RequestMethod.POST)
	public SanyiPage<Nurse> findNurse(@RequestBody QueryParam<Nurse> query) {
		return nurseService.selectByBatis(query);
	}

	/**
	 * 根据id查
	 * 
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "findNurseById", method = RequestMethod.POST)
	public Optional<Nurse> findNurseById(HttpServletRequest request, @RequestBody String id) {
		return nurseService.findById(id);
	}
	
	/**
	 * 根据谈话申请id查nurse对象
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "findNurseByTanHuaShenQingId", method = RequestMethod.POST)
	public Nurse findNurseByTanHuaShenQingId(HttpServletRequest request, @RequestBody String tanHuaShenQingId) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = sdf.format(new Date());
		return nurseService.findNurseByTanHuaShenQingId(tanHuaShenQingId, dateString);
	}
	/**
	 * 根据留置人id 和 上报时间查找出来对应的那一条谈话记录对象nurse
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "getNurseByLpIdAndTime", method = RequestMethod.POST)
	public Nurse getNurseByLpIdAndTime(HttpServletRequest request, @RequestBody Nurse nurse) {
        String dateString = nurse.getSubmitTime().substring(0, 10);
		return nurseService.getNurseByLpIdAndTime(nurse.getLienPersonnelid(), dateString);
	}

	/**
	 * 新增
	 * 
	 * @param request
	 * @param nurse
	 * @return
	 * @throws BusinessException 
	 */
	@RequestMapping(value = "saveNurse", method = RequestMethod.POST)
	public Nurse saveNurse(HttpServletRequest request, @RequestBody Nurse nurse) throws BusinessException {
		return nurseService.saveNurse(nurse);
	}

	/**
	 * 逻辑删除
	 * 
	 * @param request
	 * @param nurse
	 * @return
	 */
	@RequestMapping(value = "deleteNurse", method = RequestMethod.POST)
	public Nurse deleteNurse(HttpServletRequest request, @RequestBody Nurse nurse) {
		// 删除它的同时需要把LienPersonnelTanHuaRelate列表删除（与这个）
		List<LienPersonnelTanHuaRelate> lpth = lienPersonnelTanHuaRelateRepository.findByNurseId(nurse.getId());
		for (LienPersonnelTanHuaRelate lienPersonnelTanHuaRelate : lpth) {
			lienPersonnelTanHuaRelateService.logicDelete(lienPersonnelTanHuaRelate);
		}
		return nurseService.logicDelete(nurse);
	}
	/**
	 * 留置人员谈话情况统计
	 * @param request
	 * @param statisticTanHuaDto
	 * @return
	 * @throws BusinessException
	 */
	@RequestMapping(value = "statisticTanHua", method = RequestMethod.POST)
	public List<StatisticTanHuaDto> statisticTanHua(HttpServletRequest request, @RequestBody StatisticTanHuaDto statisticTanHuaDto) throws BusinessException {
		return nurseService.statisticTanHua(statisticTanHuaDto);
	}

	/**
	 * 文件导出讯问时间表
	 * @param submitTime 上报时间
	 * @param request
	 * @param response
	 * @throws Exception
	 */

	@RequestMapping(value = "noLimit_exportTalkTime/{submitTime}", method = RequestMethod.GET)
	public void exportTalkTime(@PathVariable("submitTime") String submitTime, HttpServletRequest request, HttpServletResponse response) throws Exception {
		SimpleDateFormat formatToString = new SimpleDateFormat("yyyy年MM月dd日");
		SimpleDateFormat formatToDate = new SimpleDateFormat("yyyy-MM-dd");
		InputStream realPath1 =  new ClassPathResource("/templates/讯问时间表.xlsx").getInputStream();
		// 输出路径
		String destFileName = "讯问时间表.xlsx";
		List<Nurse> nurseList = nurseService.selectNurseBySubmitTime1(submitTime);
		Map<String, Object> beans = new HashMap<String, Object>();
		submitTime = formatToString.format(formatToDate.parse(submitTime));
		beans.put("riqi", submitTime);
		beans.put("list", nurseList);
		XLSTransformer transformer = new XLSTransformer();
		// 创建输入输出流
		InputStream in = null;
		ServletOutputStream out = null;
		nurseService.jxlsExport(response, realPath1, destFileName, beans, transformer, in, out);
	}

	/**
	 * 基地讯问及安全情况日报导出Excel
	 * 
	 * @author tanj8899
	 *
	 */
	@RequestMapping(value = "noLimit_exportTalkSafeExcel/{submitTime}", method = RequestMethod.GET)
	public void exportTalkSafeExcel(@PathVariable("submitTime") String submitTime,HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 模板文件所在路径
		InputStream realPath =  new ClassPathResource("/templates/安全情况日报.xlsx").getInputStream();
		// 输出路径
		String destFileName = "安全情况日报.xlsx";
		SimpleDateFormat sdfToString =   new SimpleDateFormat( "yyyy年MM月dd日" ); 
		SimpleDateFormat sdfToDate =   new SimpleDateFormat( "yyyy-MM-dd" ); 
		// 查询看护信息谈话列表(每个人的开始时间 结束时间 备注 代号)
		List<LienPersonnelTanHuaRelate> lienPersonnelTanHuaRelates = nurseService.selectLienPersonnelTanHuaBySubmitTime(submitTime);
		// 分组
//		List<User> userList = Arrays.asList(user1, user2, user3, user5, user4);
        Map<String, List<LienPersonnelTanHuaRelate>> groupRelateMap = Maps.newHashMap();
        for (LienPersonnelTanHuaRelate lienPersonnelTanHuaRelate : lienPersonnelTanHuaRelates) {
            String cishu = lienPersonnelTanHuaRelate.getCiShu();
            if (groupRelateMap.containsKey(cishu)) {
            	groupRelateMap.get(cishu).add(lienPersonnelTanHuaRelate);
            } else {
            	groupRelateMap.put(cishu, Lists.newArrayList(lienPersonnelTanHuaRelate));
            }
        }
        
        System.err.println(groupRelateMap);
        List<List<LienPersonnelTanHuaRelate>> result = new ArrayList<List<LienPersonnelTanHuaRelate>>();
        for (Map.Entry<String, List<LienPersonnelTanHuaRelate>> entry : groupRelateMap.entrySet()) {
        	result.add(entry.getValue());
        }
         
        List<LienPersonnelTanHuaRelate> relates = new ArrayList<LienPersonnelTanHuaRelate>();
        for (int i =0; i < result.size(); i++) {
        	List<LienPersonnelTanHuaRelate> relateList = result.get(i);
        	LienPersonnelTanHuaRelate r = new LienPersonnelTanHuaRelate();
        	for (int j = 0; j < relateList.size(); j++) {
        		LienPersonnelTanHuaRelate r1 = relateList.get(j);
        		// 谈话人（分 奇数和 偶数）
        		if ((j+1) % 2 == 0) { // 偶数
        			if (r.getOushuRen() != null) {
        				r.setOushuRen(r.getOushuRen() + "\r\n" + r1.getTanHuaRen());
        			} else {
        				r.setOushuRen(r1.getTanHuaRen());
        			}
        		} else { // 奇数
        			if (r.getJishuRen() != null) {
        				r.setJishuRen(r.getJishuRen() + "\r\n" + r1.getTanHuaRen());
        			} else {
        				r.setJishuRen(r1.getTanHuaRen());
        			}
        		}
        		if (r.getTalkStartTime() != null) { // 开始时间
        			if (r1.getTalkStartTime() != null) {
        				if (sdfToDate.parse(r1.getTalkStartTime()).before(sdfToDate.parse(r.getTalkStartTime()))) {
            				r.setTalkStartTime(r1.getTalkStartTime());
            			}	
        			}
        		} else {
        			if (r1.getTalkStartTime() != null) {
        				r.setTalkStartTime(r1.getTalkStartTime());
        			}
        		}
        		if (r.getTalkEndTime() != null) { // 结束时间
        			if (r1.getTalkEndTime() != null) {
        				if (sdfToDate.parse(r.getTalkEndTime()).before(sdfToDate.parse(r1.getTalkEndTime()))) {
            				r.setTalkEndTime(r1.getTalkEndTime());
            			}	
        			}
        		} else {
        			if (r1.getTalkEndTime() != null) {
        				r.setTalkEndTime(r1.getTalkEndTime());
        			}
        		}
        		r.setRemark(r1.getRemark());// 备注
        		r.setDaiHao(r1.getDaiHao());// 代号
        	}
        	relates.add(r);
        }
     // 查询这个日期下的所有nurse
//     		List<Nurse> nurses = nurseService.selectNurseBySubmitTime(submitTime);
     		List<LienPersonnelTanHuaRelate> distinctLienPersonnelTanHuaRelates = nurseService.selectDistinctLienPersonnelTanHuaBySubmitTime(submitTime);
     		// 封装替换标签item map
     		// 根据进驻ID获取常规体检记录
//     		List<List<Health>> collect = nurses.stream().map(eq -> {
//     			return healthService.selectHealthSpecialCaseByLpIdAndTime(eq.getLienPersonnelid(),submitTime);
//     		}).collect(Collectors.toList());
     		List<List<Health>> collect = distinctLienPersonnelTanHuaRelates.stream().map(eq -> {
     			return healthService.selectHealthSpecialCaseByLpIdAndTime(eq.getLpId(),submitTime);
     		}).collect(Collectors.toList());
     		// 封装bean
     		List<String> spList = new ArrayList();
     		// 获取体检记录里的特殊情况
     		collect.forEach(a -> {
     			List<String> collect2 = a.stream().map(health -> {
     				if (health.getSpecialCase() != null) {
     					return "代号" + health.getDaihao() + ":" + health.getSpecialCase();
     				} else {
     					return "代号" + health.getDaihao() + ": 无记录";
     				}
     			}).collect(Collectors.toList());
     			spList.addAll(collect2);
     		});
		// 把List 拼成空格连接的字符串
		String spS = StringUtil.listToString2(spList);
		// 这个医疗保障
		// 获得所有填写 其他情况 列表
		List<String> restsRemarkList_ = distinctLienPersonnelTanHuaRelates.stream().map(nurse -> {
			String daihao = "";
			String rest = "";
			if (nurse.getDaiHao() == null) {
				daihao = "";
			} else {
				daihao = nurse.getDaiHao();
			}
			if (nurse.getRestsRemarks() == null) {
				rest = "无记录";
			} else {
				rest = nurse.getRestsRemarks();
			}
			return "代号" + daihao + ":" + rest;
		}).collect(Collectors.toList());
		String listToString2 = "";
		if (restsRemarkList_.size() > 0) {
			listToString2 = StringUtil.listToString2(restsRemarkList_);
		}
		List<Map<String, Object>> lienTanHuaLists = new ArrayList<Map<String, Object>>();
		Map<String, Object> beans = new HashMap<String, Object>();
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm"); // 格式化时间
		for(LienPersonnelTanHuaRelate lienPersonnelTanHuaRelate: relates ){
			Map<String, Object> dataMap = new HashMap<>();
			dataMap.put("jiShuRen", lienPersonnelTanHuaRelate.getJishuRen());
			dataMap.put("ouShuRen", lienPersonnelTanHuaRelate.getOushuRen());
			dataMap.put("daiHao", lienPersonnelTanHuaRelate.getDaiHao());
			if (lienPersonnelTanHuaRelate.getTalkStartTime() != null) {
				dataMap.put("talkStartTime", timeFormat.format(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(lienPersonnelTanHuaRelate.getTalkStartTime())));
			}
			if (lienPersonnelTanHuaRelate.getTalkEndTime() != null) {
				dataMap.put("talkEndTime", timeFormat.format(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(lienPersonnelTanHuaRelate.getTalkEndTime())));
			}
			dataMap.put("remark", lienPersonnelTanHuaRelate.getRemark());
			lienTanHuaLists.add(dataMap);
		}
		beans.put("riqi", sdfToString.format(sdfToDate.parse(submitTime))); // 日期
		beans.put("list", lienTanHuaLists); // 列表
		beans.put("baozhangqingkuang", spS); // 保障情况
		beans.put("qishiqingkuang", listToString2); // 其他情况
		XLSTransformer transformer = new XLSTransformer();
		// 创建输入输出流
		InputStream in = null;
		ServletOutputStream out = null;
		try {
			response.setHeader("Content-Disposition",
					"attachment;filename=" + new String(destFileName.getBytes(), "iso-8859-1"));
			response.setContentType("application/vnd.ms-excel");
			in = new BufferedInputStream(realPath);
			out = response.getOutputStream();
			org.apache.poi.ss.usermodel.Workbook workbook = transformer.transformXLS(in, beans);
			// 将内容写入输出流并把缓存的内容全部发出去
			workbook.write(out);
			out.flush();
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();

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

}
