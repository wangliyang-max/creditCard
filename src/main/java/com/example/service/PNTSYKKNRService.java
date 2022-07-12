package com.example.service;

import java.sql.SQLException;
import java.util.List;

import com.example.po.PNTINF;
import com.example.po.PNTSYKKNR;

public interface PNTSYKKNRService {
	
	public int insertPNTSYKKNR(PNTSYKKNR pntsykknr) throws SQLException;

	public List<PNTSYKKNR> selectPNTSYKKNR(String CSTID);
}
