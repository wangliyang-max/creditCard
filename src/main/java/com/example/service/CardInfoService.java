package com.example.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.CardInfoDao;
import com.example.po.CRD;


public interface CardInfoService {

	public CRD selectCardInfo(String CSTID);
	
}
