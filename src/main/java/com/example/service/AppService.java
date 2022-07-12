package com.example.service;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import com.example.po.MyAPP;

    public interface AppService {
	
    public List<MyAPP> selectApps();
	
	public MyAPP selectApp(String appid);
	
	public int insertApp(MyAPP app)throws SQLException,SQLIntegrityConstraintViolationException;
	
    public int updateApp(MyAPP app)throws SQLException;
	
	public int deleteApp(String appid)throws SQLException;

}
