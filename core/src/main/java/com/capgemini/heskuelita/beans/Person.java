package com.capgemini.heskuelita.beans;

import java.time.LocalDate;


public class Person extends Component{

	private String firstName;
	private String lastName;
	private int dni;
	private int phone;
	private String email;
	private String password;
	private char gender;
	private LocalDate birthdate; 
	
	
	public Person(String firstName, String lastName, int dni, char gender) {
		this.firstName= firstName;
		this.lastName= lastName;
		this.dni= dni;
		this.gender= gender;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getDni() {
		return dni;
	}

	public char getGender() {
		return gender;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	
	
}
