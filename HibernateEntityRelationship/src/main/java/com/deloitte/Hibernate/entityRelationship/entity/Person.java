package com.deloitte.Hibernate.entityRelationship.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@Column(name = "name", columnDefinition = "varchar2(20)")
	private String name;

	@OneToOne()
	@JoinColumn(name = "aid")
	private AadharCard acard;

	@Column(columnDefinition = "varchar2(20)")
	private String address;

	@Column(columnDefinition = "number(3)")
	private int age;

	public Person() {
		super();
	}

	public Person(String name, AadharCard acard, String address, int age) {
		super();
		this.name = name;
		this.acard = acard;
		this.address = address;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AadharCard getAcard() {
		return acard;
	}

	public void setAcard(AadharCard acard) {
		this.acard = acard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return  "name     = "  + name + "\n" +
				"acard no = "  + acard.getAid() + "\n" +
				"address  = "  + address + "\n" +
				"age      = "  + age +"\n" ;
	}
	
	
}
