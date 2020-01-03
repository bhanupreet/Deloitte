package com.deloitte.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/MoneyTransferServlet")
public class MoneyTransferServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		Cookie[] c = req.getCookies();
		String username = null;
		for(Cookie c1: c){
			if(c1.getName().equals("username")){
				username = c1.getValue();
			}
		}
		double amount = Double.parseDouble(req.getParameter("amount"));
		if(new AccountsDAO().updateBalance(username, amount)){
			out.println("<h1><center> Amount transfered successfully</h1>");
		}else{
			out.println("<h1><center> Amount transfer failed</h1>");
		}
	}
	
}
