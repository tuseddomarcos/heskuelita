package com.capgemini.heskuelita.beans;

public class Student extends Person {
	
	private int phone;
	
	public Student() {
		super();
	}
	
	public Student(int idStu, String name, String lastName, int dni, /*Date birthdate,*/ int phone, String address, char gender) {
		super(idStu, name, lastName, dni, /*birthdate,*/ address, gender);
		
		this.phone = phone;
	}
	
	
	// GETTERS AND SETTERS ----------------------------------------------------
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}
