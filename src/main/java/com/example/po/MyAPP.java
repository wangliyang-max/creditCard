package com.example.po;

//import java.util.Date;

public class MyAPP {
	public String APPCD     ;// APPid
    public String getAPPCD() {
        return APPCD;
    }
    public void setAPPCD(String APPCD) {
        this.APPCD = APPCD;
    }
    
	public String APPID     ;// 客户id
    public String CSTID     ;// 客户id
    public String SYOKBN    ;// 处理区分
    public String MAIL      ;// 电子邮件
    public String BER       ;// 出生年月日
    public String PHO       ;// 手机
//    public Date UKTTME    ;// 受理日期
    public String APPSTS    ;// 申请状况
    public String BRDCD     ;// 品牌编号
    public String CRDSHUCD  ;// 卡的类型编码
    public String KJNHJN    ;// 个人法人
    public String SEIKJ     ;// 姓氏汉字
    public String SEIKN     ;// 姓氏加奈
    public String SEIEN     ;// 姓氏罗马
    public String MEIKJ     ;// 名称汉字
    public String MEIKN     ;// 名称加奈
    public String MEIEN     ;// 名称罗马
    public String SEX       ;// 性别
    public String JKYSBT    ;// 居住类型
    public String TEL       ;// 电话号码
    public String POST      ;// 邮政编码
    public String KNC       ;// 县级编号
    public String JSKJ1     ;// 地址汉字1
    public String JSKJ2     ;// 地址汉字2
    public String JSKN1     ;// 地址加奈1
    public String JSKN2     ;// 地址加奈2
    public String SPGTORKBN ;// 购物额度分类
    public String SPGKBN    ;// 购物交易目的分类
    public String CSGKBN    ;// 现金预支额度分类
    public String TORKBN    ;// 现金预支交易目的分类
    public String DRIVERID  ;// 驾驶执照
    public String KKHCD     ;// 医疗保险卡
    public String HGSUMK    ;// 是否有配偶
    public String KZKMLFLG  ;// 是否希望收到家庭卡信息电子邮件
    public String CAMMLFLG  ;// 是否愿意接收竞选邮件
    public String BANKCD    ;// 金融机构编码
    public String BCHCD     ;// 分公司编号
    public String YKN       ;// 存款类型
    public String ACTCD     ;// 账号
    public String ACTNAE    ;// 帐户户主
    public String ACTKKNDTE ;// 账户确认日期
    public String ACTKKNID  ;// 帐户确认 工作人员
    public String ACTKKNNAM ;// 账户确认人姓名
    public String AGTCD     ;// 机构编码
    public String HNNHHUCD  ;// 识别方法编码
    public String HNNFLG    ;// 身份验证的标志
    public String HKS1      ;// 本人确认信息1
    public String HKS2      ;// 本人确认信息2
    public String HKS3      ;// 本人确认信息3
    public String HKS4      ;// 本人确认信息4
    public String HNNKKNDTE ;// 本人确认日
    public String HNNKKNID  ;// 本人确认担当者ID
    public String HNNKKNNAM ;// 本人确认担当者姓名
    public String GYOCD     ;// 行业编码
    public String KMS       ;// 雇主名
    public String KMSDEP    ;// 雇主部门
    public String KMSTEL    ;// 雇主电话
    public String KMSJS1    ;// 雇主第一居所
    public String KMSJS2    ;// 雇主第二居所
    public String NSHYM     ;// 入职日期
    public String NSG       ;// 年收入
    public String KZKKBN    ;// 家属卡
    public String KZKFLG    ;// 家庭确认标志
    public String KZKSEIKJ  ;// 家族姓汉字
    public String KZKSEIKN  ;// 家族姓加奈
    public String KZKSEIEN  ;// 家族姓罗马
    public String KZKMEIKJ  ;// 家族名汉字
    public String KZKMEIKN  ;// 家族名加奈
    public String KZKMEIEN  ;// 家族名罗马
    public String KZKSEX    ;// 家族性别
    public String KZKGYOCD  ;// 家庭行业编码
    public String KZKKMS    ;// 家庭成员的行业姓名
    public String KZKKMSDEP ;// 家庭成员的行业部门名称
    public String KZKKMSTEL ;// 家庭成员的行业电话
    public String KZKHHUCD  ;// 家庭识别方法编码
    public String KZKKS1    ;// 家庭确认资料1
    public String KZKKS2    ;// 家庭确认资料2
    public String KZKKS3    ;// 家庭确认资料3
    public String KZKKS4    ;// 家庭确认资料4
    public String KZKKKNDTE ;// 家庭确认日
    public String KZKKKNID  ;// 家庭确认担当人ID
    public String KZKKKNNAM ;// 家庭确认担当人名字
    public String YSNINF    ;// 信用信息
    public String SKJSSKFLG ;// 即刻审查标志
//    public Date SSKIRITME ;// 请求审查的日期和时间
    public String SSKCD     ;// 审查结果
//    public Date SSKJRYTME ;// 审查结果受领日期
//    public Date APPCNCTME ;// 申请取消日期和时间
    public String OLDCRDCD  ;// 旧卡号
//    public Date INSERTDTE ;// 注册日期
    public String INSERTID  ;// 注册用户ID
//    public Date UPDATEDTE ;// 更新日期
    public String UPDATEID  ;// 更新后的用户ID
    public String DELETEFLG ;// 删除标志
//    public Date DELETEDTE ;// 理论上的删除日期
    public String ETCFLG;//ETC编码(自己添加的)
    
