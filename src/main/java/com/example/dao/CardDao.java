package com.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.po.MyAPP;

@Repository("CardDao")
@Mapper
public interface CardDao {
	public int changeCard(MyAPP APP);
	
	public int cardDelete(String CSTID);
	public int cardDeleteCST(String CSTID);
	
	public int degreeAddCard(MyAPP APP);
}
