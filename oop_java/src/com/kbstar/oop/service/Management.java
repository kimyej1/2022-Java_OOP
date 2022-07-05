package com.kbstar.oop.service;

import com.kbstar.oop.model.vo.PersonVO;

public class Management {
	
	private PersonVO[] ary;		// array -> 안에 들어갈 객체 타입 = PersonVO
	private int idx;			// int는 묵시적 초기화 (0으로)
	
	public Management() {
		ary = new PersonVO[10];	// array 생성 시 size 지정
	}
	
	//////////// 매개변수의 다형성 
	public void setAry(PersonVO per) {
		ary[idx++] = per;
	}
	public PersonVO[] getAry() {
		return ary;
	}
}