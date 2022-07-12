package com.example.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.po.MyAPP;
import com.example.service.APPInfoService;
import com.example.service.CardService;

@Controller
public class CardController {
	@Autowired
	public CardService cardService;
	@Autowired
	public APPInfoService APPInfoService;
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	
//	---------------------------------卡类型转换处理---------------------------------
	@RequestMapping("card.change.post")
	public String cardChangePost(HttpServletRequest req,Map<String, Object> map) {
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		return "CardChange";
	}
	
	@RequestMapping("card.change.search.application")
	public String cardChangeSearchApplication(HttpServletRequest req,Map<String, Object> map) {
		
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		String CSTID = req.getParameter("CSTID");
		
		MyAPP APP = APPInfoService.searchAPP(CSTID);
		if(APP==null) {
			map.put("msg", "该用户不存在！");
			return "APPInfoSearch";
		}
		
		String ETC = APPInfoService.searchETC(CSTID);
		APP.setETCFLG(ETC);
		
//		logger.error(APP.CRDSHUCD);
//		个人正在使用卡类型
//		判断的J后面要加空格（），从数据库中取出来CRDSHUCD是两位的
		if(APP.CRDSHUCD.equals("J ")) {
			map.put("CRDSHUCD_url", "JCBw.gif");
		}else if(APP.CRDSHUCD.equals("M ")){
			map.put("CRDSHUCD_url", "master_2.jpg");
		}else {
			map.put("CRDSHUCD_url", "visa_2.jpg");
		}
		
//		logger.error(APP.KZKKBN);
//		家族正在使用卡类型
		if(APP.KZKKBN.equals("J")) {
			map.put("KZKKBN_url", "JCB法人.gif");
		}else if(APP.KZKKBN.equals("M")){
			map.put("KZKKBN_url", "master_1.jpg");
		}else {
			map.put("KZKKBN_url", "visa_1.jpg");
		}
		
//		logger.error(APP.ETCFLG);
//		ETC正在使用卡类型
		if(APP.ETCFLG.equals("1")) {
			map.put("ETCFLG_url", "etc.jpg");
		}else{
			map.put("ETCFLG_url", "etc_2.png");
		}
		
		map.put("APP", APP);	
		return "B1A01WE01A11_信用卡品牌转换申请";
	}

	@RequestMapping("card.change.application")
	public String cardChangeApplication(HttpServletRequest req,Map<String, Object> map) {
		
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		String CSTID = req.getParameter("CSTID");
		MyAPP APP = APPInfoService.searchAPP(CSTID);
		String ETC = APPInfoService.searchETC(CSTID);
		APP.setETCFLG(ETC);
		
//		个人正在使用卡类型
//		判断的J后面要加空格（），CRDSHUCD是两位的
		if(APP.CRDSHUCD.equals("J ")) {
			map.put("CRDSHUCD_url", "JCBw.gif");
		}else if(APP.CRDSHUCD.equals("M ")){
			map.put("CRDSHUCD_url", "master_2.jpg");
		}else {
			map.put("CRDSHUCD_url", "visa_2.jpg");
		}
		
//		家族正在使用卡类型
		if(APP.KZKKBN.equals("J")) {
			map.put("KZKKBN_url", "JCB法人.gif");
		}else if(APP.KZKKBN.equals("M")){
			map.put("KZKKBN_url", "master_1.jpg");
		}else {
			map.put("KZKKBN_url", "visa_1.jpg");
		}
		
//		logger.error(APP.ETCFLG);
//		ETC正在使用卡类型
		if(APP.ETCFLG.equals("1")) {
			map.put("ETCFLG_url", "etc.jpg");
		}else{
			map.put("ETCFLG_url", "etc_2.png");
		}
		
		
		
		MyAPP APPCard = new MyAPP();
		APPCard.setCRDSHUCD(req.getParameter("CRDSHUCD"));
		APPCard.setKZKKBN(req.getParameter("KZKKBN"));
//		个人选择卡类型	,获取的数据不是从数据库中拿出的，所以就是单个字符，无需添加空格	
		if(APPCard.CRDSHUCD.equals("J")) {
			map.put("CRDSHUCD_card_url", "JCBw.gif");
		}else if(APPCard.CRDSHUCD.equals("M")){
			map.put("CRDSHUCD_card_url", "master_2.jpg");
		}else {
			map.put("CRDSHUCD_card_url", "visa_2.jpg");
		}
	
		
//		家族选择卡类型
		if(APPCard.KZKKBN.equals("J")) {
			map.put("KZKKBN_card_url", "JCB法人.gif");
		}else if(APPCard.KZKKBN.equals("M")){
			map.put("KZKKBN_card_url", "master_1.jpg");
		}else {
			map.put("KZKKBN_card_url", "visa_1.jpg");
		}
		
		map.put("APP", APP);
		map.put("APPCard", APPCard);
		
		return "B1A01WE01A11_信用卡品牌转换确认";
	}
	
