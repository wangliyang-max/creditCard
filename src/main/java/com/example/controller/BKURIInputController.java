package com.example.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.po.BKURI;
import com.example.service.BKURIInputService;

@Controller
public class BKURIInputController{
	@Autowired
	private BKURIInputService bkuriInputService;
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("insertBKURI.action")
	public String insertBKURI(HttpServletRequest req, Map<String, Object> map) throws ParseException {
		BKURI bkuri = new BKURI();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		bkuri.setSEQ(req.getParameter("SEQ"));
		bkuri.setKINO(Integer.parseInt(req.getParameter("KINO")));
		bkuri.setCSTID(req.getParameter("CSTID"));
		bkuri.setHNNKZK(req.getParameter("HNNKZK"));
		bkuri.setBKUAG(Integer.parseInt(req.getParameter("BKUAG")));
		bkuri.setTESURYO(req.getParameter("TESURYO"));
		bkuri.setTSK(req.getParameter("TSK"));
		bkuri.setSKYYM(req.getParameter("SKYYM"));
		bkuri.setTSKFLG(req.getParameter("TSKFLG"));
		String a = req.getParameter("UPDATEDTE");
		bkuri.setUPDATEDTE(sdf.parse(a));
//		System.out.println(bkuri);
//		System.out.println(req.getParameter("INSERTDTE"));
//		System.out.println("123  "+req.getParameter("INSERTDTE"));
		bkuri.setINSERTDTE(sdf.parse(a));
		bkuri.setINSERTID(req.getParameter("INSERTID"));
		
		bkuri.setUPDATEID(req.getParameter("UPDATEID"));
		bkuri.setDELETEFLG(req.getParameter("DELETEFLG"));
		bkuri.setDELETEDTE(sdf.parse(req.getParameter("DELETEDTE")));
		System.out.println("@@"+bkuri);
		Integer i;
		try {
			i = bkuriInputService.insertBKURI(bkuri);
			if(i>0) {
				map.put("insert_bkuri_msg", "insert success");
			}
		} catch (Exception e) {
			System.out.println(e);
			map.put("insert_bkuri_msg", "insert error");
			return "indexZiJin";
		}
		return "indexZiJin";
		
	}
}