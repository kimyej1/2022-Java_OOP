package com.kbstar.study.model.entity;

public class UserVO {
	
	// Variables
	private String id, pwd, name;
	private int point;
	
	// Constructor from Superclass
	public UserVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Constructor Overloading
	// Constructor using fields
	public UserVO(String id, String pwd, String name, int point) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.point = point;
	}

	// Getters and Setters
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	// toString() Overriding -> Debug
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", point=" + point + "]";
	}
}
