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

import com.example.po.PNTSYKKNR;
import com.example.po.PNTTUKKNR;
import com.example.service.PNTTUKKNRService;
@Controller
public class PNTTUKKNRController {
	@Autowired
	private PNTTUKKNRService pnttukknrService;
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("select.pnttukknr")
	public String select(HttpServletRequest req,Map<String, Object> map) {
		String CSTID = req.getParameter("CSTID");
		List<PNTTUKKNR> pnttukknrlist = pnttukknrService.selectPNTTUKKNR(CSTID);		
		map.put("pnttukknrlist", pnttukknrlist);		
		return "SELECTPNTTUKKNR";
	}
		
	@RequestMapping("insert.pnttukknr")
	public String insert(HttpServletRequest req,Map<String, Object> map) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		PNTTUKKNR pnttukknr = new PNTTUKKNR();
		pnttukknr.setCSTID(req.getParameter("CSTID"));

//		String date=req.getParameter("RKDTE");
//		date=date.replace("-0", "-");
//		pnttukknr.setRKDTE(date);
//		//pntsykknr.setRKDTE(req.getParameter("RKDTE"));
//		pnttukknr.setSKDTE(req.getParameter("SKDTE"));	
		pnttukknr.setPNTCOU(Integer.parseInt(req.getParameter("PNTCOU")));
		
		String date=req.getParameter("INSERTDTE");
		date=date.replace("-0", "-");
		pnttukknr.setINSERTDTE(date);
		//pntsykknr.setINSERTDTE(req.getParameter("INSERTDTE"));
		pnttukknr.setINSERTID(req.getParameter("INSERTID"));
		
		date=req.getParameter("UPDATEDTE");
		date=date.replace("-0", "-");
		pnttukknr.setUPDATEDTE(date);
		//pntsykknr.setUPDATEDTE(req.getParameter("UPDATEDTE"));
		pnttukknr.setUPDATEID(req.getParameter("UPDATEID"));
		pnttukknr.setDELETEFLG(req.getParameter("DELETEFLG"));
		
		date=req.getParameter("DELETEDTE");
		date=date.replace("-0", "-");
		pnttukknr.setDELETEDTE(date);
		//pntsykknr.setDELETEDTE(req.getParameter("DELETEDTE"));
		int i;
		try {
			i = pnttukknrService.insertPNTTUKKNR(pnttukknr);
			if(i>0) {
				map.put("insert_pnttukknr_msg", "insert success");
			}
		} catch (Exception e) {
			System.out.println(e);
			map.put("insert_pnttukknr_msg", "insert error");
			return "indexJiFen";
		}
		return "indexJiFen";
	}
}