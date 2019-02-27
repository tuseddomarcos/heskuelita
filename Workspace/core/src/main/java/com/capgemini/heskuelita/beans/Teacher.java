package com.capgemini.heskuelita.beans;

import java.time.LocalDate;

public class Teacher extends Person {
	private String title;
	public Teacher(long idTeacher,String name, String lastName, LocalDate birthdate, String documentType,long identification ,long phone, char gender,
			String email, String password, String securityQuest, String answer, String title) {
		super(idTeacher,name, lastName, birthdate, documentType, identification, phone, gender, email, password, securityQuest, answer);
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
