package com.capgemini.heskuelita.beans;

public class Person {

	protected int ID;
	protected String name;
	protected String lastName;

	
	
public Person() { ;}	



public Person(int pID, String pName, String plastName) {

	this.ID=pID;
	this.name=pName;
	this.lastName=plastName;
	
}



public int getID() {
	return ID;
}



public void setID(int iD) {
	ID = iD;
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



}