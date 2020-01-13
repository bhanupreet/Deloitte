package com.deloitte.hibernate.hibernateStudent;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.deloitte.hibernate.hibernateStudent.entity.Student;
import com.deloitte.hibernate.hibernateStudent.entity.StudentDAO;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();

		StudentDAO dao = new StudentDAO(factory);

		Student s1 = new Student("Bhanu", 1, 99, 99);
		Student s2 = new Student("Jeevani", 2, 90, 90);
		Student s3 = new Student("Padmaja", 3, 80, 80);
		
		dao.insertStudent(s1);
		dao.insertStudent(s2);
		dao.insertStudent(s3);
		
		s3.setMarks1(99);
		s3.setMarks2(90);
		
		dao.updateStudent(s3);
		
		dao.deleteStudent(2);
		
		Student s4 = dao.getStudent(1);
		
		System.out.println(s4);
		
		List<Student> sList = dao.getStudent();
		
		for(Student s: sList){
			System.out.println(s);
		}
	}
}