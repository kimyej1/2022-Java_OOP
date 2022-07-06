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
		request.setAttribute("test", "scope~~");	// request에 데이터 심기 
		return new View("result.jsp", false);
		
		/*
		 * 	세션에 데이터를 심으면 포워딩을 하든 리디렉을 하든 다 공유된다.
		 * 
		 * LogoutCtrl -> false 이므로, redirect 방식..
		 * 				 scope~~가 날아가서 안보인다.
		 * logout.kbstar -> result.jsp로 url이 바뀐다.
		 */
	}

}
