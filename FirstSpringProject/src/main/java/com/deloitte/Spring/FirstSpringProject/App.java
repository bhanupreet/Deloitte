package com.deloitte.Spring.FirstSpringProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deloitte.Spring.FirstSpringProject.model.AppConfig;
import com.deloitte.Spring.FirstSpringProject.model.Person;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// application context container goes for eager initialization in case
		// of singleton beans

		// ClassPathXmlApplicationContext context = new
		// ClassPathXmlApplicationContext("bean.xml");
		// Wisher w1 = (Wisher)context.getBean("wish1");
		// System.out.println(w1.getMessage());
		// Wisher w2 = (Wisher)context.getBean("wish1");
		// w2.setMessage("new message");
		// System.out.println(w2.getMessage());

		Person p = context.getBean(Person.class, "per1");
		System.out.println(p.getSsn() + p.getName());
		System.out.println(p.getAddress().getHno() + p.getAddress().getCity());

		// context.close();
	}

}

// scopes of beans
// Singleton
// Prototype
// session
// request
// application
