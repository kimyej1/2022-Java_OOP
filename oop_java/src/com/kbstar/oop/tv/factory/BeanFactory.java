package com.kbstar.oop.tv.factory;

import java.util.HashMap;
import java.util.Map;

import com.kbstar.oop.tv.model.vo.Ltv;
import com.kbstar.oop.tv.model.vo.Stv;
import com.kbstar.oop.tv.util.Tv;

// Client는 TV(Stv, Ltv)를 직접 호출하지 않고, 객체 생성과 라이프사이클을 관리하는 Factory를 통해서만 상호작용!
public class BeanFactory {
	
	private static BeanFactory instance;
	private Map<String, Tv> map;		// Key타입 : String, 담을 객체(Value): Tv
	
	private BeanFactory() {				// 생성자가 private -> 외부에서 접근 불가 -> 무분별한 객체 생성 불가 
		Stv samsung = new Stv();
		Ltv lg		= new Ltv();
		
		map = new HashMap<String, Tv>(); // Map<K,V>는 interface, HashMap은 Map을 상속받는 일반Class
		map.put("Samsung", samsung);
		map.put("LG", lg);
	}
	
	public static BeanFactory getInstance() {	// 인스턴스를 생성하지 못하게 해놨기 때문에, public이어도 외부에서 접근 불가 
		if(instance == null) {			// Singleton Pattern
			instance = new BeanFactory();
		}
		return instance;				// 외부에서 무분별한 객체 생성 불가 -> 내부에서만 만들 수 있도록 
	}
	
	public Tv getBrand(String key) {
		Tv tv = map.get(key);			// 이걸 Ltv, Stv로 받지 않고, 클라이언트에 tv로 받아 그대로 전달함(다형성)
		return tv;
	}
}
