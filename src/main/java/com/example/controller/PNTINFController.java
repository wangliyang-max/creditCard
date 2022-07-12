package com.example.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.po.MyDept;
import com.example.po.PNTINF;
import com.example.service.PNTINFService;

@Controller
public class PNTINFController {
	@Autowired
	private PNTINFService pntinfService;
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("select.pntinf")
	public String select(HttpServletRequest req,Map<String, Object> map) {
		String CSTID = req.getParameter("CSTID");
		List<PNTINF> pntinflist = pntinfService.selectPNTINF(CSTID);		
		map.put("pntinflist", pntinflist);		
		return "SELECTPNTINF";
	}
	
	@RequestMapping("insert.pntinf")
	public String insert(HttpServletRequest req,Map<String, Object> map) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		PNTINF pntinf = new PNTINF();
		pntinf.setPNTINFID(req.getParameter("PNTINFID"));
		pntinf.setCSTID(req.getParameter("CSTID"));
		pntinf.setHNNKZK(req.getParameter("HNNKZK"));
		pntinf.setURSEQ(req.getParameter("URSEQ"));
		
//		String date=req.getParameter("TRITIM");
//		date=date.replace("-0", "-");
//		pntinf.setTRITIM(date);
//		pntinf.setTRITIM(req.getParameter("TRITIM"));
		pntinf.setRKSTS(req.getParameter("RKSTS"));
		pntinf.setPNTCOU(Integer.parseInt(req.getParameter("PNTCOU")));
		pntinf.setCAMPID(req.getParameter("CAMPID"));
		
		String date=req.getParameter("INSERTDTE");
		date=date.replace("-0", "-");
		pntinf.setINSERTDTE(date);
		//pntinf.setINSERTDTE(req.getParameter("INSERTDTE"));
		pntinf.setINSERTID(req.getParameter("INSERTID"));
		
		date=req.getParameter("UPDATEDTE");
		date=date.replace("-0", "-");
		pntinf.setUPDATEDTE(date);
		//pntinf.setUPDATEDTE(req.getParameter("UPDATEDTE"));
		pntinf.setUPDATEID(req.getParameter("UPDATEID"));
		pntinf.setDELETEFLG(req.getParameter("DELETEFLG"));
		
		date=req.getParameter("DELETEDTE");
		date=date.replace("-0", "-");
		pntinf.setDELETEDTE(date);
		//pntinf.setDELETEDTE(req.getParameter("DELETEDTE"));
		int i;
		try {
			i = pntinfService.insertPNTINF(pntinf);
			if(i>0) {
				map.put("insert_pntinf_msg", "insert success");
			}
		} catch (Exception e) {
			map.put("insert_pntinf_msg", "insert error");
			System.out.println(e);
			return "indexJiFen";
		}
		return "indexJiFen";
	}
}
