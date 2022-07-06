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
		String msg = request.getParameter("msg");	// getParameter은 무조건 문자열! 정수로 넘겨도 문자로 받는다.	
		
		// 넘어온 값 jsp로 넘겨서 'OOO님,' 자리에 넣기  
		HttpSession session = request.getSession();	// 세션 생성 (데이터 심을 일이 있을 때만 만들면 됨, 단순 화면분기 등 불필요)
		session.setAttribute("test", msg); 			// 데이터 세션에 심기 (이름 지정, 심을 데이터)
		
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
