package com.example.controller;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.po.CRD;
import com.example.service.CardInfoService;

@Controller
public class CardInfoController {

	@Autowired
	private CardInfoService cardInfoService;

	Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping("selectCard.action")
	public String selectCardInfo(HttpServletRequest req, Map<String, Object> map) {
		System.out.println("@@@"+req.getParameter("CSTID"));
		CRD crd = cardInfoService.selectCardInfo(req.getParameter("CSTID"));
		System.out.println("%%%"+crd);
		map.put("crd", crd);
		return "C1A01WA01A21_ご決済情報照会";
	}


}
