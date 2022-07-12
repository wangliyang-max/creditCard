package com.example.service;

import java.util.List;

import com.example.po.BKURI;

public interface BKURITimeService {

	public List<BKURI> selectBKURIByTime(String sTIME, String eTIME);

}
