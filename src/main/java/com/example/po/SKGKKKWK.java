package com.example.po;

import java.util.Date;

// 暂结发票额工件
public class SKGKKKWK {
	// 客户ID
	private String CSTID;
	// 请求日期
	private String ISKYYM;
	// 开单金额
	private Integer SKG;
	// 金融机构代码
	private String BANKCD;
	// 分行代码
	private String BCHCD;
	// 付款种类
	private String YKN;
	// 账号
	private String ACTNO;
	// 开户人
	private String ACTNAE;
	// 处理标志
	private String SYOFLG;
	// 分期付款次数（分期付款时间）
	private Integer BKTSKZ;
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
	public String getCSTID() {
		return CSTID;
	}
	public void setCSTID(String cSTID) {
		CSTID = cSTID;
	}
	public String getISKYYM() {
		return ISKYYM;
	}
	public void setISKYYM(String iSKYYM) {
		ISKYYM = iSKYYM;
	}
	public Integer getSKG() {
		return SKG;
	}
	public void setSKG(Integer sKG) {
		SKG = sKG;
	}
	public String getBANKCD() {
		return BANKCD;
	}
	public void setBANKCD(String bANKCD) {
		BANKCD = bANKCD;
	}
	public String getBCHCD() {
		return BCHCD;
	}
	public void setBCHCD(String bCHCD) {
		BCHCD = bCHCD;
	}
	public String getYKN() {
		return YKN;
	}
	public void setYKN(String yKN) {
		YKN = yKN;
	}
	public String getACTNO() {
		return ACTNO;
	}
	public void setACTNO(String aCTNO) {
		ACTNO = aCTNO;
	}
	public String getACTNAE() {
		return ACTNAE;
	}
	public void setACTNAE(String aCTNAE) {
		ACTNAE = aCTNAE;
	}
	public String getSYOFLG() {
		return SYOFLG;
	}
	public void setSYOFLG(String sYOFLG) {
		SYOFLG = sYOFLG;
	}
	public Integer getBKTSKZ() {
		return BKTSKZ;
	}
	public void setBKTSKZ(Integer bKTSKZ) {
		BKTSKZ = bKTSKZ;
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
		return "SKGKKKWK [CSTID=" + CSTID + ", ISKYYM=" + ISKYYM + ", SKG=" + SKG + ", BANKCD=" + BANKCD + ", BCHCD="
				+ BCHCD + ", YKN=" + YKN + ", ACTNO=" + ACTNO + ", ACTNAE=" + ACTNAE + ", SYOFLG=" + SYOFLG
				+ ", BKTSKZ=" + BKTSKZ + ", INSERTDTE=" + INSERTDTE + ", INSERTID=" + INSERTID + ", UPDATEDTE="
				+ UPDATEDTE + ", UPDATEID=" + UPDATEID + ", DELETEFLG=" + DELETEFLG + ", DELETEDTE=" + DELETEDTE + "]";
	}
	
	
}
