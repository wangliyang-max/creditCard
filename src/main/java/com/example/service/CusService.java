package com.example.service;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import com.example.po.MyCST;

public interface CusService {
	
    public List<MyCST> selectCuss();
	
	public MyCST selectCus(String cusid);
	
	public int insertCus(MyCST cus)throws SQLException,SQLIntegrityConstraintViolationException;
	
    public int updateCus(MyCST cus)throws SQLException;
	
	public int deleteCus(String cusid)throws SQLException;
	
//	public int updateDept(MyDept dept)throws SQLException;

//	public int deleteDept(String deptid)throws SQLException;

}
