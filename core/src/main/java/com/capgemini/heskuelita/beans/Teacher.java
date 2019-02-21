package com.capgemini.heskuelita.beans;

public class Teacher extends Person {
	private String nameTeacher;
	private String lastNameTeacher;
	private String courseTeacher;
	private int telephone;
	private String dni;
	
	
public Teacher(String nameTeacher, String lastNameTeacher, String courseTeacher, int telephone, String dni) {
	super();
	
	this.nameTeacher=nameTeacher;
	this.lastNameTeacher=lastNameTeacher;
	this.courseTeacher=courseTeacher;
	this.telephone=telephone;
	this.dni=dni;
	
}	
	
public String getNameTeacher() {
	return nameTeacher;
}
public void setNameTeacher(String val) {
	nameTeacher=val;
}
public String getLastNameTeacher() {
	return lastNameTeacher;
}
public void setLastNameTeacher(String val) {
	
}

}
