package com.sanyi.framework.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import com.sanyi.framework.dao.HealthDrugRelateRepository;
import org.springframework.stereotype.Service;
import com.sanyi.framework.page.QueryParam;
import com.sanyi.framework.util.ObjectUtil;
import com.querydsl.core.types.Predicate;
import com.sanyi.framework.model.QHealthDrugRelate;
import com.querydsl.core.BooleanBuilder;
import com.sanyi.framework.model.HealthDrugRelate;
import java.util.function.Function;
import java.util.List;


@Service
public class HealthDrugRelateService extends BaseService<HealthDrugRelate> {
	@Autowired
	private HealthDrugRelateRepository healthDrugRelateRepository;
	@Override
	public Predicate packagePredicate(QueryParam<HealthDrugRelate> queryDto) {
		final BooleanBuilder wherepredicate = new BooleanBuilder();
		wherepredicate.and(QHealthDrugRelate.healthDrugRelate.deleted.eq(false));
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getLpId())) {
			wherepredicate.and(QHealthDrugRelate.healthDrugRelate.lpId.eq(queryDto.getQuery().getLpId()));
		}
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getYongyaoType())) {
			wherepredicate.and(QHealthDrugRelate.healthDrugRelate.yongyaoType.eq(queryDto.getQuery().getYongyaoType()));
		}
		return wherepredicate;
	}

	@Override
	public Function<QueryParam, List> packageFindListMapper() {
		return (query) -> {
			return commonMapper.selectHealthDrugRelate(query);
		};
	}
	
}
