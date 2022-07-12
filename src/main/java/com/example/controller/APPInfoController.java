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

@Controller
public class APPInfoController {
	
	@Autowired
	private APPInfoService APPInfoService;
	Logger logger = LoggerFactory.getLogger(getClass());
	
	
//	个人信息查询查找
	@RequestMapping("search.post")
	public String searchPost(HttpServletRequest req,Map<String, Object> map) {	
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		return "APPInfoSearch";
	}

	@RequestMapping("search.person")
	public String searchPerson(HttpServletRequest req,Map<String, Object> map) {
		
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		String CSTID = req.getParameter("CSTID");
//		logger.error(CSTID);
		
		MyAPP APP = APPInfoService.searchAPP(CSTID);
		if(APP==null) {
			map.put("msg", "该用户不存在！");
			return "APPInfoSearch";
		}
		
		String ETC = APPInfoService.searchETC(CSTID);
		APP.setETCFLG(ETC);
		
//		logger.error(APP.CRDSHUCD);
//		个人正在使用卡类型
//		判断的J后面要加空格（），CRDSHUCD是两位的
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
		return "B1A01WA01A01_个人信息查询";
	}
	
//	个人信息修改
	@RequestMapping("APPInfo.change.post")
	public String changePost(HttpServletRequest req,Map<String, Object> map) {	
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		return "APPInfoChange";
	}
	
	@RequestMapping("APPInfo.change.search.application")
	public String APPInfoChangeSearchApplication(HttpServletRequest req,Map<String, Object> map) {
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		String CSTID = req.getParameter("CSTID");	
		
		MyAPP APP = APPInfoService.searchAPP(CSTID);
		if(APP==null) {
			map.put("msg", "该用户不存在！");
			return "APPInfoSearch";
		}
		map.put("APP", APP);
		return "B1A01WH01A01_个人信息变更申请";
	}
	
	@RequestMapping("APPInfo.change.application")
	public String APPInfoChangeApplication(HttpServletRequest req,Map<String, Object> map) {
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		MyAPP APP = new MyAPP();
		APP.setCSTID(req.getParameter("CSTID"));
		
		APP.setPHO(req.getParameter("PHO"));
		APP.setSEIKJ(req.getParameter("SEIKJ"));
		APP.setMEIKJ(req.getParameter("MEIKJ"));
		APP.setSEIKN(req.getParameter("SEIKN"));
		APP.setMEIKN(req.getParameter("MEIKN"));
		
		APP.setSEIEN(req.getParameter("SEIEN"));
		APP.setMEIEN(req.getParameter("MEIEN"));
		APP.setJKYSBT(req.getParameter("JKYSBT"));
		APP.setTEL(req.getParameter("TEL"));
		APP.setPOST(req.getParameter("POST"));
		
		APP.setKNC(req.getParameter("KNC"));
		APP.setJSKJ1(req.getParameter("JSKJ1"));
		APP.setJSKJ2(req.getParameter("JSKJ2"));
		APP.setJSKN1(req.getParameter("JSKN1"));
		APP.setJSKN2(req.getParameter("JSKN2"));
		
		APP.setDRIVERID(req.getParameter("DRIVERID"));
		APP.setKKHCD(req.getParameter("KKHCD"));
		APP.setHGSUMK(req.getParameter("HGSUMK"));
		APP.setKZKMLFLG(req.getParameter("KZKMLFLG"));
		APP.setCAMMLFLG(req.getParameter("CAMMLFLG"));
		
		APP.setHNNHHUCD(req.getParameter("HNNHHUCD"));
		APP.setHNNFLG(req.getParameter("HNNFLG"));
		APP.setKZKFLG(req.getParameter("KZKFLG"));
		APP.setGYOCD(req.getParameter("GYOCD"));
		APP.setKMS(req.getParameter("KMS"));
		
		APP.setKMSDEP(req.getParameter("KMSDEP"));
		APP.setKMSTEL(req.getParameter("KMSTEL"));
		APP.setKMSJS1(req.getParameter("KMSJS1"));
		APP.setKMSJS2(req.getParameter("KMSJS2"));
		APP.setNSHYM(req.getParameter("NSHYM"));
		
		APP.setNSG(req.getParameter("NSG"));
		APP.setKZKSEIKJ(req.getParameter("KZKSEIKJ"));
		APP.setKZKMEIKJ(req.getParameter("KZKMEIKJ"));
		APP.setKZKSEIKN(req.getParameter("KZKSEIKN"));
		APP.setKZKMEIKN(req.getParameter("KZKMEIKN"));
		
		APP.setKZKSEIEN(req.getParameter("KZKSEIEN"));
		APP.setKZKMEIEN(req.getParameter("KZKMEIEN"));
		APP.setKZKSEX(req.getParameter("KZKSEX"));
		APP.setKZKGYOCD(req.getParameter("KZKGYOCD"));
		APP.setKZKKMS(req.getParameter("KZKKMS"));
		
		APP.setKZKKMSDEP(req.getParameter("KZKKMSDEP"));
		APP.setKZKKMSTEL(req.getParameter("KZKKMSTEL"));
		
		map.put("APP",APP);
		map.put("REQID","0");
		
		return "B1A01WH01A11_个人信息变更确认";
	}

	
		
