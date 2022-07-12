package com.example.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.po.BKURI;
import com.example.service.BKURITimeService;

@Controller
public class BKURITimeController {
	@Autowired
	private BKURITimeService bkuriTimeService;
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("selectByTime.action")
	public String selectBKURIByTime(HttpServletRequest req, Map<String, Object> map) throws ParseException {
		String STIME1 = req.getParameter("STIME");
//		System.out.println(req.getParameter("aa"));
		String ETIME1 = req.getParameter("ETIME");
		/*
		 * SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		 * System.out.println("ETIME1"+ETIME1); System.out.println("STIME"+STIME1);
		 * System.out.println("@@"+format.parseObject(ETIME1)); Long STIME =
		 * format.parse(STIME1).getTime()/1000L; Long ETIME =
		 * format.parse(ETIME1).getTime()/1000L;
		 */
		List<BKURI> bkuriList = bkuriTimeService.selectBKURIByTime(STIME1, ETIME1);
		map.put("bkuriList", bkuriList);
		return "page2";
	}
}
