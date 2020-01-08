package com.deloitte.Spring.FirstSpringProject.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Wisher implements DisposableBean, InitializingBean{

	private String message;
	
	public Wisher(){}
	
	public Wisher(String message){
		this.message = message;
		System.out.println("bean is createds");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void initWisher(){
		System.out.println("bean initialised");
	}
	
	public void destWisher(){
		System.out.println("destroyed");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("from aps set");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("from dest method");
	}
}
