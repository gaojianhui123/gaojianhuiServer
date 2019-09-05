package com.sanyi.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.sanyi.framework.dao.BaozhangshenqingRepository;
import com.sanyi.framework.exception.BusinessException;
import com.sanyi.framework.model.QBaozhangshenqing;
import com.sanyi.framework.model.Baozhangshenqing;
import org.springframework.stereotype.Service;
import com.sanyi.framework.util.ObjectUtil;
import com.sanyi.framework.page.QueryParam;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.BooleanBuilder;
import java.util.function.Function;
import java.util.List;

@Service
public class BaozhangshenqingService extends BaseService<Baozhangshenqing>{
	@Autowired
	BaozhangshenqingRepository baozhangshenqingRepository;
	/**
	 * jpa的查询条件
	 */
	@Override
	public Predicate packagePredicate(QueryParam<Baozhangshenqing> queryDto) {
		final BooleanBuilder wherepredicate = new BooleanBuilder();
		wherepredicate.and(QBaozhangshenqing.baozhangshenqing.deleted.eq(false));
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getLpId())) {
			wherepredicate.and(QBaozhangshenqing.baozhangshenqing.lpId.eq(queryDto.getQuery().getLpId()));
		}
		return wherepredicate;
	}
	/**
	 * mybatis的查询条件
	 */
	@Override
	public Function<QueryParam, List> packageFindListMapper() {
		return (query) -> {
			return commonMapper.selectBaozhangshenqing(query);
		};
	}
	// 新增或者修改保障申请对象
	public Baozhangshenqing saveBaozhangshenqing(Baozhangshenqing Baozhangshenqing) throws BusinessException {
//		if(dictionaryRepository.exists(QDrug.dictionary.n.stringValue().eq(drug.getDictsortName()).and(QDictsort.dictsort.id.stringValue().notEqualsIgnoreCase(dictsort.getId())))) {
//			throw new BusinessException(dictsort.getDictsortName()+"字典分类名称已经存在，请更换名称！");
//		};
		return baozhangshenqingRepository.save(Baozhangshenqing);
	}
	
	


}
