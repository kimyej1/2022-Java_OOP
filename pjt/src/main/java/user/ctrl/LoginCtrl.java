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
		 * LoginCtrl -> true 이므로, forwarding 방식..
		 * 
		 * request에 심은 데이터는 포워딩으로 해야지만 이 정보가 내부적으로 유지되고 공유된다!!!!(scope~~)
		 * login.kbstar url이 유지된다.
		 */
	}

}
