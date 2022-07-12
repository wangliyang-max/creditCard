package com.example.service;

import java.sql.SQLException;
import java.util.List;

import com.example.po.PNTSYKKNR;
import com.example.po.PNTTUKKNR;

public interface PNTTUKKNRService {
	
	public int insertPNTTUKKNR(PNTTUKKNR pnttukknr) throws SQLException;
	
	public List<PNTTUKKNR> selectPNTTUKKNR(String CSTID);
}