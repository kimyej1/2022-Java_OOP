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

		// Get�̵� Post�� Process ���ؼ� ó���� ����!
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		process(request, response);
	}

	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Servlet ���� �� URLmapping�� *.kbstar �� �߱� ������ -> ��� ��û�� �ϴ� FrontCtrl�� ���̰� ��!!
		System.out.println("front controller >>> ");
		String uri = request.getRequestURI();
		System.out.println("client request uri >>> " + uri);

		// ���丮�� ���� ��Ʈ�ѷ��� �������� �� ȭ��б�
		BeanFactory factory = BeanFactory.getInstance();
		Controller ctrl = factory.getBean(uri);
		View view = ctrl.execute(request, response);

		if (view.isSend()) { // isSend() == true -> ������
			// response ���� rd�� �ٷ� req, res�� �Ѱܹ���
			RequestDispatcher rd = request.getRequestDispatcher(view.getPath());
			rd.forward(request, response);
		} else { // isSend() == false -> �����̷���
			response.sendRedirect(view.getPath());
		}
	}

}
