package com.deloitte.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/AuthenticateServlet")
public class AuthenticateServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String username = req.getParameter("uid");
		String password = req.getParameter("pwd");
		Cookie c = new Cookie("username",username);
		resp.addCookie(c);
		RequestDispatcher rd = null;
		PrintWriter out = resp.getWriter();
		out.println("<h1><center>");
		UsersDAO dao = new UsersDAO();

		if (dao.validateUser(username, password)){
//			out.println("Welcome to Hyderabad");
			rd = req.getRequestDispatcher("services.html");
			rd.forward(req, resp);
		}
			
		else {
			out.print("invalid username/password");
			rd = req.getRequestDispatcher("login.html");
			rd.include(req, resp);
		}

		out.println("</center></h1>");
	}

}
