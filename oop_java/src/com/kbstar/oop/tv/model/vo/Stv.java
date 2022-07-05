package com.kbstar.oop.tv.model.vo;

import com.kbstar.oop.tv.util.Tv;

public class Stv implements Tv {
	public Stv() {
		
	}

	// Àº´ÐÈ­ 
	// Loose Coupling 
	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println("Turn STV On!");
	}
	
//	public void powerOn() {
//		System.out.println("Turn STV On!");
//	}

}
