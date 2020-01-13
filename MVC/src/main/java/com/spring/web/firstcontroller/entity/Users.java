package com.spring.web.firstcontroller.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {

	@Id
	@Column(columnDefinition = "varchar2(20)")
	private String Username;
	
	@Column(columnDefinition = "varchar2(20)")
	private String password;

	public String getUsername() {
		return Username;
	}

	public Users() {
		super();
	}

	public Users(String username, String password) {
		super();
		Username = username;
		this.password = password;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
