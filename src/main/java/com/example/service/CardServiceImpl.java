package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CardDao;
import com.example.po.MyAPP;

@Service("CardService")
public class CardServiceImpl implements CardService{
	@Autowired
	public CardDao cardDao;
	
	@Override
	public int changeCard(MyAPP APP) {
		// TODO Auto-generated method stub
		return cardDao.changeCard(APP);
	}
	public int cardDelete(String CSTID) {
		return cardDao.cardDelete(CSTID);
	}
	public int cardDeleteCST(String CSTID) {
		return cardDao.cardDeleteCST(CSTID);
	}
	public int degreeAddCard(MyAPP APP) {
		return cardDao.degreeAddCard(APP);
	}
	
}
