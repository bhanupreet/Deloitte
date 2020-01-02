package com.Deloitte.Java.dao;

import java.sql.Date;

public class Student {
	private int rollno, age;
	private String name;
	private Date dob;
	
	public Student(int rollno,String name,int age, Date dob) {
		this.rollno = rollno;
		this.age = age;
		this.name = name;
		this.dob = dob;
	}
	
	public Student() {}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
}
