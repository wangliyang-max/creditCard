package com.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.po.MyAPP;

@Repository("APPInfoDao")
@Mapper
public interface APPInfoDao {
	public MyAPP searchAPP(String CSTID);
	public String searchETC(String CSTID);
	
	public int changeAPP(MyAPP APP);
	
}
