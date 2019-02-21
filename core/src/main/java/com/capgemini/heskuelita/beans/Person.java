package com.capgemini.heskuelita.beans;
//import org.joda.time.LocalDate;

public class Person {

	private String firstName;
	private String lastName;
	private int dni;
	private int phone;
	private String email;
	private String password;
	private char gender;
    private String securityQuestion;
	private String securityAnswer;

	//si es que usamos joda time con maven
	//private LocalDate birthdate; 
	
	
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

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}
	
	
	
	
	
}
