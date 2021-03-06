package ctrl.util;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ctrl.view.View;

public interface Controller {

	public View execute(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException;	// abstract --> body X
	
}
