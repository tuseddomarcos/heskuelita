package com.jessicacapge;

public class student2 {

	private String name;
	private String lastName;
	private String sexo;
	private int age;
	private String dni;
	private String adress;
	private String email;
	
	
public student2() {
	super();
}


public student2(String name, String lastName,String sexo, int age, String dni, String adress, String email) {
	super();
	
	this.name=name;
	this.lastName=lastName;
	this.sexo=sexo;
	this.age=age;
	this.dni=dni;
	this.adress=adress;
	this.email=email;
	
}






public String getName() {
	return this.name;
}

public void setName(String val){
	name=val;
}
public String getLastName() {
	return this.lastName;
}
public void setlastName(String val) {
	lastName=val;
}
public String getSexo() {
	return this.sexo;
}
public void setSexo(String val) {
	sexo=val;
}
public int getAge() {
	return this.age;
}
public void setAge(short val) {
	age=val;
}
public String getDni() {
	return this.dni;
}
public void setDni(String val) {
	dni=val;
}
public String getAdress() {
	return this.adress;
}
public void setAdress(String val) {
	adress=val;
}
public String getEmail() {
	return this.email;
}
public void setEmail(String val) {
	email=val;
}
}