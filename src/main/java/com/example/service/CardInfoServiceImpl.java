package com.example.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CardInfoDao;
import com.example.po.CRD;


@Service("cardInfoService")
public class CardInfoServiceImpl implements CardInfoService {

	@Autowired
	private CardInfoDao cardInfoDao;

	@Override
	public CRD selectCardInfo(String CSTID) {
		// TODO Auto-generated method stub
		return cardInfoDao.selectCardInfo(CSTID);
	}




}
