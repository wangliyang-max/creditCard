package com.example.po;

import java.util.Date;

// 分期销售
public class BKURI {
	// 销售情况
	private String SEQ;
	// 期号
	private Integer KINO;
	// 客户ID
	private String CSTID;
	// 本人家庭(区分)
	private String HNNKZK;
	// 分期付款额
	private Integer BKUAG;
	// 手续费
	private String TESURYO;
	// 支付额（销售额）
	private String TSK;
	// 请求日期（交易日）
	private String SKYYM;
	// 付款标志
	private String TSKFLG;
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
	public String getSEQ() {
		return SEQ;
	}
	public void setSEQ(String sEQ) {
		SEQ = sEQ;
	}
	public Integer getKINO() {
		return KINO;
	}
	public void setKINO(Integer kINO) {
		KINO = kINO;
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
	public Integer getBKUAG() {
		return BKUAG;
	}
	public void setBKUAG(Integer bKUAG) {
		BKUAG = bKUAG;
	}
	public String getTESURYO() {
		return TESURYO;
	}
	public void setTESURYO(String tESURYO) {
		TESURYO = tESURYO;
	}
	public String getTSK() {
		return TSK;
	}
	public void setTSK(String tSK) {
		TSK = tSK;
	}
	public String getSKYYM() {
		return SKYYM;
	}
	public void setSKYYM(String sKYYM) {
		SKYYM = sKYYM;
	}
	public String getTSKFLG() {
		return TSKFLG;
	}
	public void setTSKFLG(String tSKFLG) {
		TSKFLG = tSKFLG;
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
	@Override
	public String toString() {
		return "BKURI [SEQ=" + SEQ + ", KINO=" + KINO + ", CSTID=" + CSTID + ", HNNKZK=" + HNNKZK + ", BKUAG=" + BKUAG
				+ ", TESURYO=" + TESURYO + ", TSK=" + TSK + ", SKYYM=" + SKYYM + ", TSKFLG=" + TSKFLG + ", INSERTDTE="
				+ INSERTDTE + ", INSERTID=" + INSERTID + ", UPDATEDTE=" + UPDATEDTE + ", UPDATEID=" + UPDATEID
				+ ", DELETEFLG=" + DELETEFLG + ", DELETEDTE=" + DELETEDTE + ", getSEQ()=" + getSEQ() + ", getKINO()="
				+ getKINO() + ", getCSTID()=" + getCSTID() + ", getHNNKZK()=" + getHNNKZK() + ", getBKUAG()="
				+ getBKUAG() + ", getTESURYO()=" + getTESURYO() + ", getTSK()=" + getTSK() + ", getSKYYM()="
				+ getSKYYM() + ", getTSKFLG()=" + getTSKFLG() + ", getINSERTDTE()=" + getINSERTDTE()
				+ ", getINSERTID()=" + getINSERTID() + ", getUPDATEDTE()=" + getUPDATEDTE() + ", getUPDATEID()="
				+ getUPDATEID() + ", getDELETEFLG()=" + getDELETEFLG() + ", getDELETEDTE()=" + getDELETEDTE()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


	
}
