package com.deloitte.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.models.Courses;
import com.deloitte.models.CoursesDAO;

@SuppressWarnings("serial")
@WebServlet("/CoursesCRUD")
public class CoursesCRUD extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String exception = "";
		PrintWriter out = resp.getWriter();
		String submit = req.getParameter("sub");
		Courses e = new Courses();
		String message = "";
		CoursesDAO edao = new CoursesDAO();
		RequestDispatcher rd = req.getRequestDispatcher("CoursesCrud.jsp");
		e.setCourse_id(Integer.parseInt(req.getParameter("course_id")));
		try {
			if (submit.equals("Add_Courses") || submit.equals("Modify_Courses")) {

				e.setCourse_name(req.getParameter("course_name"));
				e.setCourse_fee(Double.parseDouble(req.getParameter("course_fee")));
				e.setCourse_duration(Integer.parseInt(req.getParameter("course_duration")));

				if (submit.equals("Add_Courses")) {
					if (edao.insertCourses(e))
						message = message + "Record inserted";
					else
						message = message + "insertion failed";
				} else {
					if (edao.updateCourses(e))
						message = message + "Modified Record";
					else
						message = message + "Modification Failed";
				}
			} else if (submit.equals("Delete_Courses")) {
				if (edao.removeCourses(e.getCourse_id())) {
					message = message + "Record Deleted";
				} else {
					message = message + "Deletion Failed";
				}
			} else if (submit.equals("Show_Courses")) {
				Courses e1 = edao.getCourses(e.getCourse_id());
				req.setAttribute("course", e1);
			}
		} catch (Exception ex) {
			exception = ex.getMessage();
		}
		message = message + exception;
		out.print("<h1 style color:red><center>" + message + "</center></h1>");
		rd.include(req, resp);
	}
}
