package com.example.dao;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.po.MyDept;

@Repository("deptDao")
@Mapper
public interface DeptDao {

	public List<MyDept> selectDepts();
	
	public MyDept selectDeptByDeptid(String deptid);
	
	public int insertDept(MyDept dept)throws SQLException,SQLIntegrityConstraintViolationException;
	
	public int updateDept(MyDept dept)throws SQLException;
	
	public int deleteDept(String deptid)throws SQLException;
}
