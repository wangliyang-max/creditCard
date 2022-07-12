package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.po.BKURI;

@Repository("BKURIDao")
@Mapper
public interface BKURIDao {

	public List<BKURI> selectBKURIByYear(String cSTID) ;

}
