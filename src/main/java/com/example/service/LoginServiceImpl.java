package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.LoginDao;
import com.example.po.MyADMINS;
import com.example.po.MyUSERS;

@Service("LoginService")
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginDao loginDao;
	
	public MyUSERS getUserPassword(String CSTID) {
		return loginDao.getUserPassword(CSTID);
	}
	public MyADMINS getAdminPassword(String ADMINID) {
		return loginDao.getAdminPassword(ADMINID);
	}
}




