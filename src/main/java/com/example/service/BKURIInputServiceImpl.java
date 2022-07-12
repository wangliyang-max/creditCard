package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BKURIInputDao;
import com.example.po.BKURI;

@Service("BKURIInputService")
public class BKURIInputServiceImpl implements BKURIInputService{

	@Autowired
	private BKURIInputDao bkuriInputDao;
	
	@Override
	public Integer insertBKURI(BKURI bkuri) {
		return bkuriInputDao.insertBKURI(bkuri);
	}
	
}