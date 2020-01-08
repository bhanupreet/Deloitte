package com.deloitte.Hibernate.entityRelationship.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Courses {

	@Id
	int cid;
	String cname;
	int duration;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "student_course_reg", joinColumns = { @JoinColumn(name = "cid") }, inverseJoinColumns = {
			@JoinColumn(name = "sid") })
	List<Student> sList;

	public Courses(int cid, String cname, int duration, List<Student> sList) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.duration = duration;
		this.sList = sList;
	}

	public Courses() {
		super();
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public List<Student> getsList() {
		return sList;
	}

	public void setsList(List<Student> sList) {
		this.sList = sList;
	}

}
