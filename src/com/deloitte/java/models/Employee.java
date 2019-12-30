package com.deloitte.java.models;

import java.io.Serializable;

public class Employee extends Person implements Comparable<Employee>, Serializable {
	private int empid;
	private double salary;

	Employee() {
	}

	public Employee(String name, int age, int ssn, int empid, double salary) {
		super(name, age, ssn);
		this.empid = empid;
		this.salary = salary;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "\n Name        = " + this.getName() + "\n SSN         = " + this.getSsn() + "\n Age         = "
				+ this.getAge() + "\n Empid       = " + empid + "\n Salary      = " + salary;
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