package com.Deloitte.Java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentDAO {
	boolean insertStudent(Student su) {
		int count = 0;
		Connection con = null;
		PreparedStatement pst = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			pst = con.prepareStatement("insert into Student values(?,?,?,?)");

			pst.setInt(1, su.getRollno());
			pst.setString(2, su.getName());
			pst.setInt(3, su.getAge());
			pst.setDate(4, su.getDob());
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

	public boolean updateStudent(Student su) {
		int count = 0;
		Connection con = null;
		PreparedStatement pst = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			pst = con.prepareStatement("update Student set name = ?, age = ? where rno = ?");
			pst.setString(1, su.getName());
			pst.setInt(2, su.getAge());
			pst.setInt(3, su.getRollno());
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

	public boolean removeStudent(int i) {
		int count = 0;
		Connection con = null;
		PreparedStatement pst = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			pst = con.prepareStatement("delete from student where rno = ?");
			pst.setInt(1, i);
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

	public Student getStudent(int rno) {
		Student su = null;
		int count = 0;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			pst = con.prepareStatement("select * from student where rno = ?");
			pst.setInt(1, rno);
			rs = pst.executeQuery();
			if (rs.next()) {
				su = new Student(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4));
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
		return su;
	}

	public ArrayList<Student> getStudent() {
		Student su = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		ArrayList<Student> stuList = new ArrayList<>();
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			pst = con.prepareStatement("select * from student");
			rs = pst.executeQuery();
			while (rs.next()) {
				su = new Student(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4));
				stuList.add(su);
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
		return stuList;
	}
}