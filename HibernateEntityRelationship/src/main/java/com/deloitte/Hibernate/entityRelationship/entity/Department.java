package com.deloitte.Hibernate.entityRelationship.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Department")
public class Department {

	@Id
	@Column(columnDefinition = "number(3)")
	private int deptno;

	@Column(columnDefinition = "varchar2(10)")
	private String dName;

	@OneToMany(mappedBy = "dept")
	private List<Employee> eList;

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public List<Employee> geteList() {
		return eList;
	}

	public void seteList(List<Employee> eList) {
		this.eList = eList;
	}

	public Department(int deptno, String dName, List<Employee> eList) {
		super();
		this.deptno = deptno;
		this.dName = dName;
		this.eList = eList;
	}

	public Department() {
		super();
	}

}
