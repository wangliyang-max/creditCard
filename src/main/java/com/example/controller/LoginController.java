package com.example.controller;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.po.MyADMINS;
import com.example.po.MyUSERS;
import com.example.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	Logger logger = LoggerFactory.getLogger(getClass());

//	用户登录
	//请求请求
	@RequestMapping("user.login.request")
	public String userLogin(HttpServletRequest req) {
		return "UserLogin";
	}
	//	验证登录
	@RequestMapping("user.login")
	public String userLogin(HttpServletRequest req,Map<String, Object> map) {
		String CSTID = req.getParameter("CSTID");
		String PASSWORD = req.getParameter("PASSWORD");
		
		MyUSERS user = loginService.getUserPassword(CSTID);
		if(user == null) {
			map.put("msg", "该用户不存在!");
			return "UserLogin";
		}
		
		if(PASSWORD.equals(user.PASSWORD)) {
			map.put("CSTID", CSTID);	
			return "UserIndex";
		}else {
			map.put("msg", "用户名或密码错误!");
			return "UserLogin";
		}
	}
	 
		
		
		
		
		
//		管理员登陆
	
	@RequestMapping("admin.login.request")
	public String adminLoginRequest(HttpServletRequest req) {		
		return "AdminLogin";
	}
	//	验证登录
	@RequestMapping("admin.login")
	public String adminLogin(HttpServletRequest req,Map<String, Object> map) {
		String ADMINID = req.getParameter("ADMINID");
		String PASSWORD = req.getParameter("PASSWORD");
		
		MyADMINS admin = loginService.getAdminPassword(ADMINID);
		if(admin == null) {
			map.put("msg", "该用户不存在!");
			return "AdminLogin";
		}
		
		if(PASSWORD.equals(admin.PASSWORD)) {
			
			map.put("ADMINID","11111111111111");
			map.put("CSTID","0");
			return "AdminIndex";
//			return "MemberIndex";
		}else {
			map.put("msg", "用户名或密码错误!");
			return "AdminLogin";
		}
	}

}

