package com.deloitte.java.models;

public class PgStudent extends Student {
	private double attendance;

	public double getAttendance() {
		return attendance;
	}

	public void setAttendance(double attendance) {
		this.attendance = attendance;
	}

	public PgStudent() {
	}

	public PgStudent(String name, int age, int ssn, int rollno, double marks1, double marks2, double attendance) {
		super(name, age, ssn, rollno, marks1, marks2);
		this.attendance = attendance;
	}

	public boolean checkExamEligibility() {
		if (attendance >= 75)
			return true;
		else
			return false;
	}

	public String toString() {
		return "\n\n Name          = " + this.getName() + "\n Age           = " + this.getAge() + "\n SSN           = "
				+ this.getSsn() + "\n Roll no       = " + getRollno() + "\n attendance    = " + attendance
				+ "\n Total Marks   = " + getTotal() + "\n exam eligible = " + this.checkExamEligibility() + "\n";
	}
}