package com.spring.web.firstcontroller.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spring.web.firstcontroller.entity.Users;

public class UsersDAO {

	SessionFactory factory;

	public UsersDAO() {
	}

	public UsersDAO(SessionFactory factory) {
		this.factory = factory;
	}

	public boolean validateUser(String username, String password) {
		Session session = factory.openSession();
		Users u = session.get(Users.class, username);
		if (u != null) {
			if (u.getPassword().equals(password))
				return true;
			else
				return false;
		} else {
			return false;
		}
	}
}