    public String UKTTME    ;// 受理日期
    public String SSKIRITME ;// 请求审查的日期和时间
    public String SSKJRYTME ;// 审查结果受领日期
    public String APPCNCTME ;// 申请取消日期和时间
    public String INSERTDTE ;
    public String UPDATEDTE ;
    public String DELETEDTE ;
    
    
    
    public String getUKTTME() {
	return UKTTME;
	}
	public void setUKTTME(String UKTTME) {
	this.UKTTME = UKTTME;
	}
	public String getSSKIRITME() {
	return SSKIRITME;
	}
	public void setSSKIRITME(String SSKIRITME) {
	this.SSKIRITME = SSKIRITME;
	}
	public String getSSKJRYTME() {
	return SSKJRYTME;
	}
	public void setSSKJRYTME(String SSKJRYTME) {
	this.SSKJRYTME = SSKJRYTME;
	}
	public String getAPPCNCTME() {
	return APPCNCTME;
	}
	public void setAPPCNCTME(String APPCNCTME) {
	this.APPCNCTME = APPCNCTME;
	}
	public String getINSERTDTE() {
	return INSERTDTE;
	}

	public void setINSERTDTE(String INSERTDTE) {
	this.INSERTDTE = INSERTDTE;
	}
	public String getUPDATEDTE() {
	return UPDATEDTE;
	}

	public void setUPDATEDTE(String UPDATEDTE) {
	this.UPDATEDTE = UPDATEDTE;
	}
	public String getDELETEDTE() {
	return DELETEDTE;
	}

