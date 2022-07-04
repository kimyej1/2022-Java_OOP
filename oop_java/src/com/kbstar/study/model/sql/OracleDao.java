package com.kbstar.study.model.sql;

import com.kbstar.study.model.entity.UserDTO;
import com.kbstar.study.model.entity.UserVO;

// CRUD - DB���� 
public class OracleDao {
	
	// C
	public void insertRow() {
		System.out.println("dao insertRow");
	}
	
	// R
	public void selectRow() {
		System.out.println("dao selectRow");
	}
	
	// U
	public void updateRow() {
		System.out.println("dao updateRow");
	}
	
	// D
	public void deleteRow() {
		System.out.println("dao deleteRow");
	}
	
	public UserVO loginRow(UserDTO dto) {
		// DTO(id, pwd) �޾Ƽ� VO(id, pwd, name, point) ������ �����̴�~
		if(dto.getId().equals("jslim") && dto.getPwd().equals("jslim")) {
			// jdbc -> orm(mybatis)
			return new UserVO("jslim", "jslim", "������", 1000);
		} else {
			return null;
		}
	}
}
