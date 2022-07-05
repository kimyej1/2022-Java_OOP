import com.kbstar.oop.tv.factory.BeanFactory;
import com.kbstar.oop.tv.util.Tv;

public class TvClient {

	public static void main(String[] args) {
//		Stv tv = new Stv();
//		tv.powerOn();
		
//		BeanFactory factory01 = BeanFactory.getInstance();
//		BeanFactory factory02 = BeanFactory.getInstance();
//		System.out.println(factory01);
//		System.out.println(factory02);	// �ϳ��� ��������� 
		
		BeanFactory factory = BeanFactory.getInstance();
		
		//////////// ����ȭ (Stv/Ltv �Ⱥ���)
		Tv tv = factory.getBrand("LG");		// "LG" <-> "Samsung" : Client ���� ���� Server�� Ȯ�强 ����!!! 
		tv.switchOn();
		
	}
}
