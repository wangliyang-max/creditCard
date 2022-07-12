package com.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.po.BKURI;

@Repository("BKURIInputDao")
@Mapper
public interface BKURIInputDao {
	
	public Integer insertBKURI(BKURI bkuri) ;

}
