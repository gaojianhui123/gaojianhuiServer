package com.sanyi.framework.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sanyi.framework.dao.DictsortRepository;
import com.sanyi.framework.exception.BusinessException;
import com.sanyi.framework.model.Dictsort;
import com.sanyi.framework.model.QDictsort;
import com.sanyi.framework.service.impl.BaseService;
import org.springframework.stereotype.Service;
import com.sanyi.framework.util.ObjectUtil;
import com.sanyi.framework.page.QueryParam;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.BooleanBuilder;
import java.util.function.Function;
import java.util.List;


@Service
public class DictsortService extends BaseService<Dictsort>{
	@Autowired
	DictsortRepository dictsortRepository;
	/**
	 * jpa的查询条件
	 */
	@Override
	public Predicate packagePredicate(QueryParam<Dictsort> queryDto) {
		final BooleanBuilder wherepredicate = new BooleanBuilder();
		wherepredicate.and(QDictsort.dictsort.deleted.eq(false));
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getDictsortName())) {
			wherepredicate.and(QDictsort.dictsort.dictsortName.like("%" + queryDto.getQuery().getDictsortName() + "%"));
		}
		return wherepredicate;
	}
	/**
	 * mybatis的查询条件
	 */
	@Override
	public Function<QueryParam, List> packageFindListMapper() {
		// TODO Auto-generated method stub
		return null;
	}
	// 新增或者修改字典分类对象
	public Dictsort saveDictsort(Dictsort dictsort) throws BusinessException {
		if(dictsortRepository.exists(QDictsort.dictsort.dictsortName.stringValue().eq(dictsort.getDictsortName()).and(QDictsort.dictsort.id.stringValue().notEqualsIgnoreCase(dictsort.getId())))) {
			throw new BusinessException(dictsort.getDictsortName()+"字典分类名称已经存在，请更换名称！");
		};
		return dictsortRepository.save(dictsort);
	}


}
