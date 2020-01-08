package com.deloitte.Spring.FirstSpringProject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

// component synonyms:
// @Controller
// @Service
// @Repository
// @Component
public class Person {

	int ssn;
	String name;
	
	@Autowired
	@Qualifier("address")
	Address address;

	public Person() {
		super();
	}

	public Person(int ssn,String name,Address address){
		super();
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
