package com.sanyi.framework.controller;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.sanyi.framework.model.User;
import com.sanyi.framework.security.JwtTokenUtil;
import com.sanyi.framework.service.impl.UserService;

public class BaseController {
	/**
	 * 请求头部
	 */
	@Value("${jwt.header}")
	private String tokenHeader;
	/**
	 * 注入token工具
	 */
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	@Autowired
	UserService userService;
	/**
	 * 获取当前用户
	 * @param request 客户端请求对象
	 * @return
	 */
	public User getCurrentUser(HttpServletRequest request) {
		String token = request.getHeader(tokenHeader);
		String authToken = "";
		//如果token非空并且以“Bearer ”开头
		if (token != null && token.startsWith("Bearer ")) {
			authToken = token.substring(7);
		}
		return userService.findById(jwtTokenUtil.getCurrentUserId(authToken)).orElse(null);
	}
	public String  getCurrentUserId(HttpServletRequest request) {
		String token = request.getHeader(tokenHeader);
		String authToken = "";
		//如果token非空并且以“Bearer ”开头
		if (token != null && token.startsWith("Bearer ")) {
			authToken = token.substring(7);
		}
		return jwtTokenUtil.getCurrentUserId(authToken);
	}
}