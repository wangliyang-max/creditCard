package com.example.service;

import com.example.po.MyAPP;

public interface APPInfoService {
	public MyAPP searchAPP(String CSTID);
	public String searchETC(String CSTID);
	
	public int changeAPP(MyAPP APP);
}