	@RequestMapping("change.person")
	public String changePerson(HttpServletRequest req,Map<String, Object> map) {
		
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		MyAPP APP = new MyAPP();
		APP.setCSTID(req.getParameter("CSTID"));
		
		APP.setPHO(req.getParameter("PHO"));
		APP.setSEIKJ(req.getParameter("SEIKJ"));
		APP.setMEIKJ(req.getParameter("MEIKJ"));
		APP.setSEIKN(req.getParameter("SEIKN"));
		APP.setMEIKN(req.getParameter("MEIKN"));
		
		APP.setSEIEN(req.getParameter("SEIEN"));
		APP.setMEIEN(req.getParameter("MEIEN"));
		APP.setJKYSBT(req.getParameter("JKYSBT"));
		APP.setTEL(req.getParameter("TEL"));
		APP.setPOST(req.getParameter("POST"));
		
		APP.setJSKJ1(req.getParameter("JSKJ1"));
		APP.setJSKJ2(req.getParameter("JSKJ2"));
		APP.setJSKN1(req.getParameter("JSKN1"));
		APP.setJSKN2(req.getParameter("JSKN2"));
		
		APP.setDRIVERID(req.getParameter("DRIVERID"));
		APP.setKKHCD(req.getParameter("KKHCD"));
		APP.setHGSUMK(req.getParameter("HGSUMK"));
		APP.setKZKMLFLG(req.getParameter("KZKMLFLG"));
		APP.setCAMMLFLG(req.getParameter("CAMMLFLG"));
		
		APP.setHNNHHUCD(req.getParameter("HNNHHUCD"));
		APP.setHNNFLG(req.getParameter("HNNFLG"));
		APP.setKZKFLG(req.getParameter("KZKFLG"));
		APP.setGYOCD(req.getParameter("GYOCD"));
		APP.setKMS(req.getParameter("KMS"));
		
		APP.setKMSDEP(req.getParameter("KMSDEP"));
		APP.setKMSTEL(req.getParameter("KMSTEL"));
		APP.setKMSJS1(req.getParameter("KMSJS1"));
		APP.setKMSJS2(req.getParameter("KMSJS2"));
		APP.setNSHYM(req.getParameter("NSHYM"));
		
		APP.setNSG(req.getParameter("NSG"));
		APP.setKZKSEIKJ(req.getParameter("KZKSEIKJ"));
		APP.setKZKMEIKJ(req.getParameter("KZKMEIKJ"));
		APP.setKZKSEIKN(req.getParameter("KZKSEIKN"));
		APP.setKZKMEIKN(req.getParameter("KZKMEIKN"));
		
		APP.setKZKSEIEN(req.getParameter("KZKSEIEN"));
		APP.setKZKMEIEN(req.getParameter("KZKMEIEN"));
		APP.setKZKSEX(req.getParameter("KZKSEX"));
		APP.setKZKGYOCD(req.getParameter("KZKGYOCD"));
		APP.setKZKKMS(req.getParameter("KZKKMS"));
		
		APP.setKZKKMSDEP(req.getParameter("KZKKMSDEP"));
		APP.setKZKKMSTEL(req.getParameter("KZKKMSTEL"));
		
		
		
//		日志
//		logger.error(APP.CSTID);
//		logger.error(APP.PHO);
//		logger.error(APP.SEIKJ);
//		logger.error(APP.MEIKJ);
//		logger.error(APP.SEIKN);
//		logger.error(APP.MEIKN);
//
//		logger.error(APP.SEIEN);
//		logger.error(APP.MEIEN);
//		logger.error(APP.JKYSBT);
//		logger.error(APP.TEL);
//		logger.error(APP.POST);
//
//		logger.error(APP.JSKJ1);
//		logger.error(APP.JSKJ2);
//		logger.error(APP.JSKN1);
//		logger.error(APP.JSKN2);
//
//		logger.error(APP.DRIVERID);
//		logger.error(APP.KKHCD);
//		logger.error(APP.HGSUMK);
//		logger.error(APP.KZKMLFLG);
//		logger.error(APP.CAMMLFLG);
//
//		logger.error(APP.HNNHHUCD);
//		logger.error(APP.HNNFLG);
//		logger.error(APP.KZKFLG);
//		logger.error(APP.GYOCD);
//		logger.error(APP.KMS);
//
//		logger.error(APP.KMSDEP);
//		logger.error(APP.KMSTEL);
//		logger.error(APP.KMSJS1);
//		logger.error(APP.KMSJS2);
//		logger.error(APP.NSHYM);
//
//		logger.error(APP.NSG);
//		logger.error(APP.KZKSEIKJ);
//		logger.error(APP.KZKMEIKJ);
//		logger.error(APP.KZKSEIKN);
//		logger.error(APP.KZKMEIKN);
//
//		logger.error(APP.KZKSEIEN);logger.error(APP.CSTID);
//		logger.error(APP.KZKMEIEN);
//		logger.error(APP.KZKSEX);
//		logger.error(APP.KZKGYOCD);
//		logger.error(APP.KZKKMS);
//
//		logger.error(APP.KZKKMSDEP);
//		logger.error(APP.KZKKMSTEL);
//		
		
		int i = APPInfoService.changeAPP(APP);
		if(i>0) {
			map.put("msg", "修改成功！");
		}else {
			map.put("msg", "修改失败！");
		}
		map.put("APP",APP);
		return "APPInfoChangeResult";
	}
}








