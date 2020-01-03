package com.Deloitte.servlet.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmployeeDAO {
	public boolean insertEmployee(Employee emp) {
		int count = 0;
		Connection con = null;
		PreparedStatement pst = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			pst = con.prepareStatement("insert into Employee values(?,?,?,?)");

			pst.setInt(1, emp.getEmpid());
			pst.setString(2, emp.getName());
			pst.setDouble(3, emp.getSalary());
			pst.setDate(4, emp.getDoj());
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

	public boolean updateEmployee(Employee emp) {
		int count = 0;
		Connection con = null;
		PreparedStatement pst = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			pst = con.prepareStatement("update employee set name = ?, salary = ? where empid = ?");
			pst.setString(1, emp.getName());
			pst.setInt(3,emp.getEmpid());
			pst.setDouble(2, emp.getSalary());
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

	public boolean removeEmployee(int i) {
		int count = 0;
		Connection con = null;
		PreparedStatement pst = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			pst = con.prepareStatement("delete from employee where empid = ?");
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

	public Employee getEmployee(int empid) {
		Employee emp = null;
		int count = 0;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			pst = con.prepareStatement("select * from employee where empid = ?");
			pst.setInt(1, empid);
			rs = pst.executeQuery();
			if (rs.next()) {
				emp = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getDate(4));
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
		return emp;
	}
	public ArrayList<Employee> getEmployee() {
		Employee emp = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		ArrayList<Employee> empList = new ArrayList<>();
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			pst = con.prepareStatement("select * from employee");
			rs = pst.executeQuery();
			while (rs.next()) {
				emp = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getDate(4));
				empList.add(emp);
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
		return empList;
	}
}
