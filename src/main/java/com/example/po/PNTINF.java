package com.example.po;

import java.util.Date;

//积分奖励信息表
public class PNTINF {
	//积分信息ID
	//PNTINFID NVARCHAR2(18)
	private String PNTINFID;
	//客户ID
	//CSTID NVARCHAR2(10) NOT NULL,
	private String CSTID;
	//本人家属,
	//HNNKZK NCHAR(1) NOT NULL
	private String HNNKZK;
	//销售情况
	//URSEQ NVARCHAR2(18),
	private String URSEQ;
	//事务处理日期
	//TRITIM TIMESTAMP,
	private String TRITIM;
	//协作状态
	//RKSTS NCHAR(1),
	private String RKSTS;
	//点数
	//PNTCOU NUMBER(8,0),
	private int PNTCOU;
	//预定获得年月日
	//KTKYTIYM NVARCHAR2(6),
	private String KTKYTIYM;
	//市场活动标识
	//CAMPID NVARCHAR2(18),
	private String CAMPID;
	//注册日期
	//INSERTDTE TIMESTAMP NOT NULL,
	private String INSERTDTE;
	//注册用户ID
	//INSERTID NVARCHAR2(30) NOT NULL,
	private String INSERTID;
	//更新日期
	//UPDATEDTE TIMESTAMP NOT NULL,
	private String UPDATEDTE;
	//更新后的用户ID
	//UPDATEID  NVARCHAR2(30) NOT NULL
	private String UPDATEID;
	//删除标志
	//DELETEFLG NCHAR(1) NOT NULL,
	private String DELETEFLG;
	//理论上的删除日期
	//DELETEDTE TIMESTAMP
	private String DELETEDTE;
	
	public String getPNTINFID() {
		return PNTINFID;
	}
	public void setPNTINFID(String pNTINFID) {
		PNTINFID = pNTINFID;
	}
	public String getCSTID() {
		return CSTID;
	}
	public void setCSTID(String cSTID) {
		CSTID = cSTID;
	}
	public String getHNNKZK() {
		return HNNKZK;
	}
	public void setHNNKZK(String hNNKZK) {
		HNNKZK = hNNKZK;
	}
	public String getURSEQ() {
		return URSEQ;
	}
	public void setURSEQ(String uRSEQ) {
		URSEQ = uRSEQ;
	}
	public String getTRITIM() {
		return TRITIM;
	}
	public void setTRITIM(String string) {
		TRITIM = string;
	}
	public String getRKSTS() {
		return RKSTS;
	}
	public void setRKSTS(String rKSTS) {
		RKSTS = rKSTS;
	}
	public int getPNTCOU() {
		return PNTCOU;
	}
	public void setPNTCOU(int pNTCOU) {
		PNTCOU = pNTCOU;
	}
	public String getKTKYTIYM() {
		return KTKYTIYM;
	}
	public void setKTKYTIYM(String kTKYTIYM) {
		KTKYTIYM = kTKYTIYM;
	}
	public String getCAMPID() {
		return CAMPID;
	}
	public void setCAMPID(String cAMPID) {
		CAMPID = cAMPID;
	}
	public String getINSERTDTE() {
		return INSERTDTE;
	}
	public void setINSERTDTE(String string) {
		INSERTDTE = string;
	}
	public String getINSERTID() {
		return INSERTID;
	}
	public void setINSERTID(String iNSERTID) {
		INSERTID = iNSERTID;
	}
	public String getUPDATEDTE() {
		return UPDATEDTE;
	}
	public void setUPDATEDTE(String string) {
		UPDATEDTE = string;
	}
	public String getUPDATEID() {
		return UPDATEID;
	}
	public void setUPDATEID(String uPDATEID) {
		UPDATEID = uPDATEID;
	}
	public String getDELETEFLG() {
		return DELETEFLG;
	}
	public void setDELETEFLG(String dELETEFLG) {
		DELETEFLG = dELETEFLG;
	}
	public String getDELETEDTE() {
		return DELETEDTE;
	}
	public void setDELETEDTE(String string) {
		DELETEDTE = string;
	}
	@Override
	public String toString() {
		return "PNTINF [PNTINFID=" + PNTINFID + ", CSTID=" + CSTID + ", HNNKZK=" + HNNKZK + ", URSEQ=" + URSEQ
				+ ", TRITIM=" + TRITIM + ", RKSTS=" + RKSTS + ", PNTCOU=" + PNTCOU + ", KTKYTIYM=" + KTKYTIYM
				+ ", CAMPID=" + CAMPID + ", INSERTDTE=" + INSERTDTE + ", INSERTID=" + INSERTID + ", UPDATEDTE="
				+ UPDATEDTE + ", UPDATEID=" + UPDATEID + ", DELETEFLG=" + DELETEFLG + ", DELETEDTE=" + DELETEDTE + "]";
	}
}
