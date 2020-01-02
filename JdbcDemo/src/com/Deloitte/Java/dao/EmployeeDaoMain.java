package com.Deloitte.Java.dao;

import java.sql.Date;
import java.util.ArrayList;

public class EmployeeDaoMain {
	public static void main(String args[]) {
		@SuppressWarnings("deprecation")
		Employee e = new Employee(102, "Babu Raja", 2000, new Date(1990, 10, 12));
		EmployeeDAO edao = new EmployeeDAO();
//		if (edao.insertEmployee(e)) {
////			System.out.println("Employee record inserted");
//		} else {
////			System.out.println("Insertion failed");
//		}

		Employee e1 = new Employee(102, "Bhanupreet", 3000, new Date(1990, 10, 12));
//		if (edao.updateEmployee(e1)) {
////			System.out.println("modified");
//		} else {
////			System.out.println("error");
//		}
		
		ArrayList<Employee> eList = new ArrayList<>();
		eList = edao.getEmployee();
//		System.out.println(eList);

		Employee e2 = edao.getEmployee(102);
		if (e2 != null) {
//			System.out.println(e1);
		} else {
//			 System.out.println("Employee with given id does not exist");
		}
		
//		if(edao.removeEmployee(102)) {
//			System.out.println("employee deleted");
//		}
//		else {
//			System.out.println("failed");
//		}
		
		
	}
}