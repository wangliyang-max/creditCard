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
import com.example.po.MyCST;
import com.example.service.CusService;


@Controller
public class CusController {
	SimpleDateFormat myFmt=new SimpleDateFormat("yyyy-MM-dd");
	
//	@InitBinder
//	public void initBinder(ServletRequestDataBinder binder){
//	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//	binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
//	}
	public static String getType(Object o) {
		return o.getClass().toString();
	}
	@Autowired
	private CusService cusService;

	Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping("select_cus.action")
	public String select(HttpServletRequest req,Map<String, Object> map) {
		List<MyCST> cuslist = cusService.selectCuss();		
		map.put("cuslist", cuslist);
		System.out.println("---------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------");
		System.out.println("controller select_cus ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------");
		return "search_Cus";
	}
	
	
	@RequestMapping("select1_cus.action")
	public String select1(HttpServletRequest req,Map<String, Object> map) {
		String Cusid = req.getParameter("CSTID");
		MyCST cus = cusService.selectCus(Cusid);		
		map.put("cus", cus);		
		
		System.out.println("controller select1_cus ");
		
		return "search1_Cus";
	}

	@RequestMapping("insert_cus.action")
	public String insert(HttpServletRequest req,Map<String, Object> map){
		MyCST cus = new MyCST();
		cus.setCSTID(req.getParameter("CSTID"));
		cus.setHNNKZK(req.getParameter("HNNKZK"));
		
		cus.setSEI(req.getParameter("SEI"));
		cus.setSEIKANA(req.getParameter("SEIKANA"));
		cus.setSEIEN(req.getParameter("SEIEN"));
		
		cus.setMEI(req.getParameter("MEI"));
		cus.setMEIKANAK(req.getParameter("MEIKANAK"));
		cus.setMEIEN(req.getParameter("MEIEN"));

		
		
		cus.setBTH(req.getParameter("BTH"));
		cus.setSEX(req.getParameter("SEX"));
		cus.setKJNHJN(req.getParameter("KJNHJN"));
		cus.setTEL(req.getParameter("TEL"));
		
		cus.setPHONE(req.getParameter("PHONE"));
		cus.setJKYSBT(req.getParameter("JKYSBT"));
		cus.setPOST(req.getParameter("POST"));
		cus.setKNC(req.getParameter("KNC"));
		
		cus.setJSKJ1(req.getParameter("JSKJ1"));
     	cus.setJSKJ2(req.getParameter("JSKJ2"));
		cus.setJSKN1(req.getParameter("JSKN1"));
		cus.setJSKN2(req.getParameter("JSKN2"));
		
		cus.setGYOCD(req.getParameter("GYOCD"));
		cus.setKMS(req.getParameter("KMS"));
		cus.setKMSDEP(req.getParameter("KMSDEP"));
		cus.setKMSTEL(req.getParameter("KMSTEL"));
		cus.setKMSJS1(req.getParameter("KMSJS1"));
		cus.setKMSJS2(req.getParameter("KMSJS2"));
		
		cus.setNYUSYAYM(req.getParameter("NYUSYAYM"));
		cus.setNSG(req.getParameter("NSG"));
		cus.setDRIVERID(req.getParameter("DRIVERID"));
		cus.setKKHCD(req.getParameter("KKHCD"));
		cus.setBANKCD(req.getParameter("BANKCD"));
		cus.setBCHCD(req.getParameter("BCHCD"));
		cus.setYKN(req.getParameter("YKN"));
		
		cus.setACTCD(req.getParameter("ACTCD"));
		cus.setACTNAE(req.getParameter("ACTNAE"));
		cus.setKZKMLFLG(req.getParameter("KZKMLFLG"));
		cus.setCAMMLFLG(req.getParameter("CAMMLFLG"));
		cus.setETCFLG(req.getParameter("ETCFLG"));		
		
        String d=req.getParameter("INSERTDTE");
        d.replace("-0", "-");
		System.out.println(req.getParameter("INSERTDTE")+"--------输出时间-------");
		System.out.println(getType(d));
		cus.setINSERTDTE(d);
		
		cus.setINSERTID(req.getParameter("INSERTID"));
		
		String d1=req.getParameter("UPDATEDTE");
		d1.replace("-0", "-");
		System.out.println(getType(d1));
		cus.setUPDATEDTE(d1);
		
		cus.setUPDATEID(req.getParameter("UPDATEID"));
		cus.setDELETEFLG(req.getParameter("DELETEFLG"));
		
		String d2=req.getParameter("DELETEDTE");
		d2.replace("-0", "-");
		System.out.println(getType(d2));
		cus.setDELETEDTE(d2);
		
		System.out.println("cus===="+cus);

		int i;
		
		try {
			i = cusService.insertCus(cus);	
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
	
	
	@RequestMapping("update_cus.action")
	public String update(HttpServletRequest req,Map<String, Object> map){
		MyCST cus = new MyCST();
		cus.setCSTID(req.getParameter("CSTID"));
		cus.setSEI(req.getParameter("SEI"));
		
		
		int i;
		try {
			i =cusService.updateCus(cus);
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
	
	
	@RequestMapping("delete_cus.action")
	public String delete(HttpServletRequest req,Map<String, Object> map){
		String cusid = req.getParameter("CSTID");
		try {
			int i =cusService.deleteCus(cusid);
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
	
	
	@RequestMapping("jump_customer.action")
	public String jumpcustomer() {
		System.out.println("jump customer ");
		
		return "customer_login";
	}
	
	
	
    
}
