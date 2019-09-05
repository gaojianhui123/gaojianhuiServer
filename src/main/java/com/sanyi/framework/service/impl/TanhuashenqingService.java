package com.sanyi.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.sanyi.framework.dao.TanhuashenqingRepository;
import com.sanyi.framework.model.QTanhuashenqing;
import com.sanyi.framework.model.Tanhuashenqing;
import org.springframework.stereotype.Service;
import com.sanyi.framework.page.QueryParam;
import com.sanyi.framework.util.ObjectUtil;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.BooleanBuilder;
import java.util.function.Function;
import java.util.List;

@Service
public class TanhuashenqingService extends BaseService<Tanhuashenqing>{
	@Autowired
	TanhuashenqingRepository tanhuashenqingRepository;
	/**
	 * jpa的查询条件
	 */
	@Override
	public Predicate packagePredicate(QueryParam<Tanhuashenqing> queryDto) {
		final BooleanBuilder wherepredicate = new BooleanBuilder();
		wherepredicate.and(QTanhuashenqing.tanhuashenqing.deleted.eq(false));
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getLpId())) {
			wherepredicate.and(QTanhuashenqing.tanhuashenqing.lpId.eq(queryDto.getQuery().getLpId()));
		}
		return wherepredicate;
	}
	/**
	 * mybatis的查询条件
	 */
	@Override
	public Function<QueryParam, List> packageFindListMapper() {
		return (query) -> {
			return commonMapper.selectTanhuashenqing(query);
		};
	}
	//  导出谈话名单   根据谈话申请的id 获取被调查人代号、填报部门、填报人、填报日期、人员信息
	public Tanhuashenqing findTanHuaShenQingExport(String id) {
		return tanhuashenqingRepository.findTanHuaShenQingExport(id);
	}


	//  导出谈话名单   根据谈话申请的id 获取被调查人代号、填报部门、填报人、填报日期、人员信息
	public List<Tanhuashenqing> findTanHuaShenQingExportAll(String kanhuliliang) {
		return tanhuashenqingRepository.findTanHuaShenQingExportAll(kanhuliliang);
	}
}
