package com.kbstar.oop.model.vo;

public class TeacherVO extends PersonVO {
	
	private String	subject;

	public TeacherVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeacherVO(String name, int age, String address, String subject) {
		super(name, age, address);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String teaInfo() {
		return super.getName() + "\t" + super.getAge() + "\t" + super.getAddress() + "\t" + this.getSubject();
	}
	
	@Override
	public String perInfo() {
		return "Teacher.perInfo() : " + super.perInfo() + "\t" + this.getSubject();
	}
}
