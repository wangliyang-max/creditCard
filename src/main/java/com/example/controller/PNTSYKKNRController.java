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

import com.example.po.PNTINF;
import com.example.po.PNTSYKKNR;
import com.example.service.PNTSYKKNRService;
@Controller
public class PNTSYKKNRController {
	@Autowired
	private PNTSYKKNRService pntsykknrService;
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("select.pntsykknr")
	public String select(HttpServletRequest req,Map<String, Object> map) {
		String CSTID = req.getParameter("CSTID");
		List<PNTSYKKNR> pntsykknrlist = pntsykknrService.selectPNTSYKKNR(CSTID);		
		map.put("pntsykknrlist", pntsykknrlist);		
		return "SELECTPNTSYKKNR";
	}
	
	@RequestMapping("insert.pntsykknr")
	public String insert(HttpServletRequest req,Map<String, Object> map) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		PNTSYKKNR pntsykknr = new PNTSYKKNR();
		pntsykknr.setCSTID(req.getParameter("CSTID"));		
		String date=req.getParameter("RKDTE");
		date=date.replace("-0", "-");
		pntsykknr.setRKDTE(date);
		//pntsykknr.setRKDTE(req.getParameter("RKDTE"));
		pntsykknr.setPNTCOU(Integer.parseInt(req.getParameter("PNTCOU")));
		
		date=req.getParameter("INSERTDTE");
		date=date.replace("-0", "-");
		pntsykknr.setINSERTDTE(date);
		//pntsykknr.setINSERTDTE(req.getParameter("INSERTDTE"));
		pntsykknr.setINSERTID(req.getParameter("INSERTID"));
		
//		date=req.getParameter("UPDATEDTE");
//		date=date.replace("-0", "-");
//		pntsykknr.setUPDATEDTE(date);
//		pntsykknr.setUPDATEDTE(req.getParameter("UPDATEDTE"));
		pntsykknr.setUPDATEID(req.getParameter("UPDATEID"));
		pntsykknr.setDELETEFLG(req.getParameter("DELETEFLG"));
		
		date=req.getParameter("DELETEDTE");
		date=date.replace("-0", "-");
		pntsykknr.setDELETEDTE(date);
		//pntsykknr.setDELETEDTE(req.getParameter("DELETEDTE"));
		int i;
		try {
			i = pntsykknrService.insertPNTSYKKNR(pntsykknr);
			if(i>0) {
				map.put("insert_pntsykknr_msg", "insert success");
			}
		} catch (Exception e) {
			System.out.println(e);
			map.put("insert_pntsykknr_msg", "insert error");
			return "indexJiFen";
		}
		return "indexJiFen";
	}
}
