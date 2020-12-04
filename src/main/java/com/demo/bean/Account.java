package com.demo.bean;

public class Account {
	String username;
	String passwordUser;
	String accountNumber;
	public Account() {
		super();
	}
	public Account(String username, String passwordUser, String accountNumber) {
		super();
		this.username = username;
		this.passwordUser = passwordUser;
		this.accountNumber = accountNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswordUser() {
		return passwordUser;
	}
	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
}
