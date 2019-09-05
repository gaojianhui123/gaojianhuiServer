package com.gaojianhui.framework.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.gaojianhui.framework.dao.ProtectedResourceRepository;
import com.gaojianhui.framework.model.ProtectedResource;
import com.gaojianhui.framework.model.QProtectedResource;
import com.gaojianhui.framework.page.QueryParam;
import com.gaojianhui.framework.util.TreeBuilder;

@Service
public class ProtectedResourceService extends BaseService<ProtectedResource> {

	@Autowired
	private ProtectedResourceRepository protectedResourceRepository;
	
	
	/*
	 * (non-Javadoc)
	 * @see BaseService#packagePredicate(QueryParam)
	 * 查询条件
	 */
	public Predicate packagePredicate(QueryParam<ProtectedResource> queryDto) {
		final BooleanBuilder wherepredicate = new BooleanBuilder();
		wherepredicate.and(QProtectedResource.protectedResource.deleted.eq(false));
		return wherepredicate;
	}
	@Override
	public Function<QueryParam, List> packageFindListMapper() {
		return (query) -> {
			return null;
		};
	}
	/*
	 * 返回树形结构数据
	 */
	public List<ProtectedResource> getProtectedResourceTree(){
		  List<ProtectedResource> treeNodeList=Lists.newArrayList(findAll(QProtectedResource.protectedResource.deleted.eq(false),Sort.by(Sort.Direction.ASC, "sortindex")));
//		  treeNodeList.forEach(node -> {
//			  node.setIcon(null);
//		  });
		  return new TreeBuilder().buildByRecursive(treeNodeList);
	}
	
	/*
	 * 根据id返回指定树
	 */
	public ProtectedResource getProtectedResourceTree(String pid){
		  ProtectedResource parent = findById(pid).get();
		  List<ProtectedResource> treeNodeList=Lists.newArrayList(findAll(QProtectedResource.protectedResource.deleted.eq(false),Sort.by(Sort.Direction.ASC, "sortindex")));
		  return (ProtectedResource) new TreeBuilder().findChildren(parent, treeNodeList);
	}
	// 根据id 获得单一
	public Optional<ProtectedResource> findProtectedResourceById(String id) {
		return protectedResourceRepository.findById(id);
	}
	
	public ProtectedResource saveProtectedResource(ProtectedResource protectedResource) {
		return protectedResourceRepository.save(protectedResource);
	}

	public Iterable<ProtectedResource> saveAllProtectedResource(Iterable<ProtectedResource> entities) {
		return  protectedResourceRepository.saveAll(entities);
	}
	
}
