package com.example.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.po.MyDept;
import com.example.po.PNTINF;

@Repository("PNTINFDao")
@Mapper
public interface PNTINFDao {
	
	public List<PNTINF> selectPNTINF(String CSTID);
	
	public int insertPNTINF(PNTINF pntinf) throws SQLException;
}
