package com.sanyi.framework.service.impl;

import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.sanyi.framework.dao.HandlingPersonRepository;
import com.sanyi.framework.exception.BusinessException;
import com.sanyi.framework.model.HandlingPerson;
import com.sanyi.framework.model.QHandlingPerson;
import com.sanyi.framework.page.QueryParam;
import com.sanyi.framework.util.ObjectUtil;
/**
 * HandlingPersonService(办案人员管理)
 * @author 唐翔
 *
 */
@Service
public class HandlingPersonService extends BaseService<HandlingPerson> {
	@Autowired
	HandlingPersonRepository handlingPersonRepository;
	@Override
	public Predicate packagePredicate(QueryParam<HandlingPerson> queryDto) {
		final BooleanBuilder wherepredicate = new BooleanBuilder();
		wherepredicate.and(QHandlingPerson.handlingPerson.deleted.eq(false));
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getTitle())) {
			wherepredicate.and(QHandlingPerson.handlingPerson.title.like ("%" + queryDto.getQuery().getTitle() + "%" ));
		}
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getControlNo())) {
			wherepredicate.and(QHandlingPerson.handlingPerson.controlNo.like("%" + queryDto.getQuery().getControlNo() + "%" ));
		}
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getApplyTime())) {
			wherepredicate.and(QHandlingPerson.handlingPerson.applyTime.like ("%" + queryDto.getQuery().getApplyTime() + "%" ));
		}
		
		return wherepredicate;
	}

	@Override
	public Function<QueryParam, List> packageFindListMapper() {
		// TODO Auto-generated method stub
		return null;
	}
	// 编号过滤验证
	public HandlingPerson saveHandlingPerson(HandlingPerson handlingPerson)throws Exception{
		if (handlingPersonRepository.exists(
				QHandlingPerson.handlingPerson.controlNo.stringValue().eq(handlingPerson.getControlNo())
				.and(QHandlingPerson.handlingPerson.deleted.eq(false))
				.and(QHandlingPerson.handlingPerson.id.stringValue().notEqualsIgnoreCase(handlingPerson.getId())))) {
			throw new BusinessException(handlingPerson.getControlNo() + "此编号已存在，不能重复添加！");
		}
		
		return handlingPersonRepository.save(handlingPerson);
	}


}
