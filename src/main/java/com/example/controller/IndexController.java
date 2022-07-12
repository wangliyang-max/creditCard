package com.example.controller;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
	
	Logger logger = LoggerFactory.getLogger(getClass());
//	index
	@RequestMapping("index")
	public String index(HttpServletRequest req) {		
		return "index";
	}	
	
//用户首页	
	@RequestMapping("user.index")
	public String userIndex(HttpServletRequest req,Map<String, Object> map) {
		String CSTID = req.getParameter("CSTID");
		map.put("CSTID",CSTID);
		return "UserIndex";
	}
	
//	管理员首页
	@RequestMapping("admin.index")
	public String adminIndex(HttpServletRequest req,Map<String, Object> map) {
		String CSTID = req.getParameter("CSTID");
		String ADMINID = req.getParameter("ADMINID");
		map.put("CSTID",CSTID);
		map.put("ADMINID",ADMINID);
		
		return "AdminIndex";
	}
	
	//会员管理Index
		@RequestMapping("MemberIndex")
		public String MemberIndex(HttpServletRequest req,Map<String, Object> map,@RequestParam String ID) {	
//			logger.error(ID);
			if(ID.equals("11111111111111")) {
				//管理员	
				map.put("ADMINID",ID);
				map.put("CSTID","0");
			}else {
				//用户			
				map.put("CSTID",ID);
				map.put("ADMINID","0");
			}
			return "MemberIndex";
		}
		
		//积分管理Index
		@RequestMapping("IndexJiFen")
		public String IndexJiFen(HttpServletRequest req,Map<String, Object> map) {	
			return "IndexJiFen";
		}
		//申请管理Index
		@RequestMapping("IndexShenQing")
		public String IndexShenQing(HttpServletRequest req,Map<String, Object> map) {	
			return "IndexShenQing";
		}
		//	资金管理	
		@RequestMapping("indexZiJin")
		public String IndexZiJin(HttpServletRequest req,Map<String, Object> map) {	
			return "indexZiJin";
		}
}

