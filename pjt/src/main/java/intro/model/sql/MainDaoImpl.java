package intro.model.sql;

import java.util.ArrayList;
import java.util.List;

import intro.news.NewsVO;

public class MainDaoImpl {
	
	// List : �������̽�, ArrayList : Ŭ���� 
	private List list;
	
	public List<Object> selectRow() {	// ArrayList<NewsVO> �� �Ҽ��� ������.. �������� ���� Object��!!
		System.out.println("dao selectRow >>> ");
		
		list = new ArrayList<Object>();
		
		list.add(new NewsVO(1, "���� �ް��Դϴ�."));
		list.add(new NewsVO(2, "���̾�!"));
		list.add(new NewsVO(3, "���ư��� ¯!!"));
		
		return list;
	}
}
