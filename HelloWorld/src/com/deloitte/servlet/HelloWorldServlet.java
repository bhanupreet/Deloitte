package com.deloitte.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ms")
@SuppressWarnings("serial")
public class HelloWorldServlet extends GenericServlet {

	@Override
	public void service(ServletRequest serveletRequest, ServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html> <body>");
		out.println("<h1><center>");
		out.println(new java.util.Date());
		out.print("</center></h1>");
		out.println("</body></html");
	}

}
