package com.gaojianhui.framework.controller;

import com.gaojianhui.framework.model.User;
import com.gaojianhui.framework.page.QueryParam;
import com.gaojianhui.framework.page.SanyiPage;
import com.gaojianhui.framework.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import com.gaojianhui.framework.exception.BusinessException;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/users")
public class UserController extends BaseController{
	@Autowired
    UserService userService;
	@RequestMapping(value = "findUsers", method = RequestMethod.POST)
	public SanyiPage<User> findPartyBuildingArticle(@RequestBody QueryParam<User> query) {
		return userService.selectByJpa(query);
//		return partyBuildingArticleService.findAll(query);
	}
	@RequestMapping(value = "changeEnabled", method = RequestMethod.POST)
	public User changeEnabled(@RequestBody User user) {
		return userService.changeEnabled(user);
	}
	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public User deleteUser(@RequestBody User user) {
		return userService.logicDelete(user);
	}
	@RequestMapping(value = "getUserById", method = RequestMethod.POST)
	public User getUserById(@RequestBody String id) {
		return userService.findById(id).orElse(new User());
	}
	@RequestMapping(value = "saveUser", method = RequestMethod.POST)
	public User saveUser(@RequestBody User user) throws BusinessException {
		return userService.saveUser(user);
	}
	@RequestMapping(value = "getCurrentUser", method = RequestMethod.POST)
	public User getCurrentUser1(HttpServletRequest request) throws BusinessException {
		return super.getCurrentUser(request);
	}
	// 修改密码
	@RequestMapping(value = "updatePassword", method = RequestMethod.POST)
	public User updatePassword(HttpServletRequest request, @RequestBody User user) throws BusinessException {
		return userService.updatePassword(user);
	}
	// 重置密码
	@RequestMapping(value = "resetPassword", method = RequestMethod.POST)
	public User resetPassword(HttpServletRequest request, @RequestBody User user) throws BusinessException {
		return userService.resetPassword(user);
	}
		
}
