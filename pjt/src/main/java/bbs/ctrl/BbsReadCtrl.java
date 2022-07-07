package bbs.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bbs.model.vo.BbsVO;
import ctrl.util.Controller;
import ctrl.view.View;

public class BbsReadCtrl implements Controller {

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("bbs_read Ctrl >>> ");
		
		String idx = request.getParameter("idx");
		System.out.println("param idx >>> " + idx);
		
		Object obj = new BbsVO(1, "휴강공지", "뻥", "admin", "2022-07-07", 0);	// 원래는 별도의 DAO, ... 있어야함! 
		request.setAttribute("read", obj);
		
		return new View("bbs_read.jsp", true);
	}

}
