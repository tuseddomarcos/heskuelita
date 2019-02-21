package com.capgemini.heskuelita.beans;

public class Person {
	private String name, last_name, documentation_type, screet;
	private int id,Identitication,phone,number, zip_code;
	private char sex;
	public Person() {
		
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScreet() {
		return screet;
	}
	public void setScreet(String screet) {
		this.screet = screet;
	}
	public String getDocumentation_type() {
		return documentation_type;
	}
	public void setDocumentation_type(String documentation_type) {
		this.documentation_type = documentation_type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getZip_code() {
		return zip_code;
	}
	public void setZip_code(int zip_code) {
		this.zip_code = zip_code;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getIdentitication() {
		return Identitication;
	}
	public void setIdentitication(int identitication) {
		Identitication = identitication;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}

	
}
