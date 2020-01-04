package com.Deloitte.servlet.CRUD;

import java.io.Serializable;
import java.sql.Date;

public class Employee  implements Comparable<Employee>, Serializable {
	
	private int empid;
	private double salary;
	private String name;
	private Date doj;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Employee() {
	}

	public Employee(int empid,String name, double salary, Date doj) {
		this.name = name;
		this.empid = empid;
		this.doj = doj;
		this.salary = salary;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return 	"\n Name        = " + this.getName()   + 
				"\n Empid       = " + empid + 
				"\n Salary      = " + salary + 
				"\n Date	     = " + doj;
	}

	public double getSalary() {
		return salary;
	}

	public int getEmpid() {
		return empid;
	}

	@Override
	public int compareTo(Employee arg0) {
		return empid - arg0.getEmpid();
	}
}