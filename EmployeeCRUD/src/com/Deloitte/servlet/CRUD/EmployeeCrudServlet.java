package com.Deloitte.servlet.CRUD;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/EmployeeCRUD")
public class EmployeeCrudServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String submit = req.getParameter("sub");
		Employee e = new Employee();
		String message = "";
		EmployeeDAO edao = new EmployeeDAO();
		RequestDispatcher rd = req.getRequestDispatcher("EmployeeCrud.jsp");
		e.setEmpid(Integer.parseInt(req.getParameter("empid")));
		if (submit.equals("Add_Employee") || submit.equals("Modify_Employee")) {

			e.setName(req.getParameter("name"));
			e.setSalary(Double.parseDouble(req.getParameter("salary")));
			e.setDoj(Date.valueOf(req.getParameter("doj")));

			if (submit.equals("Add_Employee")) {
				if (edao.insertEmployee(e))
					message = message + "recored inserted";
				else
					message = message + "insertion failed";
			} else {
				edao.updateEmployee(e);
				message = message + "Modified Record";
			}
		} else if (submit.equals("Delete_Employee")) {
			if (edao.removeEmployee(e.getEmpid())) {
				message = message + "Record Deleted";
			} else {
				message = message + "Deletion Failed";
			}
		} else if (submit.equals("Show_Employee")) {
			Employee e1 = edao.getEmployee(e.getEmpid());
			req.setAttribute("emp", e1);
		}
		
		out.print("<h1><center>" + message + "</center></h1>");
		rd.include(req, resp);
	}
}
