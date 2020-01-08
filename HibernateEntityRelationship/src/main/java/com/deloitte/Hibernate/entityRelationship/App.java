package com.deloitte.Hibernate.entityRelationship;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.deloitte.Hibernate.entityRelationship.entity.Courses;
import com.deloitte.Hibernate.entityRelationship.entity.Department;
import com.deloitte.Hibernate.entityRelationship.entity.Employee;
import com.deloitte.Hibernate.entityRelationship.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();

		cfg.addAnnotatedClass(Courses.class);
		cfg.addAnnotatedClass(Student.class);
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		Query query = session.createQuery("from Employee e where e.salary > 2000");
		//
		List<Employee> eList = query.list();
		for (Employee e : eList) {
			System.out.println(e);
		}

		// MANY TO MANY RELATIONSHIP
		// Courses c = session.get(Courses.class, 7001);
		// if (c != null) {
		// System.out.println(c.getCname() + c.getCid());
		// for (Student s : c.getsList()) {
		// System.out.println(s.getSid() + s.getSname() + s.getAddress());
		// }
		// }
		//
		// Student s = session.get(Student.class, 103);
		// if (s != null){
		// System.out.println(s.getSname() + s.getSid());
		// for(Courses c1: s.getcList()){
		// System.out.println(c.getCname() + c.getCid());
		// }
		// }

		// ONE TO MANY OR MANY TO ONE
		// Employee e1 = new Employee(1001, "Ajay", 2000);
		// Employee e2 = new Employee(1002, "Babu", 3000);
		// Employee e3 = new Employee(1003, "bhanu", 4000);
		// Employee e4 = new Employee(1004, "vaibhav", 5000);
		//
		// List<Employee> eList1 = new ArrayList<>(), eList2 = new
		// ArrayList<>();
		//
		// eList1.add(e1);
		// eList1.add(e2);
		// eList2.add(e3);
		// eList2.add(e4);
		//
		// Department d1 = new Department(30, "sales", eList1);
		// Department d2 = new Department(40, "accounts", eList2);
		//
		// session.save(e1);
		// session.save(e2);
		// session.save(e3);
		// session.save(e4);
		// session.save(d1);
		// session.save(d2);

		// ONE TO ONE
		// AadharCard ac = new AadharCard(12345,"Govt of India",new
		// Date(2019,2,3));
		// Person p1 = new Person("Ajay",ac,"Hitec city",22);

		// Person p1 = session.get(Person.class, "Ajay");
		// if (p1 != null) {
		// System.out.println(p1);
		// AadharCard ac = p1.getAcard();
		// System.out.println(ac.getAid());
		// }
		//
		// AadharCard ac2 = session.get(AadharCard.class, 12345);
		// if (ac2 != null) {
		// System.out.println(ac2.getAid() + "\n");
		// System.out.println(ac2.getPerson());
		// }

		// session.save(ac);
		// session.save(p1);
		// trans.commit();
		// Department d = session.get(Department.class, 40);
		// if (d != null) {
		//// System.out.println(d.getdName() + " " + d.getDeptno());
		// for (Employee e : d.geteList()) {
		//// System.out.println(e);
		// }
		// }
		//
		// // bidirectional
		// Employee e = session.get(Employee.class, 1001);
		// if (e != null) {
		// System.out.println(e);
		// Department dep = session.get(Department.class,e.getDeptno())
		// System.out.println(depgetdName() + " " + dep.getDeptno());
		// }

		session.close();
		factory.close();
	}
}
