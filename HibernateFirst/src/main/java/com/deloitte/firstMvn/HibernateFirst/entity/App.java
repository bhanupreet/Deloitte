package com.deloitte.firstMvn.HibernateFirst.entity;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		@SuppressWarnings("deprecation")
		Employee emp = new Employee(101, "Bhanupreet singh", 1000, new Date(2020, 1, 3));
		// hibernate framework functions
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		// add to table
		// session.save(emp);

		// update
		// emp.setName("Ajay");
		// emp.setSalary(2000);
		// session.update(emp);

		// session.evict(emp);

		@SuppressWarnings("rawtypes")
		List list = session.createQuery("from Employee").list();
		@SuppressWarnings("rawtypes")
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Employee emp1 = (Employee) itr.next();
			System.out.print(" Name: " + emp1.getName());
			System.out.print(" Salary: " + emp1.getSalary());
			System.out.println();
		}

		trans.commit();
		session.close();
		factory.close();

	}
}
