package com.deloitte.java.models;

public class SalesMan extends Employee {
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	int points;

	SalesMan() {
	}

	public SalesMan(String name, int age, int ssn, int empid, double salary, int points) {
		super(name, age, ssn, empid, salary);
		this.points = points;
	}

	public double getIncentives() {
		return points * 500;
	}

	public double getTotalSalary() {
		double sal = getSalary();
		return getSalary() + points * 500;
	}

	public String toString() {
		return "\n Name        = " + this.getName() + "\n SSN         = " + this.getSsn() + "\n Age         = "
				+ this.getAge() + "\n Empid       = " + getEmpid() + "\n Salary      = " + getSalary()
				+ "\n incentives  = " + this.getIncentives();
	}
}