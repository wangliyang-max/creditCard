package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BKURITimeDao;
import com.example.po.BKURI;

@Service("BKURITimerService")
public class BKURITimeServiceImpl implements BKURITimeService{
	@Autowired
	private BKURITimeDao bkuriTimeDao;

	@Override
	public List<BKURI> selectBKURIByTime(String STIME, String ETIME) {
		
		return bkuriTimeDao.selectBKURIByTime(STIME,ETIME);
	}
	
	
}
