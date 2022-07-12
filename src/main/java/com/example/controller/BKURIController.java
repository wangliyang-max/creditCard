package com.example.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.po.BKURI;
import com.example.service.BKURIService;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;


@Controller
public class BKURIController {
	
	@Autowired
	private BKURIService bkuriService;
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("selectByYear.action")
	public String selectBKURIByYear(HttpServletRequest req, Map<String, Object> map) {
		List<BKURI> bkuriList = bkuriService.selectBKURIByYear(req.getParameter("CSTID"));
		map.put("bkuriList", bkuriList);
		return "C1A01WA01A01_年間請求一覧";
	}
	
	
}
