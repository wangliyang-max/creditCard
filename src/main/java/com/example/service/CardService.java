package com.example.service;

import com.example.po.MyAPP;

public interface CardService {
	public int changeCard(MyAPP APP);
	
	public int cardDelete(String CSTID);
	public int cardDeleteCST(String CSTID);
	
	public int degreeAddCard(MyAPP APP);
}
