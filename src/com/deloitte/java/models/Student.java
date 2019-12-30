package com.deloitte.java.models;

import java.io.Serializable;

public class Student extends Person implements Serializable {
	private int rollno;
	private double marks1, marks2;

	public Student() {
	}

	public Student(String name, int age, int ssn, int rollno, double marks1, double marks2) {
		super(name, age, ssn);
		this.rollno = rollno;
		this.marks1 = marks1;
		this.marks2 = marks2;
	}

	public String toString() {
		double total = marks1 + marks2;
		return "\n Name        = " + this.getName() + "\n Age         = " + this.getAge() + "\n SSN         = "
				+ this.getSsn() + "\n Roll no     = " + rollno + "\n Total Marks = " + total + "\n";
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