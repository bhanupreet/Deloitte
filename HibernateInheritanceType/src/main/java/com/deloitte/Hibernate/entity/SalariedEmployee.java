package com.deloitte.Hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@SuppressWarnings("serial")
public class SalariedEmployee extends Employee {
	
	@Column(columnDefinition = "number(6,2)")
	private double salary;

	public SalariedEmployee() {
		super();
	}

	public SalariedEmployee(int empid, String ename, double salary) {
		super(empid, ename);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
