package ctrl.factory;

import java.util.HashMap;
import java.util.Map;

import ctrl.util.Controller;
import user.ctrl.LoginCtrl;
import user.ctrl.LogoutCtrl;
import user.ctrl.MainCtrl;
import user.ctrl.RegisterCtrl;

public class BeanFactory {
	private static BeanFactory instance;
	private Map<String, Controller> map;
	
	private BeanFactory() {				// 생성자가 private -> 외부에서 접근 불가 -> 무분별한 객체 생성 불가 
		map = new HashMap<String, Controller>();
		map.put("/pjt/login.kbstar"	, new LoginCtrl());
		map.put("/pjt/logout.kbstar", new LogoutCtrl());
		map.put("/pjt/join.kbstar", new RegisterCtrl());
		map.put("/pjt/main.kbstar", new MainCtrl());
	}
	
	public static BeanFactory getInstance() {	// 인스턴스를 생성하지 못하게 해놨기 때문에, public이어도 외부에서 접근 불가 
		if(instance == null) {
			instance = new BeanFactory();
		}
		return instance;				// 외부에서 무분별한 객체 생성 불가 -> 내부에서만 만들 수 있도록 
	}
	
	public Controller getBean(String uri) {
		Controller ctrl = map.get(uri);
		return ctrl;
	}
}
