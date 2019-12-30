package com.deloitte.java.models;

import java.io.Serializable;

public class Person implements Serializable{

	private int ssn, age;
	private String name;

	Person() {
	}

	Person(String name, int age, int ssn) {
		this.name = name;
		this.age = age;
		this.ssn = ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getSsn() {
		return ssn;
	}

	public int getAge() {
		return age;
	}
}