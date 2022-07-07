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
	
	// List : 인터페이스, ArrayList : 클래스 
	private List list;
	
	
	// 선생님 코드 복붙..
	private static SqlSessionFactory factory ; 
	SqlSession session ; 
	static {
		System.out.println("------------------- mybatis loading --------------------"); 
		try{
			factory = new SqlSessionFactoryBuilder().build(
			// configuration 파일에 올리면 mapper 때문에 DQM 파일도 같이 올라감  -> 여러개라 자동으로 MYbatis가 리스트로 저장해준다!
			Resources.getResourceAsReader("resource/config/configuration.xml"));	
		}catch(Exception e) {
			e.printStackTrace() ;
		}
	}
	
	public MainDaoImpl() {
		session = factory.openSession(true);
		System.out.println("mybatis session >>> " + session);
	}
	// 여기까지..
	
	
	public List<Object> selectRow() {	// ArrayList<NewsVO> 로 할수도 있지만.. 다형성을 위해 Object로!!
		System.out.println("dao selectRow >>> ");
		
		list = new ArrayList<Object>();
		
		list.add(new NewsVO(1, "내일 휴강입니다."));
		list.add(new NewsVO(2, "뻥이야!"));
		list.add(new NewsVO(3, "혈맥강사 짱!!"));
		
		return list;
	}
	
	public List<Object> bbsSelectRow() {	// ArrayList<BbsVO>
		System.out.println("dao bbsSelectRow >>> ");
		return session.selectList("kbstar.bbs.listRow");
		
//		list = new ArrayList<Object>();
//		list.add(new BbsVO(1, "휴강공지", "내일 휴강입니다.", "admin", "2022-07-07", 0));
//		list.add(new BbsVO(2, "회식공지", "뻥!", "admin", "2022-07-06", 5));
//		
//		return list;
	}
}
