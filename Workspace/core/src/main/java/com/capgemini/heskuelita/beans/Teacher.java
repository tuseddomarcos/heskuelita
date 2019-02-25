package com.capgemini.heskuelita.beans;

import java.util.Date;

public class Teacher extends Person {
	private String title;
	public Teacher(int idTeacher,String name, String lastName, Date birthdate, String documentType, int phone, char gender,
			String email, String password, String securityQuest, String answer, String title) {
		super(idTeacher,name, lastName, birthdate, documentType, phone, gender, email, password, securityQuest, answer);
		// TODO Auto-generated constructor stub
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
