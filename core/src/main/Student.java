package com.capgemini.heskuelita.beans;

import java.util.Date;

public class Student extends Person {
	
	private int idStu, phone;
	private String address;
	
	public Student(int idStu, String name, String lastName, int dni, Date birthdate, int phone, String address, char gender) {
		super(name, lastName, dni, birthdate, gender);
		
		this.idStu = idStu;
		this.phone = phone;
		this.address = address;
	}
	
	
	// GETTERS AND SETTERS ----------------------------------------------------
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return idStu;
	}

	public void setIdStu(int idStu) {
		this.idStu = idStu;
	}

}
