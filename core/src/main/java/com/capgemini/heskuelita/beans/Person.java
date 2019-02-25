package com.capgemini.heskuelita.beans;

public abstract class Person extends IDComponent {

	
	protected String name;
	protected String lastName;

	
	
public Person() { super (); }	



public Person(Long pID, String pName, String plastName) {

	super(pID);
	this.name=pName;
	this.lastName=plastName;
	
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