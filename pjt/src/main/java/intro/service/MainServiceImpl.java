package intro.service;

import java.util.List;

import intro.model.sql.MainDaoImpl;

/*
 *  �������� ����� ��� interface ���� ���� �� �װ� ��ӹ޴� Ŭ������ �����.
 *  
 *  �̸��� ~~impl = Ŭ����
 *  �̸��� XXXDAO, XXXService = �������̽�
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
