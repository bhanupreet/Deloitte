package com.deloitte.java.models;

public class Department {
	private String deptName;
	private int deptNo;
	private Employee2[] e;

	public Department() {
	}

	public Department(String deptName, int deptNo, Employee2[] e) {
		this.deptName = deptName;
		this.deptNo = deptNo;
		this.e = e;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setEmployee(Employee2 e[]) {
		this.e = e;
		;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public Employee2[] getEmployee() {
		return e;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;

		if (o == null || o.getClass() != this.getClass())
			return false;

		Department c = (Department) o;
		return deptNo == c.deptNo;
	}

	@Override
	public int hashCode() {
		return this.deptNo;
	}
}
