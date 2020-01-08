package com.deloitte.Hibernate.entityRelationship.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	@Id
	@Column(columnDefinition = "number(4)")
	private int empid;

	@Column(columnDefinition = "varchar2(10)")
	private String name;

	@Column(columnDefinition = "number(6,2)")
	private double salary;
	
	@ManyToOne
	@JoinColumn(name = "deptno")
	Department dept;

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String toString() {
		return 	"\n Name        = " + name + 
				"\n Empid       = " + empid + 
				"\n Salary      = " + salary ;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

}
