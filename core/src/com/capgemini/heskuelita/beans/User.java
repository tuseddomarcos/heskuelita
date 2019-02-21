package com.capgemini.heskuelita.beans;

public class User {

	private int user_ID;
	private String user_pass;
	private String user_email;
	private int stu_ID;
	
	public User(int pID, String pPass, String pEmail, int pStu_ID) {
		
		this.user_ID=pID;
		this.user_pass=pPass;
		this.user_email=pEmail;
		this.stu_ID=pStu_ID;
		
	}

	public int getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public int getStu_ID() {
		return stu_ID;
	}

	public void setStu_ID(int stu_ID) {
		this.stu_ID = stu_ID;
	}

	
	
}
