package com.example.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PNTTUKKNRDao;
import com.example.po.PNTTUKKNR;
@Service("PNTTUKKNRService")
public class PNTTUKKNRServiceImpl implements PNTTUKKNRService{
	@Autowired
	private PNTTUKKNRDao pnttukknrDao;

	@Override
	public int insertPNTTUKKNR(PNTTUKKNR pnttukknr) throws SQLException {
		return pnttukknrDao.insertPNTTUKKNR(pnttukknr);
	}

	@Override
	public List<PNTTUKKNR> selectPNTTUKKNR(String CSTID) {
		// TODO Auto-generated method stub
		return pnttukknrDao.selectPNTTUKKNR(CSTID);
	}

}