package com.sanyi.framework.service.impl;

import java.util.List;
import java.util.function.Function;
import org.springframework.stereotype.Service;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.sanyi.framework.model.Catering;
import com.sanyi.framework.model.QCatering;
import com.sanyi.framework.model.QNurse;
import com.sanyi.framework.page.QueryParam;
import com.sanyi.framework.util.ObjectUtil;
/**
 * 
 * @author 74308
 *
 */
@Service
public class CateringService  extends BaseService<Catering> {

	@Override
	public Predicate packagePredicate(QueryParam<Catering> queryDto) {
		final BooleanBuilder wherepredicate = new BooleanBuilder();
		wherepredicate.and(QCatering.catering.deleted.eq(false));
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getCateringMenu())) {
			wherepredicate.and(QCatering.catering.cateringMenu.eq(queryDto.getQuery().getCateringMenu()));
		}
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getRiqi())) {
			wherepredicate.and(QCatering.catering.riqi.like("%"+queryDto.getQuery().getRiqi()+"%"));
		}
		return wherepredicate;
	}

	@Override
	public Function<QueryParam, List> packageFindListMapper() {
		// TODO Auto-generated method stub
		return null;
	}

}
