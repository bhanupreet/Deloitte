package com.deloitte.java;

import java.io.Serializable;

import com.deloitte.java.models.Employee;
import com.deloitte.java.models.PgStudent;
import com.deloitte.java.models.SalesMan;
import com.deloitte.java.models.Student;
public class Inheritance {
	public static void main(String args[]) {
		Employee e1 = new Employee("Bhanu", 22, 1234345, 101, 20000);
//		System.out.print(e1);

		Student s1 = new Student("Bhanu", 22, 1234567, 10, 80, 90);
//		System.out.print(s1);

		SalesMan sm1 = new SalesMan("Bhanu", 22, 1234345, 101, 20000, 100);
//		System.out.print(sm1);

		PgStudent pg1 = new PgStudent("babu", 23, 12324432, 11, 75, 80, 76);
//		System.out.print(pg1);
	}
}
