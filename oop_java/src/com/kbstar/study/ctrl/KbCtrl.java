package com.kbstar.study.ctrl;

import com.kbstar.study.model.entity.UserDTO;
import com.kbstar.study.model.entity.UserVO;
import com.kbstar.study.service.KbService;

public class KbCtrl {
	private KbService service;
	
	public KbCtrl() {
		service = new KbService();
	}
	
	public void insertCtrl() {
		System.out.println("ctrl insert");
		service.insertService();
	}
	
	public UserVO loginCtrl(UserDTO dto) {
		System.out.println("ctrl login");
		return service.loginService(dto);
	}
}
