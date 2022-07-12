package com.example.service;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AppDao;
import com.example.po.MyAPP;
@Service("AppService")
public class AppServiceImpl implements AppService{
	
	@Autowired
	private AppDao appDao;

	public List<MyAPP> selectApps() {
		// TODO Auto-generated method stub
		return appDao.selectApp();
	}

	@Override
	public MyAPP selectApp(String appid) {
		// TODO Auto-generated method stub
		return appDao.selectAppByAppid(appid);
	}

	public int insertApp(MyAPP app) throws SQLException,SQLIntegrityConstraintViolationException{
		System.out.println("来自服务的函数 insertApp(app)");
		return appDao.insertApp(app);
	}

	public int updateApp(MyAPP app)throws SQLException{
		return appDao.updateApp(app);
	}
	
	public int deleteApp(String appid)throws SQLException{
		return appDao.deleteApp(appid);
	}


}
