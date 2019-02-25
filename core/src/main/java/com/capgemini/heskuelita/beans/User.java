package com.capgemini.heskuelita.beans;

public class User extends IDComponent {

	
	private String user_pass;
	private String user_email;
	private Student student;
	
	public User () {super();}
	
	public User(Long pID, String pPass, String pEmail, Student pStudent) {
		
		super (pID);
		this.user_pass=pPass;
		this.user_email=pEmail;
		this.student=pStudent;
		
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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
