package user.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ctrl.util.Controller;
import ctrl.view.View;

public class RegisterCtrl implements Controller {

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("register Ctrl >>> ");
		return new View("join.jsp", true);
	}

}
