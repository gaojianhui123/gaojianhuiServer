package com.sanyi.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.sanyi.framework.exception.BusinessException;
import com.sanyi.framework.dao.DrugRepository;
import com.sanyi.framework.service.impl.BaseService;
import com.sanyi.framework.util.ObjectUtil;
import com.sanyi.framework.model.Drug;
import com.sanyi.framework.model.QDrug;
import org.springframework.stereotype.Service;
import com.sanyi.framework.page.QueryParam;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.BooleanBuilder;
import java.util.function.Function;
import java.util.List;


@Service
public class DrugService extends BaseService<Drug>{
	@Autowired
	DrugRepository drugRepository;
	/**
	 * jpa的查询条件
	 */
	@Override
	public Predicate packagePredicate(QueryParam<Drug> queryDto) {
		final BooleanBuilder wherepredicate = new BooleanBuilder();
		wherepredicate.and(QDrug.drug.deleted.eq(false));
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getDoctor())) {
			wherepredicate.and(QDrug.drug.doctor.like("%" + queryDto.getQuery().getDoctor() + "%"));
		}
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getDrugName())) {
			wherepredicate.and(QDrug.drug.drugName.like("%" + queryDto.getQuery().getDrugName() + "%"));
		}
		return wherepredicate;
	}
	/**
	 * mybatis的查询条件
	 */
	@Override
	public Function<QueryParam, List> packageFindListMapper() {
		return (query) -> {
			return commonMapper.selectDrug(query);
		};
	}
	// 新增或者修改药品库对象
	public Drug saveDrug(Drug drug) throws BusinessException {
//		if(dictionaryRepository.exists(QDrug.dictionary.n.stringValue().eq(drug.getDictsortName()).and(QDictsort.dictsort.id.stringValue().notEqualsIgnoreCase(dictsort.getId())))) {
//			throw new BusinessException(dictsort.getDictsortName()+"字典分类名称已经存在，请更换名称！");
//		};
		return drugRepository.save(drug);
	}


}
