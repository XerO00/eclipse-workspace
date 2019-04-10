package co.edureka.quiz.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/login", "/register", "/takeExam", "/logout" })
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String applicationContextPath = request.getContextPath();
		System.out.println("Context Path = "+applicationContextPath);
		if (request.getRequestURI().equals(applicationContextPath + "/")) {
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/jsps/home.jsp");
			System.out.println("Context Path =/jsps/home.jsp "+applicationContextPath);
			dispatcher.forward(request, response);
		} else if (request.getRequestURI().equals(
				applicationContextPath + "/login")) {
			RequestDispatcher dispatcher = request 
					.getRequestDispatcher("/jsps/login.jsp");
			System.out.println("Context Path =/jsps/login.jsp "+request.getRequestURI());
			dispatcher.forward(request, response);
		} else if (request.getRequestURI().equals(
				applicationContextPath + "/register")) {
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/jsps/register.jsp");
			System.out.println("Context Path =/jsps/register.jsp "+applicationContextPath);
			dispatcher.forward(request, response);
		} else if (request.getRequestURI().equals(
				applicationContextPath + "/takeExam")) {
			request.getSession().setAttribute("currentExam", null);
			System.out.println("Context Path =currentExam "+applicationContextPath);
			String exam = request.getParameter("test");
			request.getSession().setAttribute("exam", exam);
			
			System.out.println(request.getSession().getAttribute("user"));
			if (request.getSession().getAttribute("user") == null) {
				request.getRequestDispatcher("/login").forward(request,
						response);
				
			} else {
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("/jsps/quizDetails.jsp");
				dispatcher.forward(request, response);
			}
		} else if (request.getRequestURI().equals(
				applicationContextPath + "/logout")) {
			request.getSession().invalidate();
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/jsps/home.jsp");
			dispatcher.forward(request, response);
		}

	}

}
