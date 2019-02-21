package com.capgemini.heskuelita.beans;

import java.util.Date;

public class Person {
	
	private int idPerson;
	private String name;
	private String lastName;
	private Date birthdate;
	private String documentType;
	private int identification;
	private int phone;
	private char gender;
	private String email;
	private String password;
	private String securityQuest;
	private String answer;
	
	public int getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}
	public Person(int idPerson, String name, String lastName, Date birthdate, String documentType, int phone, char gender, String email, String password, String securityQuest, String answer) {
		this.name = name;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.documentType = documentType;
		this.phone = phone;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.securityQuest = securityQuest;
		this.answer = answer;
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
	public Date getBirthday() {
		return birthdate;
	}
	public void setBirthday(Date birthday) {
		this.birthdate = birthday;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public int getIdentification() {
		return identification;
	}
	public void setIdentification(int identification) {
		this.identification = identification;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
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
	public String getSecurityQuest() {
		return securityQuest;
	}
	public void setSecurityQuest(String securityQuest) {
		this.securityQuest = securityQuest;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}
