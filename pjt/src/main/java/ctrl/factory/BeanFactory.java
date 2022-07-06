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
	
	private BeanFactory() {				// �����ڰ� private -> �ܺο��� ���� �Ұ� -> ���к��� ��ü ���� �Ұ� 
		map = new HashMap<String, Controller>();
		map.put("/pjt/login.kbstar"	, new LoginCtrl());
		map.put("/pjt/logout.kbstar", new LogoutCtrl());
		map.put("/pjt/join.kbstar", new RegisterCtrl());
		map.put("/pjt/main.kbstar", new MainCtrl());
	}
	
	public static BeanFactory getInstance() {	// �ν��Ͻ��� �������� ���ϰ� �س��� ������, public�̾ �ܺο��� ���� �Ұ� 
		if(instance == null) {
			instance = new BeanFactory();
		}
		return instance;				// �ܺο��� ���к��� ��ü ���� �Ұ� -> ���ο����� ���� �� �ֵ��� 
	}
	
	public Controller getBean(String uri) {
		Controller ctrl = map.get(uri);
		return ctrl;
	}
}
