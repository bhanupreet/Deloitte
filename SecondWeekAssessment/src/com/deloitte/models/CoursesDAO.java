package com.deloitte.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CoursesDAO {
	public boolean insertCourses(Courses course) {
		int count = 0;
		Connection con = null;
		PreparedStatement pst = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			pst = con.prepareStatement("insert into Courses values(?,?,?,?)");

			pst.setInt(1, course.getCourse_id());
			pst.setString(2, course.getCourse_name());
			pst.setInt(3, course.getCourse_duration());
			pst.setDouble(4, course.getCourse_fee());
			count = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pst != null)
					pst.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return count == 1;
	}

	public boolean updateCourses(Courses course) {
		int count = 0;
		Connection con = null;
		PreparedStatement pst = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			pst = con.prepareStatement(
					"update courses set course_name = ?, course_duration = ?, course_fee = ? where course_id = ?");
			pst.setString(1, course.getCourse_name());
			pst.setInt(2, course.getCourse_duration());
			pst.setDouble(3, course.getCourse_fee());
			pst.setInt(4, course.getCourse_id());
			count = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pst != null)
					pst.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return count == 1;
	}

	public boolean removeCourses(int course_id) {
		int count = 0;
		Connection con = null;
		PreparedStatement pst = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			pst = con.prepareStatement("delete from courses where course_id = ?");
			pst.setInt(1, course_id);
			count = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pst != null)
					pst.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return count == 1;
	}

	public Courses getCourses(int course_id) {
		Courses course = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			pst = con.prepareStatement("select * from courses where course_id = ?");
			pst.setInt(1, course_id);
			rs = pst.executeQuery();
			if (rs.next()) {
				course = new Courses(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pst != null)
					pst.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return course;
	}

	public ArrayList<Courses> getCourses() {
		Courses course = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		ArrayList<Courses> courseList = new ArrayList<>();
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			pst = con.prepareStatement("select * from courses");
			rs = pst.executeQuery();
			while (rs.next()) {
				course = new Courses(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4));
				courseList.add(course);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pst != null)
					pst.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return courseList;
	}
}