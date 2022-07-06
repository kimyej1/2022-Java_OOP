package user.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ctrl.util.Controller;
import ctrl.view.View;

public class LogoutCtrl implements Controller {

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("logout Ctrl >>> ");
		request.setAttribute("test", "scope~~");	// request�� ������ �ɱ� 
		return new View("result.jsp", false);
		
		/*
		 * 	���ǿ� �����͸� ������ �������� �ϵ� ������ �ϵ� �� �����ȴ�.
		 * 
		 * LogoutCtrl -> false �̹Ƿ�, redirect ���..
		 * 				 scope~~�� ���ư��� �Ⱥ��δ�.
		 * logout.kbstar -> result.jsp�� url�� �ٲ��.
		 */
	}

}
