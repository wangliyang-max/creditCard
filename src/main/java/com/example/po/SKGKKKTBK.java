package com.example.po;

import java.util.Date;

// 请求额确定分割
public class SKGKKKTBK {
	// 开单情商
	private String SKGSEQ;
	// 顾客ID
	private String CSTID;
	// 请求日期
	private String SKYYM;
	// 开单金额
	private Integer SKG;
	// 发票处理状态
	private String SKGSYOSTS;
	// 注册时间
	private Date INSERTDTE;
	// 注册用户ID
	private String INSERTID;
	// 更新时间
	private Date UPDATEDTE;
	// 更新用户ID
	private String UPDATEID;
	// 删除标志
	private String DELETEFLG;
	// 逻辑删除日期
	private Date DELETEDTE;
	@Override
	public String toString() {
		return "SKGKKKTBK [SKGSEQ=" + SKGSEQ + ", CSTID=" + CSTID + ", SKYYM=" + SKYYM + ", SKG=" + SKG + ", SKGSYOSTS="
				+ SKGSYOSTS + ", INSERTDTE=" + INSERTDTE + ", INSERTID=" + INSERTID + ", UPDATEDTE=" + UPDATEDTE
				+ ", UPDATEID=" + UPDATEID + ", DELETEFLG=" + DELETEFLG + ", DELETEDTE=" + DELETEDTE + "]";
	}
	public String getSKGSEQ() {
		return SKGSEQ;
	}
	public void setSKGSEQ(String sKGSEQ) {
		SKGSEQ = sKGSEQ;
	}
	public String getCSTID() {
		return CSTID;
	}
	public void setCSTID(String cSTID) {
		CSTID = cSTID;
	}
	public String getSKYYM() {
		return SKYYM;
	}
	public void setSKYYM(String sKYYM) {
		SKYYM = sKYYM;
	}
	public Integer getSKG() {
		return SKG;
	}
	public void setSKG(Integer sKG) {
		SKG = sKG;
	}
	public String getSKGSYOSTS() {
		return SKGSYOSTS;
	}
	public void setSKGSYOSTS(String sKGSYOSTS) {
		SKGSYOSTS = sKGSYOSTS;
	}
	public Date getINSERTDTE() {
		return INSERTDTE;
	}
	public void setINSERTDTE(Date iNSERTDTE) {
		INSERTDTE = iNSERTDTE;
	}
	public String getINSERTID() {
		return INSERTID;
	}
	public void setINSERTID(String iNSERTID) {
		INSERTID = iNSERTID;
	}
	public Date getUPDATEDTE() {
		return UPDATEDTE;
	}
	public void setUPDATEDTE(Date uPDATEDTE) {
		UPDATEDTE = uPDATEDTE;
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
	public Date getDELETEDTE() {
		return DELETEDTE;
	}
	public void setDELETEDTE(Date dELETEDTE) {
		DELETEDTE = dELETEDTE;
	}

	
}
