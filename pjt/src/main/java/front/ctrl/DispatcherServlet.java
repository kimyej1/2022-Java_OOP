package front.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ctrl.factory.BeanFactory;
import ctrl.util.Controller;
import ctrl.view.View;

@WebServlet("*.kbstar")
public class DispatcherServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Get이든 Post든 Process 통해서 처리할 예정!
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		process(request, response);
	}

	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Servlet 생성 시 URLmapping을 *.kbstar 로 했기 때문에 -> 모든 요청이 일단 FrontCtrl로 모이게 됨!!
		System.out.println("front controller >>> ");
		String uri = request.getRequestURI();
		System.out.println("client request uri >>> " + uri);

		// 팩토리를 통한 컨트롤러와 관계형성 및 화면분기
		BeanFactory factory = BeanFactory.getInstance();
		Controller ctrl = factory.getBean(uri);
		View view = ctrl.execute(request, response);

		if (view.isSend()) { // isSend() == true -> 포워딩
			// response 없이 rd에 바로 req, res를 넘겨버림
			RequestDispatcher rd = request.getRequestDispatcher(view.getPath());
			rd.forward(request, response);
		} else { // isSend() == false -> 리다이렉팅
			response.sendRedirect(view.getPath());
		}
	}

}
