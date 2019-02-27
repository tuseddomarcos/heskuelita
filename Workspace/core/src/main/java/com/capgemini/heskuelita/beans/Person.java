package com.capgemini.heskuelita.beans;

import java.time.LocalDate;


public class Person extends Component {
	
	private String name;
	private String lastName;
	private LocalDate birthdate;
	private String documentType;
	private long identification;
	private long phone;
	private char gender;
	private String email;
	private String password;
	private String securityQuest;
	private String answer;
	
	public Person() {
		super();
	}
	
	public Person(long idPerson, String name, String lastName, LocalDate birthdate, String documentType,long identification ,long phone, char gender, String email, String password, String securityQuest, String answer) {
		super(idPerson);
		this.name = name;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.documentType = documentType;
		this.identification = identification;
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
	public LocalDate getBirthday() {
		return birthdate;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthdate = birthday;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public long getIdentification() {
		return identification;
	}
	public void setIdentification(int identification) {
		this.identification = identification;
	}
	public long getPhone() {
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
