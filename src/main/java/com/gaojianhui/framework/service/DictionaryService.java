package com.gaojianhui.framework.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.gaojianhui.framework.exception.BusinessException;
import com.gaojianhui.framework.service.impl.BaseService;
import com.gaojianhui.framework.dao.DictionaryRepository;
import com.gaojianhui.framework.mapper.CommonMapper;
import com.gaojianhui.framework.model.QDictionary;
import com.gaojianhui.framework.model.Dictionary;
import com.gaojianhui.framework.util.ObjectUtil;
import com.gaojianhui.framework.page.QueryParam;
import org.springframework.stereotype.Service;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.BooleanBuilder;
import java.util.function.Function;
import java.util.List;
@Service
public class DictionaryService extends BaseService<Dictionary>{
	@Autowired
	DictionaryRepository dictionaryRepository;
	@Autowired
	private CommonMapper commonMapper;
	/**
	 * jpa的查询条件
	 */
	@Override
	public Predicate packagePredicate(QueryParam<Dictionary> queryDto) {
		final BooleanBuilder wherepredicate = new BooleanBuilder();
		wherepredicate.and(QDictionary.dictionary.deleted.eq(false));
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getDsId())) {
			wherepredicate.and(QDictionary.dictionary.dsId.eq(queryDto.getQuery().getDsId()));
		}
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getDicName())) {
			wherepredicate.and(QDictionary.dictionary.dicName.like("%"+queryDto.getQuery().getDicName()+"%"));
		}
		return wherepredicate;
	}
	/**
	 * mybatis的查询条件
	 */
	@Override
	public Function<QueryParam, List> packageFindListMapper() {
		return (query) -> {
			return commonMapper.selectDictionary(query);
		};
	}
	// 新增或者修改字典对象
	public Dictionary saveDictionary(Dictionary dictionary) throws BusinessException {
//		if(dictionaryRepository.exists(QDictionary.dictionary.n.stringValue().eq(dictsort.getDictsortName()).and(QDictsort.dictsort.id.stringValue().notEqualsIgnoreCase(dictsort.getId())))) {
//			throw new BusinessException(dictsort.getDictsortName()+"字典分类名称已经存在，请更换名称！");
//		};
		return dictionaryRepository.save(dictionary);
	}


}
