package com.deloitte.Spring.FirstSpringProject.model;

import org.springframework.context.annotation.Bean;

public class AppConfig {

	@Bean
	public Address address(){
		return new Address("101","Delhi","Delhi");
	}
	
	@Bean
	public Person person(){
		return new Person(101,"bhanu",address());
	}
}