	@RequestMapping("change.card")
	public String changeCard(HttpServletRequest req,Map<String, Object> map) {
		
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		String CSTID = req.getParameter("CSTID");
		MyAPP APP = APPInfoService.searchAPP(CSTID);
		APP.setCRDSHUCD(req.getParameter("CRDSHUCD"));
		APP.setKZKKBN(req.getParameter("KZKKBN"));
		
//		logger.error(APP.CRDSHUCD);
//		logger.error(APP.KZKKBN);
		
		int i =cardService.changeCard(APP);
		if(i>0) {
			map.put("msg", "修改成功！");
		}else {
			map.put("msg", "修改失败！");
		}
		map.put("APP", APP);
		
		return "CardChangeResult";
	}
	
	
//	---------------------------------卡类型额度增加处理---------------------------------
	
	@RequestMapping("card.degree.add.post")
	public String cardDegreeAddPost(HttpServletRequest req,Map<String, Object> map) {
		
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		return "CardDegreeAdd";
	}
	
	@RequestMapping("card.degree.add.application")
	public String cardDegreeAddApplication(HttpServletRequest req,Map<String, Object> map) {
		
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		String CSTID = req.getParameter("CSTID");
		
		MyAPP APP = APPInfoService.searchAPP(CSTID);
		if(APP==null) {
			map.put("msg", "该用户不存在！");
			return "APPInfoSearch";
		}
		
		map.put("APP", APP);	
		return "B1A01WG01A01_信用卡额度增加申请";
	}

	@RequestMapping("card.degree.add.confirm")
	public String cardDegreeAddConfirm(HttpServletRequest req,Map<String, Object> map) {
		
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		String CSTID = req.getParameter("CSTID");
		MyAPP APP = APPInfoService.searchAPP(CSTID);
		
		APP.setSYOKBN(req.getParameter("SYOKBN"));
		
		APP.setSPGTORKBN(req.getParameter("SPGTORKBN"));
		APP.setSPGKBN(req.getParameter("SPGKBN"));
		APP.setCSGKBN(req.getParameter("CSGKBN"));
		APP.setSYOKBN(req.getParameter("TORKBN"));
		
		map.put("APP", APP);
		
		return "B1A01WG01A11_信用卡额度增加确认"; 
		
	}

	@RequestMapping("degree.add.card")
	public String DegreeAddCard(HttpServletRequest req,Map<String, Object> map) {
		
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		String CSTID = req.getParameter("CSTID");
		MyAPP APP = APPInfoService.searchAPP(CSTID);
		
		APP.setSYOKBN(req.getParameter("SYOKBN"));
		
		APP.setSPGTORKBN(req.getParameter("SPGTORKBN"));
		APP.setSPGKBN(req.getParameter("SPGKBN"));
		APP.setCSGKBN(req.getParameter("CSGKBN"));
		APP.setTORKBN(req.getParameter("TORKBN"));
		
		int i = cardService.degreeAddCard(APP);
		if(i>0) {
			map.put("msg", "申请成功！");
		}else {
			map.put("msg", "申请失败！");
		}
		map.put("APP", APP);
		
		return "CardDegreeAddResult";
	}
	
	
//	---------------------------------解约处理---------------------------------
	@RequestMapping("card.delete.post")
	public String cardDeletePost(HttpServletRequest req,Map<String, Object> map) {
		
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		return "B1A01WJ01A11_信用卡解约申请";
	}
	
	@RequestMapping("card.delete.application")
	public String cardDeleteApplication(HttpServletRequest req,Map<String, Object> map) {
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		String CSTID = req.getParameter("CSTID");
		
		MyAPP APP = APPInfoService.searchAPP(CSTID);
		if(APP==null) {
			map.put("msg", "该用户不存在！");
			return "APPInfoSearch";
		}
		
		String ETC = APPInfoService.searchETC(CSTID);
		APP.setETCFLG(ETC);
		
//		logger.error(APP.CRDSHUCD);
//		个人正在使用卡类型
//		判断的J后面要加空格（），从数据库中取出来CRDSHUCD是两位的
		if(APP.CRDSHUCD.equals("J ")) {
			map.put("CRDSHUCD_url", "JCBw.gif");
		}else if(APP.CRDSHUCD.equals("M ")){
			map.put("CRDSHUCD_url", "master_2.jpg");
		}else {
			map.put("CRDSHUCD_url", "visa_2.jpg");
		}
		
//		logger.error(APP.KZKKBN);
//		家族正在使用卡类型
		if(APP.KZKKBN.equals("J")) {
			map.put("KZKKBN_url", "JCB法人.gif");
		}else if(APP.KZKKBN.equals("M")){
			map.put("KZKKBN_url", "master_1.jpg");
		}else {
			map.put("KZKKBN_url", "visa_1.jpg");
		}
		
//		logger.error(APP.ETCFLG);
//		ETC正在使用卡类型
		if(APP.ETCFLG.equals("1")) {
			map.put("ETCFLG_url", "etc.jpg");
		}else{
			map.put("ETCFLG_url", "etc_2.png");
		}
		
		map.put("APP", APP);	
		return "B1A01WJ01A11_信用卡解约确认";
		
	}
	
	@RequestMapping("card.delete")
	public String cardDelete(HttpServletRequest req,Map<String, Object> map) {
		
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		String CSTID = req.getParameter("CSTID");
		int i = cardService.cardDelete(CSTID);
		cardService.cardDeleteCST(CSTID);
		if(i>0) {
			map.put("msg", "解约成功！");
		}else {
			map.put("msg", "解约失败！");
		}
		
		map.put("CSTID", CSTID);	
		
		return"CardDeleteResult";
	}
	

}
