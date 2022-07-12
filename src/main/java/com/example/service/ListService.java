package com.example.service;

import java.util.List;

import com.example.po.MyADMINSRES;
import com.example.po.MyUSERSREQ;

public interface ListService {
	public List<MyUSERSREQ> selectUsersReq(String CSTID);
	public List<MyADMINSRES> selectAdminsRes();
	
	public int deleteUsersReq(String REQID);
	public int deleteAdminsRes(String RESID);
	
	public int insertUsersReq(MyUSERSREQ usersReq);
	public int insertAdminRes(MyUSERSREQ usersReq);
	public int insertUsersReqKBN(MyUSERSREQ usersReq);
	public int insertAdminResKBN(MyUSERSREQ usersReq);
	public int insertUsersReqCardChange(MyUSERSREQ usersReq);
	public int insertAdminResCardChange(MyUSERSREQ usersReq);
	public int insertUsersReqDelete(MyUSERSREQ usersReq);
	public int insertAdminResDelete(MyUSERSREQ usersReq);
	
	public MyUSERSREQ selectUsersReqByRegId(String REQID);
	public MyADMINSRES selectAdminResByRegId(String RESID);
	
	public int updateAdminResByRegId(String RESID);
	public int updateAdminResByRegIdRej(String RESID);
	public int updateUserReqByRegId(String RESID);
	public int updateUserReqByRegIdRej(String RESID);
	
	public int changeRESAPP(MyADMINSRES adminRes);
	public int cardAddRESAPP(MyADMINSRES adminsRes);
	public int changeRESCard(MyADMINSRES adminsRes);
	public int deleteAppRESAPP(MyADMINSRES adminsRes);
	
}
