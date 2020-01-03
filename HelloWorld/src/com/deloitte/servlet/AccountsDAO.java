package com.deloitte.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AccountsDAO {
	public boolean updateBalance(String username, double amount) {
		int count = 0;
		Connection con = null;
		PreparedStatement pst = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			pst = con.prepareStatement("update accounts set balance = balance - ? where username = ?");

			pst.setDouble(1, amount);
			pst.setString(2, username);
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
}
