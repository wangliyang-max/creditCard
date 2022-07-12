package com.example.service;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CusDao;
import com.example.po.MyCST;

@Service("cusService")
public class CusServicelmpl implements CusService {
	
	@Autowired
	private CusDao cusDao;

	public List<MyCST> selectCuss() {
		// TODO Auto-generated method stub
		return cusDao.selectCus();
	}

	@Override
	public MyCST selectCus(String cusid) {
		// TODO Auto-generated method stub
		return cusDao.selectCusByCusid(cusid);
	}

	public int insertCus(MyCST cus) throws SQLException,SQLIntegrityConstraintViolationException{
		System.out.println("来自服务的函数 insertCus(cus)");
		return cusDao.insertCus(cus);
	}

	public int updateCus(MyCST cus)throws SQLException{
		return cusDao.updateCus(cus);
	}
	
	public int deleteCus(String cusid)throws SQLException{
		return cusDao.deleteCus(cusid);
	}

	
	

}
