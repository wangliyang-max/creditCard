package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BKURIDao;
import com.example.po.BKURI;

@Service("BKURIService")
public class BKURIServiceImpl implements BKURIService{
	@Autowired
	private BKURIDao bkuriDao;
	
	public List<BKURI> selectBKURIByYear(String CSTID) {
		return bkuriDao.selectBKURIByYear(CSTID);
	}
}
