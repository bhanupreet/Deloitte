package com.deloitte.firstMvn.Hibernate.view;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.firstMvn.HibernateFirst.entity.Employee;

public class App {
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.put("hibernate.connection.driver_class", "oracle.jdbc.driver.OracleDriver");
        prop.put("hibernate.connection.url", "jdbc:oracle:thin:@localhost:1521:orcl");
        prop.put("hibernate.connection.username", "scott");
        prop.put("hibernate.connection.password", "tiger");
        prop.put("hibernate.show_sql", "true");
        prop.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");

		@SuppressWarnings("deprecation")
		Employee emp = new Employee(101, "Bhanupreet singh", 1000, new Date(2020, 1, 3));
		// Hibernate framework configuration
		Configuration cfg = new Configuration();
		
	//	cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		cfg.setProperties(prop);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		// CREATE
//		 session.save(emp);
		
		// READ
		@SuppressWarnings("rawtypes")
		List list = session.createQuery("from Employee").list();
		@SuppressWarnings("rawtypes")
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Employee emp1 = (Employee) itr.next();
			System.out.println(emp1);
		}
		
		Employee e = session.get(Employee.class, 101);
		System.out.println(e);

		// UPDATE
		// emp.setName("Ajay");
		// emp.setSalary(2000);
		// session.update(emp);
//		   session.saveOrUpdate(emp);

		// DELETE
//		Employee e2 = new Employee(101,"Ajay",2000,new Date(2020, 1, 3));
//		session.delete(e2);
//		session.delete(emp);

		trans.commit();
		session.close();
		factory.close();
	}
}
