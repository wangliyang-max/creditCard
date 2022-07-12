package com.example.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PNTINFDao;
import com.example.po.PNTINF;

@Service("PNTINFService")
public class PNTINFServiceImpl implements PNTINFService{
	@Autowired
	private PNTINFDao pntinfDao;

	@Override
	public int insertPNTINF(PNTINF pntinf) throws SQLException {
		// TODO Auto-generated method stub
		return pntinfDao.insertPNTINF(pntinf);
	}

	@Override
	public List<PNTINF> selectPNTINF(String CSTID) {
		// TODO Auto-generated method stub
		return pntinfDao.selectPNTINF(CSTID);
	}
	
}
