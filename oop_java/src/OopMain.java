import com.kbstar.oop.model.vo.PersonVO;
import com.kbstar.oop.model.vo.StudentVO;
import com.kbstar.oop.model.vo.TeacherVO;
import com.kbstar.oop.service.Management;

public class OopMain {

	public static void main(String[] args) {
		
		Management mgr = new Management();
		
		//////////// 객체의 다형성 
		PersonVO stu = new StudentVO("Kim Yeji", 31, "Suwon", "2011");
		PersonVO tea = new TeacherVO("Kim Yeji", 31, "Suwon", "Java");
		mgr.setAry(stu);
		mgr.setAry(tea);
		
		PersonVO[] ary = mgr.getAry();
		for(int idx = 0; idx < ary.length; idx ++) {
			PersonVO per = ary[idx];
			
//			if(per instanceof StudentVO) {
//				System.out.println("StudentVO : " + ((StudentVO)per).stuInfo());
//			}
//			if(per instanceof TeacherVO) {
//				System.out.println("TeacherVO : " + ((TeacherVO)per).teaInfo());
//			}
			
			if(per != null) {
				//////////// 메소드의 다형성 
				// 부모는 자식에 접근할 수 없지만, Override된 경우는 가능하다 
				System.out.println(per.perInfo());
			}
		}
	}
}
