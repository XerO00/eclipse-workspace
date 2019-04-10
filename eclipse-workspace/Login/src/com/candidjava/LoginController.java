package com.candidjava;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un=request.getParameter("username");
		String pw=request.getParameter("password");
		
		if(un.equals("admin") && pw.equals("admin"))
		{
			response.sendRedirect("https://www.google.co.in/search?q=google&gws_rd=cr&dcr=0&ei=GOg_WtPZJ8PsvASNiL8Q");
			return;
		}
		else
		{
			response.sendRedirect("error.html");
			return;
		}
	}
}