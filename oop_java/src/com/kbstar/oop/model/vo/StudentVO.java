package com.kbstar.oop.model.vo;

public class StudentVO extends PersonVO {
	
	private String	stuId;
	
	public StudentVO() {
		
	}
	
	public StudentVO(String name, int age, String address, String stuId) {
		super(name, age, address);
		this.stuId = stuId;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	
	public String stuInfo() {
		return super.getName() + "\t" + super.getAge() + "\t" + super.getAddress() + "\t" + this.getStuId();
	}
	
	@Override
	public String perInfo() {
		return "Student.perInfo() : " + super.perInfo() + "\t" + this.getStuId();
	}
}