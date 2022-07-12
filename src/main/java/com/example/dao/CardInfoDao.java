package com.example.dao;




import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.po.CRD;


@Repository("cardInfoDao")
@Mapper
public interface CardInfoDao {

	public CRD selectCardInfo(String CSTID);
}