	public void setDELETEDTE(String DELETEDTE) {
	this.DELETEDTE = DELETEDTE;
	}
    
    
    
public String getAPPID() {
return APPID;
}

public void setAPPID(String APPID) {
this.APPID = APPID;
}

public String getETCFLG() {
return ETCFLG;
}

public void setETCFLG(String ETCFLG) {
this.ETCFLG =ETCFLG;
}

public String getCSTID() {
return CSTID;
}

public void setCSTID(String CSTID) {
this.CSTID = CSTID;
}

public String getSYOKBN() {
return SYOKBN;
}

public void setSYOKBN(String SYOKBN) {
this.SYOKBN = SYOKBN;
}

public String getMAIL() {
return MAIL;
}

public void setMAIL(String MAIL) {
this.MAIL = MAIL;
}

public String getBER() {
return BER;
}

public void setBER(String BER) {
this.BER = BER;
}

public String getPHO() {
return PHO;
}

public void setPHO(String PHO) {
this.PHO = PHO;
}

//public Date getUKTTME() {
//return UKTTME;
//}
//
//public void setUKTTME(Date UKTTME) {
//this.UKTTME = UKTTME;
//}

public String getAPPSTS() {
return APPSTS;
}

public void setAPPSTS(String APPSTS) {
this.APPSTS = APPSTS;
}

public String getBRDCD() {
return BRDCD;
}

public void setBRDCD(String BRDCD) {
this.BRDCD = BRDCD;
}

public String getCRDSHUCD() {
return CRDSHUCD;
}

public void setCRDSHUCD(String CRDSHUCD) {
this.CRDSHUCD = CRDSHUCD;
}

public String getKJNHJN() {
return KJNHJN;
}

public void setKJNHJN(String KJNHJN) {
this.KJNHJN = KJNHJN;
}

public String getSEIKJ() {
return SEIKJ;
}

public void setSEIKJ(String SEIKJ) {
this.SEIKJ = SEIKJ;
}

public String getSEIKN() {
return SEIKN;
}

public void setSEIKN(String SEIKN) {
this.SEIKN = SEIKN;
}

public String getSEIEN() {
return SEIEN;
}

public void setSEIEN(String SEIEN) {
this.SEIEN = SEIEN;
}

public String getMEIKJ() {
return MEIKJ;
}

public void setMEIKJ(String MEIKJ) {
this.MEIKJ = MEIKJ;
}

public String getMEIKN() {
return MEIKN;
}

public void setMEIKN(String MEIKN) {
this.MEIKN = MEIKN;
}

public String getMEIEN() {
return MEIEN;
}

public void setMEIEN(String MEIEN) {
this.MEIEN = MEIEN;
}

public String getSEX() {
return SEX;
}

public void setSEX(String SEX) {
this.SEX = SEX;
}

public String getJKYSBT() {
return JKYSBT;
}

public void setJKYSBT(String JKYSBT) {
this.JKYSBT = JKYSBT;
}

public String getTEL() {
return TEL;
}

public void setTEL(String TEL) {
this.TEL = TEL;
}

public String getPOST() {
return POST;
}

public void setPOST(String POST) {
this.POST = POST;
}

public String getKNC() {
return KNC;
}

public void setKNC(String KNC) {
this.KNC = KNC;
}

public String getJSKJ1() {
return JSKJ1;
}

public void setJSKJ1(String JSKJ1) {
this.JSKJ1 = JSKJ1;
}

public String getJSKJ2() {
return JSKJ2;
}

public void setJSKJ2(String JSKJ2) {
this.JSKJ2 = JSKJ2;
}

public String getJSKN1() {
return JSKN1;
}

public void setJSKN1(String JSKN1) {
this.JSKN1 = JSKN1;
}

public String getJSKN2() {
return JSKN2;
}

public void setJSKN2(String JSKN2) {
this.JSKN2 = JSKN2;
}

public String getSPGTORKBN() {
return SPGTORKBN;
}

public void setSPGTORKBN(String SPGTORKBN) {
this.SPGTORKBN = SPGTORKBN;
}

public String getSPGKBN() {
return SPGKBN;
}

public void setSPGKBN(String SPGKBN) {
this.SPGKBN = SPGKBN;
}

public String getCSGKBN() {
return CSGKBN;
}

public void setCSGKBN(String CSGKBN) {
this.CSGKBN = CSGKBN;
}

public String getTORKBN() {
return TORKBN;
}

public void setTORKBN(String TORKBN) {
this.TORKBN = TORKBN;
}

public String getDRIVERID() {
return DRIVERID;
}

public void setDRIVERID(String DRIVERID) {
this.DRIVERID = DRIVERID;
}

public String getKKHCD() {
return KKHCD;
}

public void setKKHCD(String KKHCD) {
this.KKHCD = KKHCD;
}

public String getHGSUMK() {
return HGSUMK;
}

public void setHGSUMK(String HGSUMK) {
this.HGSUMK = HGSUMK;
}

public String getKZKMLFLG() {
return KZKMLFLG;
}

public void setKZKMLFLG(String KZKMLFLG) {
this.KZKMLFLG = KZKMLFLG;
}

public String getCAMMLFLG() {
return CAMMLFLG;
}

public void setCAMMLFLG(String CAMMLFLG) {
this.CAMMLFLG = CAMMLFLG;
}

public String getBANKCD() {
return BANKCD;
}

public void setBANKCD(String BANKCD) {
this.BANKCD = BANKCD;
}

public String getBCHCD() {
return BCHCD;
}

public void setBCHCD(String BCHCD) {
this.BCHCD = BCHCD;
}

public String getYKN() {
return YKN;
}

public void setYKN(String YKN) {
this.YKN = YKN;
}

public String getACTCD() {
return ACTCD;
}

public void setACTCD(String ACTCD) {
this.ACTCD = ACTCD;
}

public String getACTNAE() {
return ACTNAE;
}

public void setACTNAE(String ACTNAE) {
this.ACTNAE = ACTNAE;
}

public String getACTKKNDTE() {
return ACTKKNDTE;
}

public void setACTKKNDTE(String ACTKKNDTE) {
this.ACTKKNDTE = ACTKKNDTE;
}

public String getACTKKNID() {
return ACTKKNID;
}

public void setACTKKNID(String ACTKKNID) {
this.ACTKKNID = ACTKKNID;
}

public String getACTKKNNAM() {
return ACTKKNNAM;
}

public void setACTKKNNAM(String ACTKKNNAM) {
this.ACTKKNNAM = ACTKKNNAM;
}

public String getAGTCD() {
return AGTCD;
}

public void setAGTCD(String AGTCD) {
this.AGTCD = AGTCD;
}

public String getHNNHHUCD() {
return HNNHHUCD;
}

public void setHNNHHUCD(String HNNHHUCD) {
this.HNNHHUCD = HNNHHUCD;
}

public String getHNNFLG() {
return HNNFLG;
}

public void setHNNFLG(String HNNFLG) {
this.HNNFLG = HNNFLG;
}

public String getHKS1() {
return HKS1;
}

public void setHKS1(String HKS1) {
this.HKS1 = HKS1;
}

public String getHKS2() {
return HKS2;
}

public void setHKS2(String HKS2) {
this.HKS2 = HKS2;
}

public String getHKS3() {
return HKS3;
}

public void setHKS3(String HKS3) {
this.HKS3 = HKS3;
}

public String getHKS4() {
return HKS4;
}

public void setHKS4(String HKS4) {
this.HKS4 = HKS4;
}

public String getHNNKKNDTE() {
return HNNKKNDTE;
}

public void setHNNKKNDTE(String HNNKKNDTE) {
this.HNNKKNDTE = HNNKKNDTE;
}

public String getHNNKKNID() {
return HNNKKNID;
}

public void setHNNKKNID(String HNNKKNID) {
this.HNNKKNID = HNNKKNID;
}

public String getHNNKKNNAM() {
return HNNKKNNAM;
}

public void setHNNKKNNAM(String HNNKKNNAM) {
this.HNNKKNNAM = HNNKKNNAM;
}

public String getGYOCD() {
return GYOCD;
}

public void setGYOCD(String GYOCD) {
this.GYOCD = GYOCD;
}

public String getKMS() {
return KMS;
}

public void setKMS(String KMS) {
this.KMS = KMS;
}

public String getKMSDEP() {
return KMSDEP;
}

public void setKMSDEP(String KMSDEP) {
this.KMSDEP = KMSDEP;
}

public String getKMSTEL() {
return KMSTEL;
}

public void setKMSTEL(String KMSTEL) {
this.KMSTEL = KMSTEL;
}

public String getKMSJS1() {
return KMSJS1;
}

public void setKMSJS1(String KMSJS1) {
this.KMSJS1 = KMSJS1;
}

public String getKMSJS2() {
return KMSJS2;
}

public void setKMSJS2(String KMSJS2) {
this.KMSJS2 = KMSJS2;
}

public String getNSHYM() {
return NSHYM;
}

public void setNSHYM(String NSHYM) {
this.NSHYM = NSHYM;
}

public String getNSG() {
return NSG;
}

public void setNSG(String NSG) {
this.NSG = NSG;
}

public String getKZKKBN() {
return KZKKBN;
}

public void setKZKKBN(String KZKKBN) {
this.KZKKBN = KZKKBN;
}

public String getKZKFLG() {
return KZKFLG;
}

public void setKZKFLG(String KZKFLG) {
this.KZKFLG = KZKFLG;
}

public String getKZKSEIKJ() {
return KZKSEIKJ;
}

public void setKZKSEIKJ(String KZKSEIKJ) {
this.KZKSEIKJ = KZKSEIKJ;
}

public String getKZKSEIKN() {
return KZKSEIKN;
}

public void setKZKSEIKN(String KZKSEIKN) {
this.KZKSEIKN = KZKSEIKN;
}

public String getKZKSEIEN() {
return KZKSEIEN;
}

public void setKZKSEIEN(String KZKSEIEN) {
this.KZKSEIEN = KZKSEIEN;
}

public String getKZKMEIKJ() {
return KZKMEIKJ;
}

public void setKZKMEIKJ(String KZKMEIKJ) {
this.KZKMEIKJ = KZKMEIKJ;
}

public String getKZKMEIKN() {
return KZKMEIKN;
}

public void setKZKMEIKN(String KZKMEIKN) {
this.KZKMEIKN = KZKMEIKN;
}

public String getKZKMEIEN() {
return KZKMEIEN;
}

public void setKZKMEIEN(String KZKMEIEN) {
this.KZKMEIEN = KZKMEIEN;
}

public String getKZKSEX() {
return KZKSEX;
}

public void setKZKSEX(String KZKSEX) {
this.KZKSEX = KZKSEX;
}

public String getKZKGYOCD() {
return KZKGYOCD;
}

public void setKZKGYOCD(String KZKGYOCD) {
this.KZKGYOCD = KZKGYOCD;
}

public String getKZKKMS() {
return KZKKMS;
}

public void setKZKKMS(String KZKKMS) {
this.KZKKMS = KZKKMS;
}

public String getKZKKMSDEP() {
return KZKKMSDEP;
}

public void setKZKKMSDEP(String KZKKMSDEP) {
this.KZKKMSDEP = KZKKMSDEP;
}

public String getKZKKMSTEL() {
return KZKKMSTEL;
}

public void setKZKKMSTEL(String KZKKMSTEL) {
this.KZKKMSTEL = KZKKMSTEL;
}

public String getKZKHHUCD() {
return KZKHHUCD;
}

public void setKZKHHUCD(String KZKHHUCD) {
this.KZKHHUCD = KZKHHUCD;
}

public String getKZKKS1() {
return KZKKS1;
}

public void setKZKKS1(String KZKKS1) {
this.KZKKS1 = KZKKS1;
}

public String getKZKKS2() {
return KZKKS2;
}

public void setKZKKS2(String KZKKS2) {
this.KZKKS2 = KZKKS2;
}

public String getKZKKS3() {
return KZKKS3;
}

public void setKZKKS3(String KZKKS3) {
this.KZKKS3 = KZKKS3;
}

public String getKZKKS4() {
return KZKKS4;
}

public void setKZKKS4(String KZKKS4) {
this.KZKKS4 = KZKKS4;
}

public String getKZKKKNDTE() {
return KZKKKNDTE;
}

public void setKZKKKNDTE(String KZKKKNDTE) {
this.KZKKKNDTE = KZKKKNDTE;
}

public String getKZKKKNID() {
return KZKKKNID;
}

public void setKZKKKNID(String KZKKKNID) {
this.KZKKKNID = KZKKKNID;
}

public String getKZKKKNNAM() {
return KZKKKNNAM;
}

public void setKZKKKNNAM(String KZKKKNNAM) {
this.KZKKKNNAM = KZKKKNNAM;
}

public String getYSNINF() {
return YSNINF;
}

public void setYSNINF(String YSNINF) {
this.YSNINF = YSNINF;
}

public String getSKJSSKFLG() {
return SKJSSKFLG;
}

public void setSKJSSKFLG(String SKJSSKFLG) {
this.SKJSSKFLG = SKJSSKFLG;
}

//public Date getSSKIRITME() {
//return SSKIRITME;
//}
//
//public void setSSKIRITME(Date SSKIRITME) {
//this.SSKIRITME = SSKIRITME;
//}

public String getSSKCD() {
return SSKCD;
}

public void setSSKCD(String SSKCD) {
this.SSKCD = SSKCD;
}

//public Date getSSKJRYTME() {
//return SSKJRYTME;
//}
//
//public void setSSKJRYTME(Date SSKJRYTME) {
//this.SSKJRYTME = SSKJRYTME;
//}
//
//public Date getAPPCNCTME() {
//return APPCNCTME;
//}
//
//public void setAPPCNCTME(Date APPCNCTME) {
//this.APPCNCTME = APPCNCTME;
//}

public String getOLDCRDCD() {
return OLDCRDCD;
}

public void setOLDCRDCD(String OLDCRDCD) {
this.OLDCRDCD = OLDCRDCD;
}

//public Date getINSERTDTE() {
//return INSERTDTE;
//}
//
//public void setINSERTDTE(Date INSERTDTE) {
//this.INSERTDTE = INSERTDTE;
//}

public String getINSERTID() {
return INSERTID;
}

public void setINSERTID(String INSERTID) {
this.INSERTID = INSERTID;
}

//public Date getUPDATEDTE() {
//return UPDATEDTE;
//}
//
//public void setUPDATEDTE(Date UPDATEDTE) {
//this.UPDATEDTE = UPDATEDTE;
//}

public String getUPDATEID() {
return UPDATEID;
}

public void setUPDATEID(String UPDATEID) {
this.UPDATEID = UPDATEID;
}

public String getDELETEFLG() {
return DELETEFLG;
}

public void setDELETEFLG(String DELETEFLG) {
this.DELETEFLG = DELETEFLG;
}

//public Date getDELETEDTE() {
//return DELETEDTE;
//}
//
//public void setDELETEDTE(Date DELETEDTE) {
//this.DELETEDTE = DELETEDTE;
//}
}
