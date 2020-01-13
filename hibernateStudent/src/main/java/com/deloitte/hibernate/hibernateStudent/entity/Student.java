package com.deloitte.hibernate.hibernateStudent.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "student")
@Entity
public class Student {
	
	@Id
	@Column(columnDefinition = "number(3)")
	private int rollno;
	
	@Column(columnDefinition = "varchar2(20)")
	private String name;
	
	@Column(columnDefinition = "number(6,2)")
	private double marks1;
	
	@Column(columnDefinition = "number(6,2)")
	private double marks2;

	public Student() {
	}

	public Student(String name, int rollno, double marks1, double marks2) {
		this.name = name;
		this.rollno = rollno;
		this.marks1 = marks1;
		this.marks2 = marks2;
	}

	public String toString() {
		double total = marks1 + marks2;
		return "\n Name        = " + this.getName() + 
				"\n Roll no     = " + rollno + 
				"\n Total Marks = " + total + "\n";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotal() {
		return marks1 + marks2;
	}

	public int getRollno() {
		return rollno;
	}

	public double getMarks1() {
		return marks1;
	}

	public void setMarks1(double marks1) {
		this.marks1 = marks1;
	}

	public double getMarks2() {
		return marks2;
	}

	public void setMarks2(double marks2) {
		this.marks2 = marks2;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
}