package com.example.po;

import java.util.Date;

//积分合计管理表
public class PNTSYKKNR {
	//客户ID
	private String CSTID;
	//合计日期
	private String SYKDTE;
	//协作时间
	private String RKDTE;
	//点数合计
	private int PNTCOU;
	//注册日期
	private String INSERTDTE;
	//注册用户ID
	private String INSERTID;
	//更新日期
	private String UPDATEDTE;
	//更新后的用户ID
	private String UPDATEID;
	//删除标志
	private String DELETEFLG;
	//理论上的删除日期
	private String DELETEDTE;
	
	public String getCSTID() {
		return CSTID;
	}
	public void setCSTID(String cSTID) {
		CSTID = cSTID;
	}
	public String getSYKDTE() {
		return SYKDTE;
	}
	public void setSYKDTE(String sYKDTE) {
		SYKDTE = sYKDTE;
	}
	public String getRKDTE() {
		return RKDTE;
	}
	public void setRKDTE(String string) {
		RKDTE = string;
	}
	public int getPNTCOU() {
		return PNTCOU;
	}
	public void setPNTCOU(int pNTCOU) {
		PNTCOU = pNTCOU;
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
		return "PNTSYKKNR [CSTID=" + CSTID + ", SYKDTE=" + SYKDTE + ", RKDTE=" + RKDTE + ", PNTCOU=" + PNTCOU
				+ ", INSERTDTE=" + INSERTDTE + ", INSERTID=" + INSERTID + ", UPDATEDTE=" + UPDATEDTE + ", UPDATEID="
				+ UPDATEID + ", DELETEFLG=" + DELETEFLG + ", DELETEDTE=" + DELETEDTE + "]";
	}
}
