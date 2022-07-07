package intro.model.sql;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import bbs.model.vo.BbsVO;
import intro.news.NewsVO;

public class MainDaoImpl {
	
	// List : �������̽�, ArrayList : Ŭ���� 
	private List list;
	
	
	// ������ �ڵ� ����..
	private static SqlSessionFactory factory ; 
	SqlSession session ; 
	static {
		System.out.println("------------------- mybatis loading --------------------"); 
		try{
			factory = new SqlSessionFactoryBuilder().build(
			// configuration ���Ͽ� �ø��� mapper ������ DQM ���ϵ� ���� �ö�  -> �������� �ڵ����� MYbatis�� ����Ʈ�� �������ش�!
			Resources.getResourceAsReader("resource/config/configuration.xml"));	
		}catch(Exception e) {
			e.printStackTrace() ;
		}
	}
	
	public MainDaoImpl() {
		session = factory.openSession(true);
		System.out.println("mybatis session >>> " + session);
	}
	// �������..
	
	
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
		return session.selectList("kbstar.bbs.listRow");
		
//		list = new ArrayList<Object>();
//		list.add(new BbsVO(1, "�ް�����", "���� �ް��Դϴ�.", "admin", "2022-07-07", 0));
//		list.add(new BbsVO(2, "ȸ�İ���", "��!", "admin", "2022-07-06", 5));
//		
//		return list;
	}
}
