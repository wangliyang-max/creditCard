package com.example.controller;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.po.MyAPP;
import com.example.service.AppService;

@Controller
public class AppController {
	SimpleDateFormat myFmt=new SimpleDateFormat("yyyy-MM-dd");
	
	public static String getType(Object o) {
		return o.getClass().toString();
	}
	@Autowired
	private AppService appService;

	Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping("select_app.action")
	public String select(HttpServletRequest req,Map<String, Object> map) {
		List<MyAPP> applist = appService.selectApps();		
		map.put("applist", applist);
		System.out.println("controller select_app ");
		return "search_App";
	}
	
	
	@RequestMapping("select1_app.action")
	public String select1(HttpServletRequest req,Map<String, Object> map) {
		String Appid = req.getParameter("APPID");
		MyAPP app= appService.selectApp(Appid);		
		map.put("app", app);		
		
		System.out.println("controller select1_app ");
		
		return "search1_App";
	}

	@RequestMapping("insert_app.action")
	public String insert(HttpServletRequest req,Map<String, Object> map){
		MyAPP app = new MyAPP();
		System.out.println("-----------insert_app.action--------------------------------");
		app.setAPPCD(req.getParameter("APPCD"));
		app.setAPPID(req.getParameter("APPID"));
		app.setSYOKBN(req.getParameter("SYOKBN"));
		app.setMAIL(req.getParameter("MAIL"));
		app.setBER(req.getParameter("BER"));
		app.setPHO(req.getParameter("PHO"));
		
		//受理日期
		String d=req.getParameter("UKTTME");
		System.out.println("--------------------------------------"+d+"--------------------------------------");
        d.replace("-0", "-");
		app.setUKTTME(d);
		app.setAPPSTS(req.getParameter("APPSTS"));
		app.setBRDCD(req.getParameter("BRDCD"));
		app.setCRDSHUCD(req.getParameter("CRDSHUCD"));
		app.setKJNHJN(req.getParameter("KJNHJN"));
		app.setSEIKJ(req.getParameter("SEIKJ"));
		app.setSEIKN(req.getParameter("SEIKN"));
		app.setSEIEN(req.getParameter("SEIEN"));
		app.setMEIKJ(req.getParameter("MEIKJ"));
		app.setMEIKN(req.getParameter("MEIKN"));
		app.setMEIEN(req.getParameter("MEIEN"));
		app.setSEX(req.getParameter("SEX"));
		app.setJKYSBT(req.getParameter("JKYSBT"));
		app.setTEL(req.getParameter("TEL"));
		app.setPOST(req.getParameter("POST"));
		app.setKNC(req.getParameter("KNC"));
		app.setJSKJ1(req.getParameter("JSKJ1"));
		app.setJSKJ2(req.getParameter("JSKJ2"));
		app.setJSKN1(req.getParameter("JSKN1"));
		app.setJSKN2(req.getParameter("JSKN2"));
		app.setSPGTORKBN(req.getParameter("SPGTORKBN"));
		app.setSPGKBN(req.getParameter("SPGKBN"));
		app.setCSGKBN(req.getParameter("CSGKBN"));
		app.setTORKBN(req.getParameter("TORKBN"));
		app.setTORKBN(req.getParameter("TORKBN"));
		app.setDRIVERID(req.getParameter("DRIVERID"));
		app.setKKHCD(req.getParameter("KKHCD"));
		app.setHGSUMK(req.getParameter("HGSUMK"));
		app.setKZKMLFLG(req.getParameter("KZKMLFLG"));
		app.setCAMMLFLG(req.getParameter("CAMMLFLG"));
		app.setBANKCD(req.getParameter("BANKCD"));
		app.setBCHCD(req.getParameter("BCHCD"));
		app.setYKN(req.getParameter("YKN"));
		app.setACTCD(req.getParameter("ACTCD"));
		app.setACTNAE(req.getParameter("ACTNAE"));
		app.setACTKKNDTE(req.getParameter("ACTKKNDTE"));
		app.setACTKKNID(req.getParameter("ACTKKNID"));
		app.setACTKKNNAM(req.getParameter("ACTKKNNAM"));
		
		app.setAGTCD(req.getParameter("AGTCD"));
		app.setHNNHHUCD(req.getParameter("HNNHHUCD"));
		app.setHNNFLG(req.getParameter("HNNFLG"));
		app.setHKS1(req.getParameter("HKS1"));
		app.setHKS2(req.getParameter("HKS2"));
		app.setHKS3(req.getParameter("HKS3"));
		app.setHKS4(req.getParameter("HKS4"));
		
		app.setHNNKKNDTE(req.getParameter("HNNKKNDTE"));
		app.setHNNKKNID(req.getParameter("HNNKKNID"));
		app.setHNNKKNNAM(req.getParameter("HNNKKNNAM"));
		app.setGYOCD(req.getParameter("GYOCD"));
		app.setKMS(req.getParameter("KMS"));
		app.setKMSDEP(req.getParameter("KMSDEP"));
		app.setKMSTEL(req.getParameter("KMSTEL"));
		app.setKMSJS1(req.getParameter("KMSJS1"));
		app.setKMSJS2(req.getParameter("KMSJS2"));
		
		app.setNSHYM(req.getParameter("NSHYM"));
		app.setNSG(req.getParameter("NSG"));
		app.setKZKKBN(req.getParameter("KZKKBN"));
		app.setKZKFLG(req.getParameter("KZKFLG"));
		app.setKZKSEIKJ(req.getParameter("KZKSEIKJ"));
		app.setKZKSEIKN(req.getParameter("KZKSEIKN"));
		app.setKZKSEIEN(req.getParameter("KZKSEIEN"));
		app.setKZKMEIKJ(req.getParameter("KZKMEIKJ"));
		app.setKZKMEIKN(req.getParameter("KZKMEIKN"));
		app.setKZKMEIEN(req.getParameter("KZKMEIEN"));
		
		app.setKZKSEX(req.getParameter("KZKSEX"));
		app.setKZKGYOCD(req.getParameter("KZKGYOCD"));
		app.setKZKKMS(req.getParameter("KZKKMS"));
		app.setKZKKMSDEP(req.getParameter("KZKKMSDEP"));
		app.setKZKKMSTEL(req.getParameter("KZKKMSTEL"));
		app.setKZKHHUCD(req.getParameter("KZKHHUCD"));
		
		app.setKZKKS1(req.getParameter("KZKKS1"));
		app.setKZKKS2(req.getParameter("KZKKS2"));
		app.setKZKKS3(req.getParameter("KZKKS3"));
		app.setKZKKS4(req.getParameter("KZKKS4"));
		app.setKZKKKNDTE(req.getParameter("KZKKKNDTE"));
		app.setKZKKKNID(req.getParameter("KZKKKNID"));
		app.setKZKKKNNAM(req.getParameter("KZKKKNNAM"));
		app.setYSNINF(req.getParameter("YSNINF"));
		app.setSKJSSKFLG(req.getParameter("SKJSSKFLG"));
		
		// 请求审查的日期和时间-----------
		String d1=req.getParameter("SSKIRITME");
        d1.replace("-0", "-");
		app.setSSKIRITME(d1);
		System.out.println("--------------------------------------"+d1+"--------------------------------------");
		
		app.setSSKCD(req.getParameter("SSKCD"));
		
		// 审查结果受领日期--------------------
		String d2=req.getParameter("SSKJRYTME");
        d2.replace("-0", "-");
		app.setSSKJRYTME(d2);
		System.out.println("--------------------------------------"+d2+"--------------------------------------");
		
		// 申请取消日期和时间--------------------
		String d3=req.getParameter("APPCNCTME");
        d3.replace("-0", "-");
		app.setAPPCNCTME(d3);
		System.out.println("--------------------------------------"+d3+"--------------------------------------");
		
		app.setOLDCRDCD(req.getParameter("OLDCRDCD"));
		
		// 注册日期----------------------
		String d4=req.getParameter("INSERTDTE");
        d4.replace("-0", "-");
		app.setINSERTDTE(d4);
		System.out.println("--------------------------------------"+d4+"--------------------------------------");
		
		app.setINSERTID(req.getParameter("INSERTID"));
		
		// 更新日期---------------------
		String d5=req.getParameter("UPDATEDTE");
        d5.replace("-0", "-");
		app.setUPDATEDTE(d5);
		System.out.println("--------------------------------------"+d5+"--------------------------------------");
		
		app.setUPDATEID(req.getParameter("UPDATEID"));
		app.setDELETEFLG(req.getParameter("DELETEFLG"));
		
		// 理论上的删除日期----------------------
		String d6=req.getParameter("DELETEDTE");
        d6.replace("-0", "-");
		app.setDELETEDTE(d6);
		System.out.println("----d6----------------------------------"+d6+"--------------------------------------");
		

		int i;
		
		try {
			i = appService.insertApp(app);	
			System.out.println(i);
			if(i>0) {
				map.put("msg","insert success");
			}else {
				map.put("msg","insert error");
			}
		}catch(SQLIntegrityConstraintViolationException e) {
			map.put("msg","insert error");
			return "indexShenQing";
		}catch (Exception e ) {
			// TODO Auto-generated catch block
			map.put("msg","insert error");
			return "indexShenQing";
		}
		
		return "indexShenQing";
		
	}
	
	
	@RequestMapping("update_app.action")
	public String update(HttpServletRequest req,Map<String, Object> map){
		MyAPP app = new MyAPP();
		app.setAPPID(req.getParameter("APPID"));	
		app.setPHO(req.getParameter("PHO"));
		
		int i;
		try {
			i =appService.updateApp(app);
			if(i>0) {
				map.put("msg1","update success");
			}else {
				map.put("msg1","update error");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			map.put("msg","insert success");
			map.put("msg1","update error");
			return "indexShenQing";
		}
		
		return "indexShenQing";
	}
	
	
	@RequestMapping("delete_app.action")
	public String delete(HttpServletRequest req,Map<String, Object> map){
		String appid = req.getParameter("APPID");
		try {
			int i =appService.deleteApp(appid);
			if(i>0) {
				map.put("msg2","delete success" );	
			}else {
				map.put("msg2","delete error");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("msg2","delete error");
			return "indexShenQing";
		}		
			
		return "indexShenQing";
	}

}
