package com.capgemini.heskuelita.beans;

public class Student extends Person{
	
	private String user;
	private String pw;
	
	public Student() {
		super();
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}	
	
}