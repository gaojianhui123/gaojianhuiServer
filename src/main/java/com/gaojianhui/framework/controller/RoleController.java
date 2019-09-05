package com.gaojianhui.framework.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import com.gaojianhui.framework.model.Role;
import com.gaojianhui.framework.page.QueryParam;
import com.gaojianhui.framework.page.SanyiPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.gaojianhui.framework.service.impl.RoleService;

@RestController
@RequestMapping(value = "/role")
public class RoleController {
	@Autowired
	RoleService roleService;
	
	// 查询列表
	@RequestMapping(value = "findRole", method = RequestMethod.POST)
	public SanyiPage<Role> findRepair(@RequestBody QueryParam<Role> query) {
		return roleService.selectByJpa(query);
	}
	
	
	// 根据id查活动
	@RequestMapping(value = "findRoleById", method = RequestMethod.POST)
	public Optional<Role> findRoleById(HttpServletRequest request, @RequestBody String id) {
		return roleService.findById(id);
	}
	
	
	// 新增活动
	@RequestMapping(value = "saveRole", method = RequestMethod.POST)
	public Role saveRole(HttpServletRequest request, @RequestBody Role role){
		return roleService.save(role);
	}
	
	// 逻辑删除
	@RequestMapping(value = "deleteRole", method = RequestMethod.POST)
	public Role deleteRole(HttpServletRequest request, @RequestBody Role role)  {
//		role.setDeleted(true);
		return roleService.roleDelete(role);
	}
	
	// 批量逻辑删除
	@RequestMapping(value = "deleteRoleAll", method = RequestMethod.POST)
	public Iterable<Role> deleteRoleAll(HttpServletRequest request, @RequestBody Iterable<Role> role)  {
		
		return roleService.logicDeletedAll((Iterable<Role>) role);
	}
	

}
