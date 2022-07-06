package intro.service;

import java.util.List;

import intro.model.sql.MainDaoImpl;

/*
 *  현업에서 설계는 모두 interface 먼저 설계 후 그걸 상속받는 클래스들 만든다.
 *  
 *  이름에 ~~impl = 클래스
 *  이름이 XXXDAO, XXXService = 인터페이스
 */
public class MainServiceImpl {

	private MainDaoImpl dao;
	
	public MainServiceImpl() {
		dao = new MainDaoImpl();
	}
	
	public List<Object> select() {
		System.out.println("service select >>> ");
		return dao.selectRow();
	}
}
