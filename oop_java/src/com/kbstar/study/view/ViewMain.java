package com.kbstar.study.view;

import com.kbstar.study.ctrl.KbCtrl;
import com.kbstar.study.model.entity.UserDTO;
import com.kbstar.study.model.entity.UserVO;

//ViewMain�� ��������� ��������!
public class ViewMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		OracleDao obj = new OracleDao();
//		obj.insertRow();
		
//		KbService service = new KbService();
//		service.insertService();	// service�� ȣ���ߴµ�, service�� ���������� DAO�� ���踦 �������ִ�.
		
		KbCtrl ctrl = new KbCtrl();
//		ctrl.insertCtrl();
		
		UserVO user = ctrl.loginCtrl(new UserDTO("jslim", "jslim"));
		if(user != null) {
			System.out.println(user.getName() + ", Welcome!");
		} else {
			System.out.println("Not Authorized...");
		}
	}
}
