package user.ctrl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ctrl.util.Controller;
import ctrl.view.View;
import intro.service.MainServiceImpl;

public class MainCtrl implements Controller {

	private MainServiceImpl service;
	
	public MainCtrl() {
		service = new MainServiceImpl();
	}
	
	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("main Ctrl >>> ");
		
		List<Object> list = service.select();
		
		request.setAttribute("lists", list); 	// session�� ���� �ʿ� ����,, ������ �ҰŴϱ� request�� �ɱ�!
		return new View("main.jsp", true);
	}

}
