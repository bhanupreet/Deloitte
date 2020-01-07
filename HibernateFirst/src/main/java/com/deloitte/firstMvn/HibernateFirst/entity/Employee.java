package com.deloitte.firstMvn.HibernateFirst.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
//in case table name is not same
@Table(name = "employee")
public class Employee  implements Comparable<Employee>, Serializable {
	
	@Id
	@Column(columnDefinition = "number(4)")
	private int empid;
	
	@Column(columnDefinition = "number(8,2)")
	private double salary;
	
	@Column(columnDefinition = "varchar2(30)")
	private String name;
	
	private Date doj;
	
	public Employee() {
	}

	public Employee(int empid,String name, double salary, Date doj) {
		this.name = name;
		this.empid = empid;
		this.doj = doj;
		this.salary = salary;
	}
	
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
				"\n Date	     = " + this.getDoj();
	}

	public double getSalary() {
		return salary;
	}

	public int getEmpid() {
		return empid;
	}

	public int compareTo(Employee arg0) {
		return empid - arg0.getEmpid();
	}
}
