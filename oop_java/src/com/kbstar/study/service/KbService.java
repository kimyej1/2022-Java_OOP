package com.kbstar.study.service;

import com.kbstar.study.model.entity.UserDTO;
import com.kbstar.study.model.entity.UserVO;
import com.kbstar.study.model.sql.OracleDao;

public class KbService {
	private OracleDao dao;
	
	public KbService() {
		dao = new OracleDao();
	}
	
	public void insertService() {
		System.out.println("service insert");
		dao.insertRow();
	}
	
	public void selectService() {
		System.out.println("service select");
		dao.selectRow();
	}
	
	public UserVO loginService(UserDTO dto) {
		System.out.println("service login");
		return dao.loginRow(dto);
	}
}
