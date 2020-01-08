package com.deloitte.Hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@SuppressWarnings("serial")
public class HourlyEmployee extends Employee {

	@Column(columnDefinition = "number(6,2)")
	private double rate;

	@Column(columnDefinition = "number(4)")
	private int hours;

	public HourlyEmployee(int empid, String ename, double rate, int hours) {
		super(empid, ename);
		this.setHours(hours);
		this.setRate(rate);
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
}
