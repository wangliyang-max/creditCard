package com.example.dao;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.po.MyAPP;
@Repository("appDao")
@Mapper
public interface AppDao {
	
    public List<MyAPP> selectApp();
	
	public MyAPP selectAppByAppid(String appid);
	
	public int insertApp(MyAPP app)throws SQLException,SQLIntegrityConstraintViolationException;
	
    public int updateApp(MyAPP app)throws SQLException;
	
	public int deleteApp(String appid)throws SQLException;

}
