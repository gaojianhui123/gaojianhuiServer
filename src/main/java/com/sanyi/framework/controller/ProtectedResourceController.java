package com.sanyi.framework.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sanyi.framework.dtomapper.CommonMapper;
import com.sanyi.framework.model.ProtectedResource;
import com.sanyi.framework.model.User;
import com.sanyi.framework.page.QueryParam;
import com.sanyi.framework.service.impl.ProtectedResourceService;
import com.sanyi.framework.service.impl.UserService;
import com.sanyi.framework.util.TreeBuilder;

@RestController
@RequestMapping(value = "/protectedResource")
public class ProtectedResourceController extends BaseController{
	@Autowired
	UserService userService;
	@Autowired
	ProtectedResourceService protectedResourceService;
	@Autowired
	CommonMapper commonMapper;
	
	/*
	 * 查树形结构全部数据 
	 */
	@RequestMapping(value = "findAll", method = RequestMethod.POST)
	public Object test(@RequestBody QueryParam<ProtectedResource> query) {
		return protectedResourceService.getProtectedResourceTree();
		//return protectedResourceService.findAll(query);
	}
	@RequestMapping(value = "findMenuTreeByCurrentUser", method = RequestMethod.POST)
	public Object findAllByUser(HttpServletRequest request) {
		List<ProtectedResource> menuList =commonMapper.findMenusByUserid(super.getCurrentUserId(request));
//		List<ProtectedResource> menuAndButtonList =commonMapper.findFontProtectedResourceByUserid(super.getCurrentUser(request).getId());
		Map<String,Object> result = new HashedMap();
		result.put("menuTree", new TreeBuilder().buildByRecursive(menuList));
//		result.put("menuAndButtonList", menuAndButtonList);
		return result;
	}
	
	/*
	 * 根据id查
	 */
	@RequestMapping(value = "findProtectedResourceById", method = RequestMethod.POST)
	public Optional<ProtectedResource> findProtectedResourceById(HttpServletRequest request, @RequestBody ProtectedResource protectedResource) {
		return protectedResourceService.findById(protectedResource.getId());
	}
	/*
	 * 根据id 查指定树或单个分支的树数据
	 */
	@RequestMapping(value = "findProtectedResourceTreeById", method = RequestMethod.POST)
	public ProtectedResource findProtectedResourceTreeById(HttpServletRequest request, @RequestBody ProtectedResource protectedResource) {
		return protectedResourceService.getProtectedResourceTree(protectedResource.getId());
	}
	
	
	
	/*
	 *  新增
	 */
	@RequestMapping(value = "saveProtectedResource", method = RequestMethod.POST)
	public ProtectedResource saveProtectedResource(HttpServletRequest request, @RequestBody ProtectedResource protectedResource){
		return protectedResourceService.save(protectedResource);
	}
	
	/*
	 *  逻辑删除
	 */
	@RequestMapping(value = "deleteProtectedResource", method = RequestMethod.POST)
	public ProtectedResource deleteProtectedResource(HttpServletRequest request, @RequestBody ProtectedResource protectedResource)  {

		return protectedResourceService.logicDelete(protectedResource);
	}
	
	
}
