package com.example.service;

import java.sql.SQLException;
import java.util.List;

import com.example.po.MyDept;
import com.example.po.PNTINF;

public interface PNTINFService {
	
	public List<PNTINF> selectPNTINF(String CSTID);
	
	public int insertPNTINF(PNTINF pntinf) throws SQLException;
	
	
}
