package com.cognixa.model;

public class Account {
	String password;
	String email;

	public Account(String email, String password) {
		super();
		this.password = password;
		this.email = email;
	}

	public Account() {

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
