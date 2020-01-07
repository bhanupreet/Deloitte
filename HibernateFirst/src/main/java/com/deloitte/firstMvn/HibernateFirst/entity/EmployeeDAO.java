package com.deloitte.firstMvn.HibernateFirst.entity;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDAO {

	SessionFactory factory = null;

	public EmployeeDAO(SessionFactory factory) {
		this.factory = factory;
	}

	public boolean insertEmployee(Employee emp) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(emp);
		trans.commit();
		session.close();
		return emp != null;
	}

	public boolean updateEmployee(Employee emp) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.update(emp);
		trans.commit();
		session.close();
		return emp != null;
	}

	public boolean deleteEmployee(int empid) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		Employee e3 = session.load(Employee.class, 101);
		session.delete(e3);
		trans.commit();
		return e3 != null;
	}

	public Employee getEmployee(int empid) {
		Session session = factory.openSession();
		return session.get(Employee.class, 101);
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getEmployee() {
		Session session = factory.openSession();
		return session.createQuery("from Employee").list();
	}
}
