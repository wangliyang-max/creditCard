package com.example.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.po.MyDept;
import com.example.po.PNTINF;
import com.example.po.PNTSYKKNR;

@Repository("PNTSYKKNRDao")
@Mapper
public interface PNTSYKKNRDao {
	
	public List<PNTSYKKNR> selectPNTSYKKNR(String CSTID);
	
	public int insertPNTSYKKNR(PNTSYKKNR pntsykknr) throws SQLException;
}
