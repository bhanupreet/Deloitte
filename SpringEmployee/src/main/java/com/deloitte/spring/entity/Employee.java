package com.deloitte.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Entity
@Component
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


	public Employee() {
		super();
	}

	public Employee(int empid,String name, double salary) {
		this.name = name;
		this.empid = empid;

		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
				"\n Salary      = " + salary ;
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