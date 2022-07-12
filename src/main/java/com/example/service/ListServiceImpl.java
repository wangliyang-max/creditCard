package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ListDao;
import com.example.po.MyADMINSRES;
import com.example.po.MyUSERSREQ;

@Service("ListService")
public class ListServiceImpl implements ListService{
	@Autowired
	private ListDao listDao;
	
	public List<MyUSERSREQ> selectUsersReq(String CSTID) {
		return listDao.selectUsersReq(CSTID);
	}
	public List<MyADMINSRES> selectAdminsRes(){
		return listDao.selectAdminsRes();
	}
	public int deleteUsersReq(String REQID) {
		return listDao.deleteUsersReq(REQID);
	}
	public int deleteAdminsRes(String RESID) {
		return listDao.deleteAdminsRes(RESID);
	}
	
	
	public MyUSERSREQ selectUsersReqByRegId(String REQID) {
		return listDao.selectUsersReqByRegId(REQID);
	}
	public MyADMINSRES selectAdminResByRegId(String RESID) {
		return listDao.selectAdminResByRegId(RESID);
	}
	
	public int updateAdminResByRegId(String RESID){
		return listDao.updateAdminResByRegId(RESID);
	}
	public int updateAdminResByRegIdRej(String RESID) {
		return listDao.updateAdminResByRegIdRej(RESID);
	}
	
	public int updateUserReqByRegId(String RESID) {
		return listDao.updateUserReqByRegId(RESID);
	}
	public int updateUserReqByRegIdRej(String RESID) {
		return listDao.updateUserReqByRegIdRej(RESID);
	}
	
	
	public int changeRESAPP(MyADMINSRES adminRes) {
		return listDao.changeRESAPP(adminRes);
	}
	public int cardAddRESAPP(MyADMINSRES adminsRes) {
		return listDao.cardAddRESAPP(adminsRes);
	}
	public int changeRESCard(MyADMINSRES adminsRes) {
		return listDao.changeRESCard(adminsRes);
	}
	public int deleteAppRESAPP(MyADMINSRES adminsRes) {
		return listDao.deleteAppRESAPP(adminsRes);
	}
	
	
	
	public int insertUsersReqKBN(MyUSERSREQ usersReq) {
		return listDao.insertUsersReqKBN(usersReq);
	}
	public int insertAdminResKBN(MyUSERSREQ usersReq) {
		return listDao.insertAdminResKBN(usersReq);
	}
	public int insertUsersReqCardChange(MyUSERSREQ usersReq) {
		return listDao.insertUsersReqCardChange(usersReq);
	}
	public int insertAdminResCardChange(MyUSERSREQ usersReq) {
		return listDao.insertAdminResCardChange(usersReq);
	}
	public int insertUsersReq(MyUSERSREQ usersReq) {
		return listDao.insertUsersReq(usersReq);
	}
	public int insertAdminRes(MyUSERSREQ usersReq) {
		return listDao.insertAdminRes(usersReq);
	}
	public int insertUsersReqDelete(MyUSERSREQ usersReq) {
		return listDao.insertUsersReqDelete(usersReq);
	}
	public int insertAdminResDelete(MyUSERSREQ usersReq) {
		return listDao.insertAdminResDelete(usersReq);
	}
	
	
}




