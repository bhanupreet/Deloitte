package com.deloitte.java;
import java.io.Serializable;

import com.deloitte.java.models.Department;
import com.deloitte.java.models.Employee2;

public class EqualsAndToString {
	public static void main(String args[]){
		Employee2[] e1 = {new Employee2(101, "Ajay", 25000),
						 new Employee2(102, "Bhanu", 22200),
						 new Employee2(103, "Abhishek", 30000),
						 new Employee2(104, "Babu", 20000)};
		Department d = new Department("Sales", 10, e1);
		
		System.out.print("\n Deptno   = " + d.getDeptNo());
		System.out.print("\n DeptName = " + d.getDeptName());
		System.out.print("\n Employee details \n");
		Employee2 e2[] = d.getEmployee();
		for(int i  = 0;i < e2.length ; i++){
			System.out.print("\n Empid 	  = " + e2[i].getEmpid());
			System.out.print("\n Ename    = " + e2[i].getEname());
			System.out.print("\n Salary   = " + e2[i].getSalary() + "\n");
		}
		
	}
}
