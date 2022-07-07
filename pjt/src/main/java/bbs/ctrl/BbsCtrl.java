package bbs.ctrl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ctrl.util.Controller;
import ctrl.view.View;
import intro.service.MainServiceImpl;

// �������̾��ٸ� ���⼭ @Controller �Ǵ� @Controller("bbs")
public class BbsCtrl implements Controller {

	// �������̾��ٸ� ���⼭ @Autowired �ϰ� ��ü����(BbsCtrl(){}) ����
	private MainServiceImpl service;
	public BbsCtrl() {
		service = new MainServiceImpl();
	}
	
	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("bbs Ctrl >>> ");
		
		String method = request.getParameter("method");
		System.out.println("param method >>> " + method);
		
		List<Object> list = service.bbsSelect();
		request.setAttribute("bbs_list", list);
		
		return new View("bbs_list.jsp", true);
	}

}
