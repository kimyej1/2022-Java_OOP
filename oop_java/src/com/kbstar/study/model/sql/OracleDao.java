package com.kbstar.study.model.sql;

import com.kbstar.study.model.entity.UserDTO;
import com.kbstar.study.model.entity.UserVO;

// CRUD - DB연동 
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
		// DTO(id, pwd) 받아서 VO(id, pwd, name, point) 리턴할 예정이다~
		if(dto.getId().equals("jslim") && dto.getPwd().equals("jslim")) {
			// jdbc -> orm(mybatis)
			return new UserVO("jslim", "jslim", "임정섭", 1000);
		} else {
			return null;
		}
	}
}
