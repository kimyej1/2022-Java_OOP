package com.kbstar.oop.tv.factory;

import java.util.HashMap;
import java.util.Map;

import com.kbstar.oop.tv.model.vo.Ltv;
import com.kbstar.oop.tv.model.vo.Stv;
import com.kbstar.oop.tv.util.Tv;

// Client�� TV(Stv, Ltv)�� ���� ȣ������ �ʰ�, ��ü ������ ����������Ŭ�� �����ϴ� Factory�� ���ؼ��� ��ȣ�ۿ�!
public class BeanFactory {
	
	private static BeanFactory instance;
	private Map<String, Tv> map;		// KeyŸ�� : String, ���� ��ü(Value): Tv
	
	private BeanFactory() {				// �����ڰ� private -> �ܺο��� ���� �Ұ� -> ���к��� ��ü ���� �Ұ� 
		Stv samsung = new Stv();
		Ltv lg		= new Ltv();
		
		map = new HashMap<String, Tv>(); // Map<K,V>�� interface, HashMap�� Map�� ��ӹ޴� �Ϲ�Class
		map.put("Samsung", samsung);
		map.put("LG", lg);
	}
	
	public static BeanFactory getInstance() {	// �ν��Ͻ��� �������� ���ϰ� �س��� ������, public�̾ �ܺο��� ���� �Ұ� 
		if(instance == null) {			// Singleton Pattern
			instance = new BeanFactory();
		}
		return instance;				// �ܺο��� ���к��� ��ü ���� �Ұ� -> ���ο����� ���� �� �ֵ��� 
	}
	
	public Tv getBrand(String key) {
		Tv tv = map.get(key);			// �̰� Ltv, Stv�� ���� �ʰ�, Ŭ���̾�Ʈ�� tv�� �޾� �״�� ������(������)
		return tv;
	}
}
