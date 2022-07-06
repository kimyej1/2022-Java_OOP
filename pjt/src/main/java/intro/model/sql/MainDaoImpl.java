package intro.model.sql;

import java.util.ArrayList;
import java.util.List;

import intro.news.NewsVO;

public class MainDaoImpl {
	
	// List : 인터페이스, ArrayList : 클래스 
	private List list;
	
	public List<Object> selectRow() {	// ArrayList<NewsVO> 로 할수도 있지만.. 다형성을 위해 Object로!!
		System.out.println("dao selectRow >>> ");
		
		list = new ArrayList<Object>();
		
		list.add(new NewsVO(1, "내일 휴강입니다."));
		list.add(new NewsVO(2, "뻥이야!"));
		list.add(new NewsVO(3, "혈맥강사 짱!!"));
		
		return list;
	}
}
