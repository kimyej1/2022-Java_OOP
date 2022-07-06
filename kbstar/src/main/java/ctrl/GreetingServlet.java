package ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.vo.UserVO;

@WebServlet("/greeting")
public class GreetingServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		System.out.println("call doGet()");
		String msg = request.getParameter("msg");	// getParameter�� ������ ���ڿ�! ������ �Ѱܵ� ���ڷ� �޴´�.	
		
		// �Ѿ�� �� jsp�� �Ѱܼ� 'OOO��,' �ڸ��� �ֱ�  
		HttpSession session = request.getSession();	// ���� ���� (������ ���� ���� ���� ���� ����� ��, �ܼ� ȭ��б� �� ���ʿ�)
		session.setAttribute("test", msg); 			// ������ ���ǿ� �ɱ� (�̸� ����, ���� ������)
		
		response.sendRedirect("result.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("call doPost()");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		System.out.println("param ----> " + id);
		System.out.println("param ----> " + pwd);
		
		UserVO user = new UserVO(id, pwd, "name", 1000);
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		
		response.sendRedirect("result.jsp");
	}

}
