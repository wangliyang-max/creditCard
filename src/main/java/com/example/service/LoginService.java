package com.example.service;

import com.example.po.MyADMINS;
import com.example.po.MyUSERS;

public interface LoginService {
	public MyUSERS getUserPassword(String CSTID);
	public MyADMINS getAdminPassword(String ADMINID);
}
