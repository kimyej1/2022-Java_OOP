import com.kbstar.oop.tv.factory.BeanFactory;
import com.kbstar.oop.tv.util.Tv;

public class TvClient {

	public static void main(String[] args) {
//		Stv tv = new Stv();
//		tv.powerOn();
		
//		BeanFactory factory01 = BeanFactory.getInstance();
//		BeanFactory factory02 = BeanFactory.getInstance();
//		System.out.println(factory01);
//		System.out.println(factory02);	// 하나만 만들어졌다 
		
		BeanFactory factory = BeanFactory.getInstance();
		
		//////////// 은닉화 (Stv/Ltv 안보임)
		Tv tv = factory.getBrand("LG");		// "LG" <-> "Samsung" : Client 수정 없이 Server의 확장성 가능!!! 
		tv.switchOn();
		
	}
}
