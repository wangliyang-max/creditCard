package com.example.controller;


import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.po.MyADMINSRES;
import com.example.po.MyAPP;
import com.example.po.MyUSERSREQ;
import com.example.service.APPInfoService;
import com.example.service.ListService;

@Controller
public class ListController {
	@Autowired
	private ListService listService;
	@Autowired
	public APPInfoService APPInfoService;
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
//	--------------------页面显示和查询---------------------------
	
//	req.list
	@RequestMapping("user.req.list")
	public String userReqList(HttpServletRequest req,Map<String, Object> map) {
		String ADMINID = req.getParameter("ADMINID");
		String CSTID = req.getParameter("CSTID");
		map.put("ADMINID", ADMINID);
		map.put("CSTID", CSTID);
		
		List<MyUSERSREQ> usersReqList = listService.selectUsersReq(CSTID);
		map.put("usersReqList", usersReqList);
		
		return "UserReqList";
	}
	
//user.req.delete	
	@RequestMapping("user.req.delete")
	public String userReqDelete(HttpServletRequest req,Map<String, Object> map) {
		String REQID = req.getParameter("REQID");	
		listService.deleteUsersReq(REQID);
		
		String ADMINID = req.getParameter("ADMINID");
		String CSTID = req.getParameter("CSTID");
		map.put("ADMINID", ADMINID);
		map.put("CSTID", CSTID);
		
//		重新查询，将数据返回页面
		List<MyUSERSREQ> usersReqList = listService.selectUsersReq(CSTID);
		map.put("usersReqList", usersReqList);
	
		return "UserReqList";
	}
	
		
//	res.list
	@RequestMapping("admin.res.list")
	public String adminResList(HttpServletRequest req,Map<String, Object> map) {
		String ADMINID = req.getParameter("ADMINID");
		String CSTID = req.getParameter("CSTID");
		map.put("ADMINID", ADMINID);
		map.put("CSTID", CSTID);
		
		List<MyADMINSRES> adminsResList = listService.selectAdminsRes();
		map.put("adminsResList", adminsResList);
		
		return "AdminResList";
	}
	
//	admin.res.delete
	@RequestMapping("admin.res.delete")
	public String adminResDelete(HttpServletRequest req,Map<String, Object> map) {
		String RESID = req.getParameter("RESID");	
		listService.deleteAdminsRes(RESID);
		
		String ADMINID = req.getParameter("ADMINID");
		String CSTID = req.getParameter("CSTID");
		map.put("ADMINID", ADMINID);
		map.put("CSTID", CSTID);
		
		List<MyADMINSRES> adminsResList = listService.selectAdminsRes();
		map.put("adminsResList", adminsResList);
		
		return "AdminResList";
	}
	
	
	
//	--------------------REQ数据的插入（4个）---------------------------

//	change.person.req
	@RequestMapping("change.person.req")
	public String changePersonReq(HttpServletRequest req,Map<String, Object> map) {
		
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		MyUSERSREQ usersReq = new MyUSERSREQ();
		usersReq.setREQTYPE("个人信息变更申请");
		usersReq.setREQUSERID(req.getParameter("CSTID"));
		Date REQDATE=new Date();
		usersReq.setREQDATE(REQDATE);	
//		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
//		String REQDATEstring = format.format(REQDATE);
		usersReq.setREQSTATE("正在申请");
		
		
//		APP信息
		usersReq.setCSTID(req.getParameter("CSTID"));
		
		usersReq.setPHO(req.getParameter("PHO"));
		usersReq.setSEIKJ(req.getParameter("SEIKJ"));
		usersReq.setMEIKJ(req.getParameter("MEIKJ"));
		usersReq.setSEIKN(req.getParameter("SEIKN"));
		usersReq.setMEIKN(req.getParameter("MEIKN"));
		
		usersReq.setSEIEN(req.getParameter("SEIEN"));
		usersReq.setMEIEN(req.getParameter("MEIEN"));
		usersReq.setJKYSBT(req.getParameter("JKYSBT"));
		usersReq.setTEL(req.getParameter("TEL"));
		usersReq.setPOST(req.getParameter("POST"));
		
		usersReq.setJSKJ1(req.getParameter("JSKJ1"));
		usersReq.setJSKJ2(req.getParameter("JSKJ2"));
		usersReq.setJSKN1(req.getParameter("JSKN1"));
		usersReq.setJSKN2(req.getParameter("JSKN2"));
		
		usersReq.setDRIVERID(req.getParameter("DRIVERID"));
		usersReq.setKKHCD(req.getParameter("KKHCD"));
		usersReq.setHGSUMK(req.getParameter("HGSUMK"));
		usersReq.setKZKMLFLG(req.getParameter("KZKMLFLG"));
		usersReq.setCAMMLFLG(req.getParameter("CAMMLFLG"));
		
		usersReq.setHNNHHUCD(req.getParameter("HNNHHUCD"));
		usersReq.setHNNFLG(req.getParameter("HNNFLG"));
		usersReq.setKZKFLG(req.getParameter("KZKFLG"));
		usersReq.setGYOCD(req.getParameter("GYOCD"));
		usersReq.setKMS(req.getParameter("KMS"));
		
		usersReq.setKMSDEP(req.getParameter("KMSDEP"));
		usersReq.setKMSTEL(req.getParameter("KMSTEL"));
		usersReq.setKMSJS1(req.getParameter("KMSJS1"));
		usersReq.setKMSJS2(req.getParameter("KMSJS2"));
		usersReq.setNSHYM(req.getParameter("NSHYM"));
		
		usersReq.setNSG(req.getParameter("NSG"));
		usersReq.setKZKSEIKJ(req.getParameter("KZKSEIKJ"));
		usersReq.setKZKMEIKJ(req.getParameter("KZKMEIKJ"));
		usersReq.setKZKSEIKN(req.getParameter("KZKSEIKN"));
		usersReq.setKZKMEIKN(req.getParameter("KZKMEIKN"));
		
		usersReq.setKZKSEIEN(req.getParameter("KZKSEIEN"));
		usersReq.setKZKMEIEN(req.getParameter("KZKMEIEN"));
		usersReq.setKZKSEX(req.getParameter("KZKSEX"));
		usersReq.setKZKGYOCD(req.getParameter("KZKGYOCD"));
		usersReq.setKZKKMS(req.getParameter("KZKKMS"));
		
		usersReq.setKZKKMSDEP(req.getParameter("KZKKMSDEP"));
		usersReq.setKZKKMSTEL(req.getParameter("KZKKMSTEL"));

		map.put("UsersReq", usersReq);

		int i = listService.insertUsersReq(usersReq);
		
//		与insert语句中的<selectKey>标签相对应，先生成序号再插入，就可以通过usersReq.getREQID()获取REQID
//		<selectKey>实现自增长编号，与数据库中设置触发器效果相同
		System.out.println(usersReq.getREQID());
		System.out.println(usersReq.REQID);
		
		int j = listService.insertAdminRes(usersReq);
		
		if(i>0 && j>0) {
			map.put("msg", "申请成功！");
		}else {
			map.put("msg", "申请失败！");
		}
		
		return "UsersReqResult";
	}
	
//	add.card.req
	@RequestMapping("add.card.req")
	public String addCardReq(HttpServletRequest req,Map<String, Object> map) {
		
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		String CSTID = req.getParameter("CSTID");
		
		MyUSERSREQ usersReq = new MyUSERSREQ();
		usersReq.setREQTYPE("信用卡额度增加申请");
		usersReq.setREQUSERID(req.getParameter("CSTID"));
		Date REQDATE=new Date();
		usersReq.setREQDATE(REQDATE);	
//		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
//		String REQDATEstring = format.format(REQDATE);
		usersReq.setREQSTATE("正在申请");
		
		
		MyAPP APP = APPInfoService.searchAPP(CSTID);
//		APP信息
		usersReq.setCSTID(APP.CSTID);
		
		usersReq.setPHO(APP.PHO);
		usersReq.setSEIKJ(APP.SEIKJ);
		usersReq.setMEIKJ(APP.MEIKJ);
		usersReq.setSEIKN(APP.SEIKN);
		usersReq.setMEIKN(APP.MEIKN);
		
		usersReq.setSEIEN(APP.SEIEN);
		usersReq.setMEIEN(APP.MEIEN);
		usersReq.setJKYSBT(APP.JKYSBT);
		usersReq.setTEL(APP.TEL);
		usersReq.setPOST(APP.POST);
		
		usersReq.setJSKJ1(APP.JSKJ1);
		usersReq.setJSKJ2(APP.JSKJ2);
		usersReq.setJSKN1(APP.JSKN1);
		usersReq.setJSKN2(APP.JSKN2);
		
		usersReq.setDRIVERID(APP.DRIVERID);
		usersReq.setKKHCD(APP.KKHCD);
		usersReq.setHGSUMK(APP.HGSUMK);
		usersReq.setKZKMLFLG(APP.KZKMLFLG);
		usersReq.setCAMMLFLG(APP.CAMMLFLG);
		
		usersReq.setHNNHHUCD(APP.HNNHHUCD);
		usersReq.setHNNFLG(APP.HNNFLG);
		usersReq.setKZKFLG(APP.KZKFLG);
		usersReq.setGYOCD(APP.GYOCD);
		usersReq.setKMS(APP.KMS);
		
		usersReq.setKMSDEP(APP.KMSDEP);
		usersReq.setKMSTEL(APP.KMSTEL);
		usersReq.setKMSJS1(APP.KMSJS1);
		usersReq.setKMSJS2(APP.KMSJS2);
		usersReq.setNSHYM(APP.NSHYM);
		
		usersReq.setNSG(APP.NSG);
		usersReq.setKZKSEIKJ(APP.KZKSEIKJ);
		usersReq.setKZKMEIKJ(APP.KZKMEIKJ);
		usersReq.setKZKSEIKN(APP.KZKSEIKN);
		usersReq.setKZKMEIKN(APP.KZKMEIKN);
		
		usersReq.setKZKSEIEN(APP.KZKSEIEN);
		usersReq.setKZKMEIEN(APP.KZKMEIEN);
		usersReq.setKZKSEX(APP.KZKSEX);
		usersReq.setKZKGYOCD(APP.KZKGYOCD);
		usersReq.setKZKKMS(APP.KZKKMS);
		
		usersReq.setKZKKMSDEP(APP.KZKKMSDEP);
		usersReq.setKZKKMSTEL(APP.KZKKMSTEL);
		
		
//		更换额度
		usersReq.setSYOKBN(req.getParameter("SYOKBN"));
		
		usersReq.setSPGTORKBN(req.getParameter("SPGTORKBN"));
		usersReq.setSPGKBN(req.getParameter("SPGKBN"));
		usersReq.setCSGKBN(req.getParameter("CSGKBN"));
		usersReq.setTORKBN(req.getParameter("TORKBN"));

		map.put("UsersReq", usersReq);

		int i = listService.insertUsersReqKBN(usersReq);
		
		int j = listService.insertAdminResKBN(usersReq);
		
		if(i>0 && j>0) {
			map.put("msg", "申请成功！");
		}else {
			map.put("msg", "申请失败！");
		}
		
		return "UsersReqResult";
	}
	
//	card.change.req
	@RequestMapping("card.change.req")
	public String cardChangeReq(HttpServletRequest req,Map<String, Object> map) {
		
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		String CSTID = req.getParameter("CSTID");
		
		MyUSERSREQ usersReq = new MyUSERSREQ();
		usersReq.setREQTYPE("信用卡转化申请");
		usersReq.setREQUSERID(req.getParameter("CSTID"));
		Date REQDATE=new Date();
		usersReq.setREQDATE(REQDATE);	
//		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
//		String REQDATEstring = format.format(REQDATE);
		usersReq.setREQSTATE("正在申请");
		
		
		MyAPP APP = APPInfoService.searchAPP(CSTID);
//		APP信息
		usersReq.setCSTID(APP.CSTID);
		
		usersReq.setPHO(APP.PHO);
		usersReq.setSEIKJ(APP.SEIKJ);
		usersReq.setMEIKJ(APP.MEIKJ);
		usersReq.setSEIKN(APP.SEIKN);
		usersReq.setMEIKN(APP.MEIKN);
		
		usersReq.setSEIEN(APP.SEIEN);
		usersReq.setMEIEN(APP.MEIEN);
		usersReq.setJKYSBT(APP.JKYSBT);
		usersReq.setTEL(APP.TEL);
		usersReq.setPOST(APP.POST);
		
		usersReq.setJSKJ1(APP.JSKJ1);
		usersReq.setJSKJ2(APP.JSKJ2);
		usersReq.setJSKN1(APP.JSKN1);
		usersReq.setJSKN2(APP.JSKN2);
		
		usersReq.setDRIVERID(APP.DRIVERID);
		usersReq.setKKHCD(APP.KKHCD);
		usersReq.setHGSUMK(APP.HGSUMK);
		usersReq.setKZKMLFLG(APP.KZKMLFLG);
		usersReq.setCAMMLFLG(APP.CAMMLFLG);
		
		usersReq.setHNNHHUCD(APP.HNNHHUCD);
		usersReq.setHNNFLG(APP.HNNFLG);
		usersReq.setKZKFLG(APP.KZKFLG);
		usersReq.setGYOCD(APP.GYOCD);
		usersReq.setKMS(APP.KMS);
		
		usersReq.setKMSDEP(APP.KMSDEP);
		usersReq.setKMSTEL(APP.KMSTEL);
		usersReq.setKMSJS1(APP.KMSJS1);
		usersReq.setKMSJS2(APP.KMSJS2);
		usersReq.setNSHYM(APP.NSHYM);
		
		usersReq.setNSG(APP.NSG);
		usersReq.setKZKSEIKJ(APP.KZKSEIKJ);
		usersReq.setKZKMEIKJ(APP.KZKMEIKJ);
		usersReq.setKZKSEIKN(APP.KZKSEIKN);
		usersReq.setKZKMEIKN(APP.KZKMEIKN);
		
		usersReq.setKZKSEIEN(APP.KZKSEIEN);
		usersReq.setKZKMEIEN(APP.KZKMEIEN);
		usersReq.setKZKSEX(APP.KZKSEX);
		usersReq.setKZKGYOCD(APP.KZKGYOCD);
		usersReq.setKZKKMS(APP.KZKKMS);
		
		usersReq.setKZKKMSDEP(APP.KZKKMSDEP);
		usersReq.setKZKKMSTEL(APP.KZKKMSTEL);
		
		
//		卡片类型
		usersReq.setCRDSHUCD(req.getParameter("CRDSHUCD"));
		usersReq.setKZKKBN(req.getParameter("KZKKBN"));
		

		map.put("UsersReq", usersReq);

		int i = listService.insertUsersReqCardChange(usersReq);
		
		int j = listService.insertAdminResCardChange(usersReq);
		
		if(i>0 && j>0) {
			map.put("msg", "申请成功！");
		}else {
			map.put("msg", "申请失败！");
		}
		
		return "UsersReqResult";
	}
	
//	app.delete.req
	@RequestMapping("app.delete.req")
	public String appDeleteReq(HttpServletRequest req,Map<String, Object> map) {
		
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		String CSTID = req.getParameter("CSTID");
		
		MyUSERSREQ usersReq = new MyUSERSREQ();
		usersReq.setREQTYPE("信用卡解约申请");
		usersReq.setREQUSERID(CSTID);
		Date REQDATE=new Date();
		usersReq.setREQDATE(REQDATE);	
//		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
//		String REQDATEstring = format.format(REQDATE);
		usersReq.setREQSTATE("正在申请");
		
		map.put("UsersReq", usersReq);
		
		int i = listService.insertUsersReqDelete(usersReq);
		int j = listService.insertAdminResDelete(usersReq);
		
		if(i>0 && j>0) {
			map.put("msg", "申请成功！");
		}else {
			map.put("msg", "申请失败！");
		}
		
		return "UsersReqResult";
	}
	
	
//	--------------------编号详细信息的显示（用户）---------------------------	
//	查看详细信息
	//个人信息变更add.card.confirm.page.user
	@RequestMapping("change.person.confirm.page.user")
	public String changePersonConfirmPageUser(HttpServletRequest req,Map<String, Object> map) {

		String REQID = req.getParameter("REQID");
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		MyUSERSREQ usersReq = listService.selectUsersReqByRegId(REQID);
		
		MyAPP APP = new MyAPP();
		APP.setCSTID(usersReq.CSTID);
		
		APP.setPHO(usersReq.PHO);
		APP.setSEIKJ(usersReq.SEIKJ);
		APP.setMEIKJ(usersReq.MEIKJ);
		APP.setSEIKN(usersReq.SEIKN);
		APP.setMEIKN(usersReq.MEIKN);
		
		APP.setSEIEN(usersReq.SEIEN);
		APP.setMEIEN(usersReq.MEIEN);
		APP.setJKYSBT(usersReq.JKYSBT);
		APP.setTEL(usersReq.TEL);
		APP.setPOST(usersReq.POST);
		
		APP.setKNC(usersReq.KNC);
		APP.setJSKJ1(usersReq.JSKJ1);
		APP.setJSKJ2(usersReq.JSKJ2);
		APP.setJSKN1(usersReq.JSKN1);
		APP.setJSKN2(usersReq.JSKN2);
		
		APP.setDRIVERID(usersReq.DRIVERID);
		APP.setKKHCD(usersReq.KKHCD);
		APP.setHGSUMK(usersReq.HGSUMK);
		APP.setKZKMLFLG(usersReq.KZKMLFLG);
		APP.setCAMMLFLG(usersReq.CAMMLFLG);
		
		APP.setHNNHHUCD(usersReq.HNNHHUCD);
		APP.setHNNFLG(usersReq.HNNFLG);
		APP.setKZKFLG(usersReq.KZKFLG);
		APP.setGYOCD(usersReq.GYOCD);
		APP.setKMS(usersReq.KMS);
		
		APP.setKMSDEP(usersReq.KMSDEP);
		APP.setKMSTEL(usersReq.KMSTEL);
		APP.setKMSJS1(usersReq.KMSJS1);
		APP.setKMSJS2(usersReq.KMSJS2);
		APP.setNSHYM(usersReq.NSHYM);
		
		APP.setNSG(usersReq.NSG);
		APP.setKZKSEIKJ(usersReq.KZKSEIKJ);
		APP.setKZKMEIKJ(usersReq.KZKMEIKJ);
		APP.setKZKSEIKN(usersReq.KZKSEIKN);
		APP.setKZKMEIKN(usersReq.KZKMEIKN);
		
		APP.setKZKSEIEN(usersReq.KZKSEIEN);
		APP.setKZKMEIEN(usersReq.KZKMEIEN);
		APP.setKZKSEX(usersReq.KZKSEX);
		APP.setKZKGYOCD(usersReq.KZKGYOCD);
		APP.setKZKKMS(usersReq.KZKKMS);
		
		APP.setKZKKMSDEP(usersReq.KZKKMSDEP);
		APP.setKZKKMSTEL(usersReq.KZKKMSTEL);
		
		map.put("APP",APP);
		map.put("REQID",REQID);
		
		
		return "B1A01WH01A11_个人信息变更确认";
	}
//	查看详细信息
	//卡额度变更
	@RequestMapping("add.card.confirm.page.user")
	public String addCardConfirmPageUser(HttpServletRequest req,Map<String, Object> map) {
		
		String REQID = req.getParameter("REQID");
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		MyUSERSREQ usersReq = listService.selectUsersReqByRegId(REQID);
		
		MyAPP APP = new MyAPP();
		APP.setCSTID(usersReq.CSTID);
		
		APP.setPHO(usersReq.PHO);
		APP.setSEIKJ(usersReq.SEIKJ);
		APP.setMEIKJ(usersReq.MEIKJ);
		APP.setSEIKN(usersReq.SEIKN);
		APP.setMEIKN(usersReq.MEIKN);
		
		APP.setSEIEN(usersReq.SEIEN);
		APP.setMEIEN(usersReq.MEIEN);
		APP.setJKYSBT(usersReq.JKYSBT);
		APP.setTEL(usersReq.TEL);
		APP.setPOST(usersReq.POST);
		
		APP.setKNC(usersReq.KNC);
		APP.setJSKJ1(usersReq.JSKJ1);
		APP.setJSKJ2(usersReq.JSKJ2);
		APP.setJSKN1(usersReq.JSKN1);
		APP.setJSKN2(usersReq.JSKN2);
		
		APP.setDRIVERID(usersReq.DRIVERID);
		APP.setKKHCD(usersReq.KKHCD);
		APP.setHGSUMK(usersReq.HGSUMK);
		APP.setKZKMLFLG(usersReq.KZKMLFLG);
		APP.setCAMMLFLG(usersReq.CAMMLFLG);
		
		APP.setHNNHHUCD(usersReq.HNNHHUCD);
		APP.setHNNFLG(usersReq.HNNFLG);
		APP.setKZKFLG(usersReq.KZKFLG);
		APP.setGYOCD(usersReq.GYOCD);
		APP.setKMS(usersReq.KMS);
		
		APP.setKMSDEP(usersReq.KMSDEP);
		APP.setKMSTEL(usersReq.KMSTEL);
		APP.setKMSJS1(usersReq.KMSJS1);
		APP.setKMSJS2(usersReq.KMSJS2);
		APP.setNSHYM(usersReq.NSHYM);
		
		APP.setNSG(usersReq.NSG);
		APP.setKZKSEIKJ(usersReq.KZKSEIKJ);
		APP.setKZKMEIKJ(usersReq.KZKMEIKJ);
		APP.setKZKSEIKN(usersReq.KZKSEIKN);
		APP.setKZKMEIKN(usersReq.KZKMEIKN);
		
		APP.setKZKSEIEN(usersReq.KZKSEIEN);
		APP.setKZKMEIEN(usersReq.KZKMEIEN);
		APP.setKZKSEX(usersReq.KZKSEX);
		APP.setKZKGYOCD(usersReq.KZKGYOCD);
		APP.setKZKKMS(usersReq.KZKKMS);
		
		APP.setKZKKMSDEP(usersReq.KZKKMSDEP);
		APP.setKZKKMSTEL(usersReq.KZKKMSTEL);
		
		APP.setSYOKBN(usersReq.SYOKBN);
		
		APP.setSPGTORKBN(usersReq.SPGTORKBN);
		APP.setSPGKBN(usersReq.SPGKBN);
		APP.setCSGKBN(usersReq.CSGKBN);
		APP.setTORKBN(usersReq.TORKBN);
		
		map.put("APP",APP);
		map.put("REQID",REQID);
		
		return "B1A01WG01A11_信用卡额度增加确认";
	}
	
//	卡种类转变change.card.confirm.page.user
	@RequestMapping("change.card.confirm.page.user")
	public String changeCardConfirmPageUser(HttpServletRequest req,Map<String, Object> map) {

		
		String REQID = req.getParameter("REQID");
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		MyUSERSREQ usersReq = listService.selectUsersReqByRegId(REQID);
		String CSTID = usersReq.CSTID;
		
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
		
//		ETC正在使用卡类型
		if(APP.ETCFLG.equals("1")) {
			map.put("ETCFLG_url", "etc.jpg");
		}else{
			map.put("ETCFLG_url", "etc_2.png");
		}
		
		
		MyAPP APPCard = new MyAPP();
		APPCard.setCRDSHUCD(usersReq.CRDSHUCD);
		APPCard.setKZKKBN(usersReq.KZKKBN);
//		个人选择卡类型	,获取的数据不是从数据库中拿出的，所以就是单个字符，无需添加空格	
		if(APPCard.CRDSHUCD.equals("J ")) {
			map.put("CRDSHUCD_card_url", "JCBw.gif");
		}else if(APPCard.CRDSHUCD.equals("M ")){
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
		
		map.put("REQID",REQID);
		
		return "B1A01WE01A11_信用卡品牌转换确认";
	}

//	删除delete.app.confirm.page.user
	@RequestMapping("delete.app.confirm.page.user")
	public String deleteAppConfirmPageUser(HttpServletRequest req,Map<String, Object> map) {

		String REQID = req.getParameter("REQID");
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		MyUSERSREQ usersReq = listService.selectUsersReqByRegId(REQID);
		String CSTID = usersReq.REQUSERID;
		
		MyAPP APP = APPInfoService.searchAPP(CSTID);
		
		map.put("APP", APP);
		map.put("REQID",REQID);
		
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
		
		String ETC = APPInfoService.searchETC(CSTID);
		APP.setETCFLG(ETC);
		
//		logger.error(APP.ETCFLG);
//		ETC正在使用卡类型
		if(APP.ETCFLG.equals("1")) {
			map.put("ETCFLG_url", "etc.jpg");
		}else{
			map.put("ETCFLG_url", "etc_2.png");
		}
		
		return "B1A01WJ01A11_信用卡解约确认";
	}

	
//	--------------------编号详细信息的显示（管理员）---------------------------	
	@RequestMapping("change.person.confirm.page.admin")
	public String changePersonConfirmPageAdmin(HttpServletRequest req,Map<String, Object> map) {
		
		String RESID = req.getParameter("RESID");
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		MyADMINSRES adminRes = listService.selectAdminResByRegId(RESID);
		
		MyAPP APP = new MyAPP();
		APP.setCSTID(adminRes.CSTID);
		
		APP.setPHO(adminRes.PHO);
		APP.setSEIKJ(adminRes.SEIKJ);
		APP.setMEIKJ(adminRes.MEIKJ);
		APP.setSEIKN(adminRes.SEIKN);
		APP.setMEIKN(adminRes.MEIKN);
		
		APP.setSEIEN(adminRes.SEIEN);
		APP.setMEIEN(adminRes.MEIEN);
		APP.setJKYSBT(adminRes.JKYSBT);
		APP.setTEL(adminRes.TEL);
		APP.setPOST(adminRes.POST);
		
		APP.setKNC(adminRes.KNC);
		APP.setJSKJ1(adminRes.JSKJ1);
		APP.setJSKJ2(adminRes.JSKJ2);
		APP.setJSKN1(adminRes.JSKN1);
		APP.setJSKN2(adminRes.JSKN2);
		
		APP.setDRIVERID(adminRes.DRIVERID);
		APP.setKKHCD(adminRes.KKHCD);
		APP.setHGSUMK(adminRes.HGSUMK);
		APP.setKZKMLFLG(adminRes.KZKMLFLG);
		APP.setCAMMLFLG(adminRes.CAMMLFLG);
		
		APP.setHNNHHUCD(adminRes.HNNHHUCD);
		APP.setHNNFLG(adminRes.HNNFLG);
		APP.setKZKFLG(adminRes.KZKFLG);
		APP.setGYOCD(adminRes.GYOCD);
		APP.setKMS(adminRes.KMS);
		
		APP.setKMSDEP(adminRes.KMSDEP);
		APP.setKMSTEL(adminRes.KMSTEL);
		APP.setKMSJS1(adminRes.KMSJS1);
		APP.setKMSJS2(adminRes.KMSJS2);
		APP.setNSHYM(adminRes.NSHYM);
		
		APP.setNSG(adminRes.NSG);
		APP.setKZKSEIKJ(adminRes.KZKSEIKJ);
		APP.setKZKMEIKJ(adminRes.KZKMEIKJ);
		APP.setKZKSEIKN(adminRes.KZKSEIKN);
		APP.setKZKMEIKN(adminRes.KZKMEIKN);
		
		APP.setKZKSEIEN(adminRes.KZKSEIEN);
		APP.setKZKMEIEN(adminRes.KZKMEIEN);
		APP.setKZKSEX(adminRes.KZKSEX);
		APP.setKZKGYOCD(adminRes.KZKGYOCD);
		APP.setKZKKMS(adminRes.KZKKMS);
		
		APP.setKZKKMSDEP(adminRes.KZKKMSDEP);
		APP.setKZKKMSTEL(adminRes.KZKKMSTEL);
		
		map.put("APP",APP);
		map.put("REQID",RESID);
		
		
		return "B1A01WH01A11_个人信息变更确认";
	}
	
	@RequestMapping("add.card.confirm.page.admin")
	public String addCardConfirmPageAdmin(HttpServletRequest req,Map<String, Object> map) {
		
		String RESID = req.getParameter("RESID");
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		MyADMINSRES adminRes = listService.selectAdminResByRegId(RESID);
		
		MyAPP APP = new MyAPP();
		APP.setCSTID(adminRes.CSTID);
		
		APP.setPHO(adminRes.PHO);
		APP.setSEIKJ(adminRes.SEIKJ);
		APP.setMEIKJ(adminRes.MEIKJ);
		APP.setSEIKN(adminRes.SEIKN);
		APP.setMEIKN(adminRes.MEIKN);
		
		APP.setSEIEN(adminRes.SEIEN);
		APP.setMEIEN(adminRes.MEIEN);
		APP.setJKYSBT(adminRes.JKYSBT);
		APP.setTEL(adminRes.TEL);
		APP.setPOST(adminRes.POST);
		
		APP.setKNC(adminRes.KNC);
		APP.setJSKJ1(adminRes.JSKJ1);
		APP.setJSKJ2(adminRes.JSKJ2);
		APP.setJSKN1(adminRes.JSKN1);
		APP.setJSKN2(adminRes.JSKN2);
		
		APP.setDRIVERID(adminRes.DRIVERID);
		APP.setKKHCD(adminRes.KKHCD);
		APP.setHGSUMK(adminRes.HGSUMK);
		APP.setKZKMLFLG(adminRes.KZKMLFLG);
		APP.setCAMMLFLG(adminRes.CAMMLFLG);
		
		APP.setHNNHHUCD(adminRes.HNNHHUCD);
		APP.setHNNFLG(adminRes.HNNFLG);
		APP.setKZKFLG(adminRes.KZKFLG);
		APP.setGYOCD(adminRes.GYOCD);
		APP.setKMS(adminRes.KMS);
		
		APP.setKMSDEP(adminRes.KMSDEP);
		APP.setKMSTEL(adminRes.KMSTEL);
		APP.setKMSJS1(adminRes.KMSJS1);
		APP.setKMSJS2(adminRes.KMSJS2);
		APP.setNSHYM(adminRes.NSHYM);
		
		APP.setNSG(adminRes.NSG);
		APP.setKZKSEIKJ(adminRes.KZKSEIKJ);
		APP.setKZKMEIKJ(adminRes.KZKMEIKJ);
		APP.setKZKSEIKN(adminRes.KZKSEIKN);
		APP.setKZKMEIKN(adminRes.KZKMEIKN);
		
		APP.setKZKSEIEN(adminRes.KZKSEIEN);
		APP.setKZKMEIEN(adminRes.KZKMEIEN);
		APP.setKZKSEX(adminRes.KZKSEX);
		APP.setKZKGYOCD(adminRes.KZKGYOCD);
		APP.setKZKKMS(adminRes.KZKKMS);
		
		APP.setKZKKMSDEP(adminRes.KZKKMSDEP);
		APP.setKZKKMSTEL(adminRes.KZKKMSTEL);
		
		APP.setSYOKBN(adminRes.SYOKBN);
		
		APP.setSPGTORKBN(adminRes.SPGTORKBN);
		APP.setSPGKBN(adminRes.SPGKBN);
		APP.setCSGKBN(adminRes.CSGKBN);
		APP.setTORKBN(adminRes.TORKBN);
		
		map.put("APP",APP);
		map.put("REQID",RESID);
		
		return "B1A01WG01A11_信用卡额度增加确认";
	}
	
//	change.card.confirm.page.admin
	@RequestMapping("change.card.confirm.page.admin")
	public String changeCardConfirmPageAdmin(HttpServletRequest req,Map<String, Object> map) {

		
		String RESID = req.getParameter("RESID");
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		MyADMINSRES adminsRes = listService.selectAdminResByRegId(RESID);
		String CSTID = adminsRes.CSTID;
		
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
		
//		ETC正在使用卡类型
		if(APP.ETCFLG.equals("1")) {
			map.put("ETCFLG_url", "etc.jpg");
		}else{
			map.put("ETCFLG_url", "etc_2.png");
		}
		
		
		MyAPP APPCard = new MyAPP();
		APPCard.setCRDSHUCD(adminsRes.CRDSHUCD);
		APPCard.setKZKKBN(adminsRes.KZKKBN);
//		个人选择卡类型	,获取的数据不是从数据库中拿出的，所以就是单个字符，无需添加空格	
		if(APPCard.CRDSHUCD.equals("J ")) {
			map.put("CRDSHUCD_card_url", "JCBw.gif");
		}else if(APPCard.CRDSHUCD.equals("M ")){
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
		
		map.put("REQID",RESID);
		
		return "B1A01WE01A11_信用卡品牌转换确认";
	}
	
	
//	delete.app.confirm.page.admin
	@RequestMapping("delete.app.confirm.page.admin")
	public String deleteAppConfirmPageAdmin(HttpServletRequest req,Map<String, Object> map) {

		String RESID = req.getParameter("RESID");
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		MyADMINSRES adminsRes = listService.selectAdminResByRegId(RESID);
		String CSTID = adminsRes.RESUSERID;
		
		MyAPP APP = APPInfoService.searchAPP(CSTID);
		
		map.put("APP", APP);
		map.put("REQID",RESID);
		
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
		
		String ETC = APPInfoService.searchETC(CSTID);
		APP.setETCFLG(ETC);
		
//		logger.error(APP.ETCFLG);
//		ETC正在使用卡类型
		if(APP.ETCFLG.equals("1")) {
			map.put("ETCFLG_url", "etc.jpg");
		}else{
			map.put("ETCFLG_url", "etc_2.png");
		}
		
		return "B1A01WJ01A11_信用卡解约确认";
	}

	
// ----------------------确认和删除按钮--------------------------	
//	@RequestMapping("admin.res.confirm")
//	public String adminResConfirm(HttpServletRequest req,Map<String, Object> map,@RequestParam MyRequestParam requestParam) {
//		logger.error("!!!!!!!!!!!!!!!!!!!!!!");
//		
//		MyADMINSRES adminRes = listService.selectAdminResByRegId(requestParam.ID);
//		adminRes.setRESSTATE("已通过");
//		map.put("ADMINID", requestParam.AID);
//		map.put("CSTID", requestParam.CID);
//		logger.error(requestParam.AID);
//		logger.error(requestParam.CID);
//		
//		List<MyADMINSRES> adminsResList = listService.selectAdminsRes();
//		map.put("adminsResList", adminsResList);
//		
//		return "AdminResList";	
//	}
	@RequestMapping("admin.res.confirm")
	public String adminResConfirm(HttpServletRequest req,Map<String, Object> map) {
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		String CSTID = req.getParameter("CSTID");
		map.put("CSTID", CSTID);
		
		String RESID = req.getParameter("RESID");
		map.put("RESID", RESID);
	
		listService.updateAdminResByRegId(RESID);
		listService.updateUserReqByRegId(RESID);
		
		MyADMINSRES adminsRes = listService.selectAdminResByRegId(RESID);
		
		String RESTYPE= adminsRes.RESTYPE;
//		logger.error(RESTYPE);
//		System.out.print(RESTYPE.equals("个人信息变更申请"));
		if(RESTYPE.equals("个人信息变更申请")) {
			listService.changeRESAPP(adminsRes);
		}
		if(RESTYPE.equals("信用卡转化申请")) {
			listService.changeRESCard(adminsRes);
		}
		System.out.print(RESTYPE);
		if(RESTYPE.equals("信用卡额度增加申请")) {
			listService.cardAddRESAPP(adminsRes);
		}
		if(RESTYPE.equals("信用卡解约申请")) {
			listService.deleteAppRESAPP(adminsRes);
		}
		
		
		List<MyADMINSRES> adminsResList = listService.selectAdminsRes();
		map.put("adminsResList", adminsResList);
		
		return "AdminResList";	
	}

	@RequestMapping("admin.res.reject")
	public String adminResReject(HttpServletRequest req,Map<String, Object> map) {
		String ADMINID = req.getParameter("ADMINID");
		map.put("ADMINID", ADMINID);
		
		String CSTID = req.getParameter("CSTID");
		map.put("CSTID", CSTID);
		
		String RESID = req.getParameter("RESID");
		map.put("RESID", RESID);
		
		listService.updateAdminResByRegIdRej(RESID);
		listService.updateUserReqByRegIdRej(RESID);
		
		List<MyADMINSRES> adminsResList = listService.selectAdminsRes();
		map.put("adminsResList", adminsResList);
		
		return "AdminResList";	
	}
	

}

