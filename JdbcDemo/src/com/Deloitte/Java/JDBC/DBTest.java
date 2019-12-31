package com.Deloitte.Java.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class DBTest {

	public static void main(String args[]) throws Exception {

		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con = null;
		PreparedStatement st = null;
//		st.setDouble(1, 2000);
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
//			st = con.prepareStatement("select * from emp where sal > ?");
//			if (rs.next()) 
//				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
//			
//			st.setDouble(1, 3000);
//			 rs = st.executeQuery();
//			while (rs.next()) {
//				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
//			}

//			st = con.prepareStatement("insert into employee values(?,?)");
////			st = con.prepareStatement("select * from employee where empid = ?");
//			
//			st = con.prepareStatement("insert into employee values(?,?)");
//			st.setString(2, "Chandu");
//			st.setInt(1, 101);
//			int count = st.executeUpdate();
//			System.out.println(count + " rows inserted");
//
//			st.setString(2, "Ajay");
//			st.setInt(1, 102);
//			count = st.executeUpdate();
//			System.out.println(count + " rows inserted");

			st = con.prepareCall("call insertMaster(?,?,?)");
			st.setInt(1, 106);
			st.setString(2,"babu raja");
			st.setDouble(3, 12345.67);
			
			st.executeUpdate();
			
//			st = con.prepareStatement("select * from dept", ResultSet.TYPE_SCROLL_SENSITIVE,
//					ResultSet.CONCUR_READ_ONLY);
			
//			rs = st.executeQuery();
//			ResultSetMetaData rsmd = rs.getMetaData();
//			int count = rsmd.getColumnCount();
//			while (rs.next()) {
//				for (int i = 1; i <= count; i++) {
//					System.out.print(rs.getString(i) + " ");
//				}
//				System.out.print("\n");
//			}
////				
//			System.out.println();
//
//			while (rs.previous()) {
//				for (int i = 1; i <= count; i++) {
//					System.out.print(rs.getString(i) + " ");
//				}
//				System.out.print("\n");
//			}

//			
//			
//			for(int i = 1;i<= count; i++) {
//				System.out.print(rsmd.getColumnName(i) + " ");
//				
//			}
//			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
