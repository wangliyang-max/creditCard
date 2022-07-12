package com.example.dao;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.po.MyCST;

@Repository("cusDao")
@Mapper
public interface CusDao {
	
    public List<MyCST> selectCus();
	
	public MyCST selectCusByCusid(String cusid);
	
	public int insertCus(MyCST cus)throws SQLException,SQLIntegrityConstraintViolationException;
	
    public int updateCus(MyCST cus)throws SQLException;
	
	public int deleteCus(String cusid)throws SQLException;
	
	

}
