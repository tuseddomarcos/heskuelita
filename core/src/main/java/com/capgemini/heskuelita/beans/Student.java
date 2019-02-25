package com.capgemini.heskuelita.beans;

import java.util.Date;

public class Student extends Person {

	
	public Student(String Name, String LastName, Date BirthDay, Boolean Sex, String NumId) {
		super(Name, LastName, BirthDay, Sex, NumId);
	
	}

	private String Phone;

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}
	
	
	
	

}

