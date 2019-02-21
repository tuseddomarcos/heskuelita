package com.capgemini.heskuelita.beans;

public class Person {
	private int id;
	private String name;
	private String lastName;
	private char sexo;
	private short age;
	private String dni;
	
public Person (String dni) {
	this.dni=dni;
}
	
public Person(String name, String lastName,String dni) {
	this.name=name;
	this.lastName=lastName;
	this.dni=dni;
}

public Person(String name, String lastName, String dni, short age,int id, char sexo) {
	this.name=name;
	this.lastName=lastName;
	this.dni=dni;
	this.age=age;
	this.id=id;
	this.sexo=sexo;
}
public Person() {
	this.name="";
	this.lastName="";
	this.dni="";
	this.age=0;
	this.sexo=0;
	
}



public String getName() {
	return name;
}

public void setName(String val){
	name=val;
}
public String getLastName() {
	return lastName;
}
public void setlastName(String val) {
	lastName=val;
}
public char getSexo() {
	return sexo;
}
public void setSexo(char val) {
	sexo=val;
}
public short getAge() {
	return age;
}
public void setAge(short val) {
	age=val;
}
public int getId() {
	return id;
}
public void setId(int val) {
	id=val;
}
public String getDni() {
	return dni;
}
public void setDni(String val) {
	dni=val;
}
}

	
	

