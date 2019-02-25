package com.capgemini.heskuelita.beans;

import java.util.Date;

public class Person {

	private String name, lastName;
	private int dni;
	private Date birthdate;
	private char gender;
	
	public Person(String name, String lastName, int dni, Date birthdate, char gender) {
		this.name = name;
		this.lastName = lastName;
		this.dni = dni;
		this.birthdate = birthdate;
		this.gender = gender;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
}
