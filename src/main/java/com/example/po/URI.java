package com.example.po;

import java.util.Date;

// 销售
public class URI {
	// 销售情况
	private String SEQ;
	// 加盟店编号
	private String KMTCD;
	// 加盟店名称（商户名称）
	private String KMTNAM;
	// POS编号
	private String POSCD;
	// 发票编号
	private String DPYCD;
	// 事务处理日期
	private Date TRITIM;
	// 卡号
	private String CRDCD;
	// 分期付款次数（分期付款时间）
	private Integer BKTSKZ;
	// 销售额
	private Integer UAG;
	// 客户ID
	private String CSTID;
	// 本人家庭
	private String HNNKZK;
	// 请求日期
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
	public String getKMTCD() {
		return KMTCD;
	}
	public void setKMTCD(String kMTCD) {
		KMTCD = kMTCD;
	}
	public String getKMTNAM() {
		return KMTNAM;
	}
	public void setKMTNAM(String kMTNAM) {
		KMTNAM = kMTNAM;
	}
	public String getPOSCD() {
		return POSCD;
	}
	public void setPOSCD(String pOSCD) {
		POSCD = pOSCD;
	}
	public String getDPYCD() {
		return DPYCD;
	}
	public void setDPYCD(String dPYCD) {
		DPYCD = dPYCD;
	}
	public Date getTRITIM() {
		return TRITIM;
	}
	public void setTRITIM(Date tRITIM) {
		TRITIM = tRITIM;
	}
	public String getCRDCD() {
		return CRDCD;
	}
	public void setCRDCD(String cRDCD) {
		CRDCD = cRDCD;
	}
	public Integer getBKTSKZ() {
		return BKTSKZ;
	}
	public void setBKTSKZ(Integer bKTSKZ) {
		BKTSKZ = bKTSKZ;
	}
	public Integer getUAG() {
		return UAG;
	}
	public void setUAG(Integer uAG) {
		UAG = uAG;
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
		return "URI [SEQ=" + SEQ + ", KMTCD=" + KMTCD + ", KMTNAM=" + KMTNAM + ", POSCD=" + POSCD + ", DPYCD=" + DPYCD
				 + ", TRITIM=" + TRITIM + ", CRDCD=" + CRDCD + ", BKTSKZ=" + BKTSKZ + ", UAG=" + UAG
				+ ", CSTID=" + CSTID + ", HNNKZK=" + HNNKZK + ", SKYYM=" + SKYYM + ", TSKFLG=" + TSKFLG + ", INSERTDTE="
				+ INSERTDTE + ", INSERTID=" + INSERTID + ", UPDATEDTE=" + UPDATEDTE + ", UPDATEID=" + UPDATEID
				+ ", DELETEFLG=" + DELETEFLG + ", DELETEDTE=" + DELETEDTE + "]";
	}
	
}
