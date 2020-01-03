package com.deloitte.servlet;

public class Accounts {
	private String username;
	private String name;
	private double balance;
	
	public Accounts(){}
	
	public Accounts(String username, String name, double balance) {
		this.username = username;
		this.name = name;
		this.balance = balance;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
