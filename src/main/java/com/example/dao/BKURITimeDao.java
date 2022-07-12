package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.po.BKURI;

@Repository("BKURITimeDao")
@Mapper
public interface BKURITimeDao {

	public List<BKURI> selectBKURIByTime(@Param("STIME") String sTIME, @Param("ETIME") String eTIME);

}
