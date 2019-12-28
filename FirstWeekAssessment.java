import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable {
	private int rollno, age;
	private String name;
	private double marks1, marks2;

	Students() {}

	Students(String name, int age, int rollno, double marks1, double marks2) {
		this.name = name;
		this.age = age;
		this.rollno = rollno;
		this.marks1 = marks1;
		this.marks2 = marks2;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String toString() {
		double total = marks1 + marks2;
		return "\n" + rollno + "       " + name + "   " + age + "   " + total + "   ";
	}
	
	@Override
	public int compareTo(Object arg0) {
		Students s1 = (Students) arg0;
		return rollno - s1.getRollno();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) 
            return true; 
  
        if (obj == null || obj.getClass() != this.getClass()) 
            return false; 
        
		Students s1 = (Students) obj;
		return s1.getName() == this.getName() && s1.getAge() == this.getAge() && s1.getRollno() == this.getRollno()
				&& s1.getTotal() == this.getTotal();
	}

	@Override
	public int hashCode() {
		return rollno;
	}
}

class Training {

	int trainingId;
	String trainingName;
	List<Students> mStudentList = new ArrayList<>();

	Training() {}

	public Training(int trainingId, String trainingName, List<Students> mStudentList) {
		this.trainingId = trainingId;
		this.trainingName = trainingName;
		this.mStudentList = mStudentList;
	}

	public int getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public List<Students> getmStudentList() {
		return mStudentList;
	}

	public void setmStudentList(List<Students> mStudentList) {
		this.mStudentList = mStudentList;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == this) 
            return true; 
  
        if (o == null || o.getClass() != this.getClass()) 
            return false; 
        
        Training c = (Training) o; 
        return 	trainingId == c.getTrainingId() && 
        		trainingName == c.getTrainingName();
	}

	@Override
	public int hashCode() {
		return trainingId;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public String toString() {
		Collections.sort(mStudentList);
		return "\nTraining ID = " + trainingId + " \n" + "Training Name = " + trainingName + "\n\nRollNo" + "  Name "
				+ " Age " + " TotalMarks " + "\n" + mStudentList;
	}

}

public class FirstWeekAssessment {
	public static void main(String[] args) {
		List<Students> studentList = new ArrayList<>();

		studentList.add(new Students("Ajay", 18, 1, 75, 80));
		studentList.add(new Students("Jeevani", 22, 5, 75, 80));
		studentList.add(new Students("Flemine", 21, 4, 30, 40));
		studentList.add(new Students("Bhanu", 19, 2, 85, 90));
		studentList.add(new Students("Vaibhav", 20, 3, 71, 74));

		Training t1 = new Training(101, "Java", studentList);

		System.out.println(t1);

	}
}
