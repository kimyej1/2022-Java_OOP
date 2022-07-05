package com.kbstar.oop.model.vo;

public class PersonVO {
	
	private String	name;
	private int		age;
	private String	address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public PersonVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonVO(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String perInfo() {
		return "PersonVO perInfo() : [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
