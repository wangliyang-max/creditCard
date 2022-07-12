package com.example.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.po.PNTSYKKNR;
import com.example.po.PNTTUKKNR;

@Repository("PNTTUKKNRDao")
@Mapper
public interface PNTTUKKNRDao {
	
	public List<PNTTUKKNR> selectPNTTUKKNR(String CSTID);

	public int insertPNTTUKKNR(PNTTUKKNR pnttukknr) throws SQLException;
	
}
