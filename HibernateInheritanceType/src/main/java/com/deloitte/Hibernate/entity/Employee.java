package com.deloitte.Hibernate.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
// in case table name is not same
@Table(name = "employee")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Employee implements Comparable<Employee>, Serializable {
	
	@Id
	@Column(columnDefinition = "number(4)")
	private int empid;

	@Column(columnDefinition = "varchar2(30)")
	private String name;

	public Employee() {
	}

	public Employee(int empid, String name) {
		this.name = name;
		this.empid = empid;
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

	public String toString() {
		return "\n Name        = " + this.getName() + "\n Empid       = " + empid;
	}

	public int getEmpid() {
		return empid;
	}

	public int compareTo(Employee arg0) {
		return empid - arg0.getEmpid();
	}
}
