package com.deloitte.Hibernate.entityRelationship.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	int sid;
	String sname;
	String address;
	
	@ManyToMany(mappedBy = "slist")
	List<Courses> cList;
	
	public Student(int sid, String sname, String address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Courses> getcList() {
		return cList;
	}
	public void setcList(List<Courses> cList) {
		this.cList = cList;
	}
	
}
