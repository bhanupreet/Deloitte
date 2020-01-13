package com.deloitte.hibernate.hibernateStudent.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentDAO {

	SessionFactory factory;

	public StudentDAO(SessionFactory factory) {
		this.factory = factory;
	}
	
	public boolean insertStudent(Student stu) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(stu);
		trans.commit();
		session.close();
		return stu != null;
	}

	public boolean updateStudent(Student stu) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.update(stu);
		trans.commit();
		session.close();
		return stu != null;
	}

	public boolean deleteStudent(int rollno) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		Student s = session.get(Student.class, rollno);
		if (s != null) {
			session.delete(s);
			trans.commit();
		}
		return s != null;
	}

	public Student getStudent(int rollno) {
		Session session = factory.openSession();
		return session.get(Student.class, rollno);
	}

	@SuppressWarnings("unchecked")
	public List<Student> getStudent() {
		Session session = factory.openSession();
		return session.createQuery("from Student").list();
	}
}
