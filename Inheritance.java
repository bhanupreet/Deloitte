import java.io.Serializable;

class Person {

	private int ssn, age;
	private String name;

	Person() {
	}

	Person(String name, int age, int ssn) {
		this.name = name;
		this.age = age;
		this.ssn = ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getSsn() {
		return ssn;
	}

	public int getAge() {
		return age;
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}
}

class Employee extends Person implements Comparable<Employee>, Serializable {
	private int empid;
	private double salary;

	Employee() {
	}

	Employee(String name, int age, int ssn, int empid, double salary) {
		super(name, age, ssn);
		this.empid = empid;
		this.salary = salary;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return  "\n Name        = " + this.getName() + 
				"\n SSN         = " + this.getSsn() + 
				"\n Age         = "	+ this.getAge() + 
				"\n Empid       = " + empid + 
				"\n Salary      = " + salary;
	}

	public double getSalary() {
		return salary;
	}

	public int getEmpid() {
		return empid;
	}

	@Override
	public int compareTo(Employee arg0) {
		return empid - arg0.getEmpid();
	}
}

class Student extends Person {
	private int rollno;
	private double marks1, marks2;

	Student() {
	}

	Student(String name, int age, int ssn, int rollno, double marks1, double marks2) {
		super(name, age, ssn);
		this.rollno = rollno;
		this.marks1 = marks1;
		this.marks2 = marks2;
	}

	public String toString() {
		double total = marks1 + marks2;
		return 	"\n Name        = " + this.getName() +
				"\n Age         = " + this.getAge() + 
				"\n SSN         = "	+ this.getSsn() + 
				"\n Roll no     = " + rollno + 
				"\n Total Marks = " + total + 
				"\n";
	}

	public double getTotal() {
		return marks1 + marks2;
	}

	public int getRollno() {
		return rollno;
	}

	public double getMarks1() {
		return marks1;
	}

	public void setMarks1(double marks1) {
		this.marks1 = marks1;
	}

	public double getMarks2() {
		return marks2;
	}

	public void setMarks2(double marks2) {
		this.marks2 = marks2;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void disply() {
		super.display();
		System.out.print("\n Name        = " + this.getName() +
				"\n Age         = " + this.getAge() + 
				"\n SSN         = "	+ this.getSsn() + 
				"\n Roll no     = " + rollno + 
				"\n Total Marks = " + total + 
				"\n");
	}
	
}

class SalesMan extends Employee {
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	int points;

	SalesMan() {
	}

	SalesMan(String name, int age, int ssn, int empid, double salary, int points) {
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

class PgStudent extends Student {
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

public class Inheritance {
	public static void main(String args[]) {
		Employee e1 = new Employee("Bhanu", 22, 1234345, 101, 20000);
		System.out.print(e1);

		Student s1 = new Student("Bhanu", 22, 1234567, 10, 80, 90);
		System.out.print(s1);

		SalesMan sm1 = new SalesMan("Bhanu", 22, 1234345, 101, 20000, 100);
		System.out.print(sm1);

		PgStudent pg1 = new PgStudent("babu", 23, 12324432, 11, 75, 80, 76);
		System.out.print(pg1);
	}
}
