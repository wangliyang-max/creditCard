package com.example.service;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PNTSYKKNRDao;
import com.example.po.PNTSYKKNR;
@Service("PNTSYKKNRService")
public class PNTSYKKNRServiceImpl implements PNTSYKKNRService{
	@Autowired
	private PNTSYKKNRDao pntsykknrDao;

	@Override
	public int insertPNTSYKKNR(PNTSYKKNR pntsykknr) throws SQLException {
		return pntsykknrDao.insertPNTSYKKNR(pntsykknr);
	}

	@Override
	public List<PNTSYKKNR> selectPNTSYKKNR(String CSTID) {
		// TODO Auto-generated method stub
		return pntsykknrDao.selectPNTSYKKNR(CSTID);
	}

}
