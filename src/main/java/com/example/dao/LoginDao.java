package com.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.po.MyADMINS;
import com.example.po.MyUSERS;


@Repository("LoginDao")
@Mapper
public interface LoginDao {
	public MyUSERS getUserPassword(String CSTID);
	public MyADMINS getAdminPassword(String ADMINID);
}
