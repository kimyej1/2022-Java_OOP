package com.kbstar.study.model.entity;

// 꼭 따로 안만들고, VO에 담아도 됨 
public class UserDTO {
	private String id, pwd;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDTO(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", pwd=" + pwd + "]";
	}
	
}
