package com.example.po;

import java.util.Date;

// 卡片
public class CRD {
	// 卡号
	private String CRDCD;
	// 客户ID
	private String CSTID;
	// 本人家属
	private String HNNKZK;
	// 最新标志
	private String SSFLG;
	// 品牌代码
	private String CRDSHUCD;
	// 插件类型代码
	private String TAXCD;
	// 卡有效期
	private String CRDYKK;
	// 购物额度（万日元）
	private Integer SPGTORKBN;
	// 时间购物框（万日元）？可兑现额度
	private Integer CSGKBN;
	// 时缓存框（万日元）
	private Integer TSPGTORKBN;
	// 临时增加有效期
	private Integer TCSGKBN;
	// 卡状态
	private String TYKK;
	// 登时日
	private String CRDSTS;
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
	public String getCRDCD() {
		return CRDCD;
	}
	public void setCRDCD(String cRDCD) {
		CRDCD = cRDCD;
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
	public String getSSFLG() {
		return SSFLG;
	}
	public void setSSFLG(String sSFLG) {
		SSFLG = sSFLG;
	}
	public String getCRDSHUCD() {
		return CRDSHUCD;
	}
	public void setCRDSHUCD(String cRDSHUCD) {
		CRDSHUCD = cRDSHUCD;
	}
	public String getTAXCD() {
		return TAXCD;
	}
	public void setTAXCD(String tAXCD) {
		TAXCD = tAXCD;
	}
	public String getCRDYKK() {
		return CRDYKK;
	}
	public void setCRDYKK(String cRDYKK) {
		CRDYKK = cRDYKK;
	}
	public Integer getSPGTORKBN() {
		return SPGTORKBN;
	}
	public void setSPGTORKBN(Integer sPGTORKBN) {
		SPGTORKBN = sPGTORKBN;
	}
	public Integer getCSGKBN() {
		return CSGKBN;
	}
	public void setCSGKBN(Integer cSGKBN) {
		CSGKBN = cSGKBN;
	}
	public Integer getTSPGTORKBN() {
		return TSPGTORKBN;
	}
	public void setTSPGTORKBN(Integer tSPGTORKBN) {
		TSPGTORKBN = tSPGTORKBN;
	}
	public Integer getTCSGKBN() {
		return TCSGKBN;
	}
	public void setTCSGKBN(Integer tCSGKBN) {
		TCSGKBN = tCSGKBN;
	}
	public String getTYKK() {
		return TYKK;
	}
	public void setTYKK(String tYKK) {
		TYKK = tYKK;
	}
	public String getCRDSTS() {
		return CRDSTS;
	}
	public void setCRDSTS(String cRDSTS) {
		CRDSTS = cRDSTS;
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
		return "CRD [CRDCD=" + CRDCD + ", CSTID=" + CSTID + ", HNNKZK=" + HNNKZK + ", SSFLG=" + SSFLG + ", CRDSHUCD="
				+ CRDSHUCD + ", TAXCD=" + TAXCD + ", CRDYKK=" + CRDYKK + ", SPGTORKBN=" + SPGTORKBN + ", CSGKBN="
				+ CSGKBN + ", TSPGTORKBN=" + TSPGTORKBN + ", TCSGKBN=" + TCSGKBN + ", TYKK=" + TYKK + ", CRDSTS="
				+ CRDSTS + ", INSERTDTE=" + INSERTDTE + ", INSERTID=" + INSERTID + ", UPDATEDTE=" + UPDATEDTE
				+ ", UPDATEID=" + UPDATEID + ", DELETEFLG=" + DELETEFLG + ", DELETEDTE=" + DELETEDTE + "]";
	}
	
	
}
