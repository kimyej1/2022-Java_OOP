package user.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ctrl.util.Controller;
import ctrl.view.View;

public class LoginCtrl implements Controller {

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("login Ctrl >>> ");
		request.setAttribute("test", "scope~~");
		return new View("result.jsp", true);
		
		/*
		 * LoginCtrl -> true �̹Ƿ�, forwarding ���..
		 * 
		 * request�� ���� �����ʹ� ���������� �ؾ����� �� ������ ���������� �����ǰ� �����ȴ�!!!!(scope~~)
		 * login.kbstar url�� �����ȴ�.
		 */
	}

}
