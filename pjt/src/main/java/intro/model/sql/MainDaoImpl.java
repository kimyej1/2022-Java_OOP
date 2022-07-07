package intro.model.sql;

import java.util.ArrayList;
import java.util.List;

import bbs.model.vo.BbsVO;
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
	
	public List<Object> bbsSelectRow() {	// ArrayList<BbsVO>
		System.out.println("dao bbsSelectRow >>> ");
		
		list = new ArrayList<Object>();
		list.add(new BbsVO(1, "�ް�����", "���� �ް��Դϴ�.", "admin", "2022-07-07", 0));
		list.add(new BbsVO(2, "ȸ�İ���", "��!", "admin", "2022-07-06", 5));
		
		return list;
	}
}
