package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.APPInfoDao;
import com.example.po.MyAPP;

@Service("APPInfoService")
public class APPInfoServiceImpl implements APPInfoService{
	@Autowired
	private APPInfoDao APPInfoDao;
	
	public MyAPP searchAPP(String CSTID) {
		return APPInfoDao.searchAPP(CSTID);
	}
	@Override
	public String searchETC(String CSTID) {
		// TODO Auto-generated method stub
		return APPInfoDao.searchETC(CSTID);
	}
	
	@Override
	public int changeAPP(MyAPP APP) {
		// TODO Auto-generated method stub
		return APPInfoDao.changeAPP(APP);
	}
	
}




