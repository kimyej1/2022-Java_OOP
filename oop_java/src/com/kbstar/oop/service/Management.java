package com.kbstar.oop.service;

import com.kbstar.oop.model.vo.PersonVO;

public class Management {
	
	private PersonVO[] ary;		// array -> �ȿ� �� ��ü Ÿ�� = PersonVO
	private int idx;			// int�� ������ �ʱ�ȭ (0����)
	
	public Management() {
		ary = new PersonVO[10];	// array ���� �� size ����
	}
	
	//////////// �Ű������� ������ 
	public void setAry(PersonVO per) {
		ary[idx++] = per;
	}
	public PersonVO[] getAry() {
		return ary;
	}
}