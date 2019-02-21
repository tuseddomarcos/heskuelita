package com.capgemini.heskuelita.beans;

//import com.capgemini.heskuelita.beans.Person.Student;

public class Student extends Person {

	private String nameStudent;
	private String lastNameStudent;
	private String courseStudent;
	private int telephone;
	private String dni;
	
	
public Student(String nameStudent, String lastNameStudent, String courseStudent, int telephone, String dni) {
	super();
	
	this.nameStudent=nameStudent;
	this.lastNameStudent=lastNameStudent;
	this.courseStudent=courseStudent;
	this.telephone=telephone;
	this.dni=dni;
	
}	
	
public String getNameStudent() {
	return nameStudent;
}	
public void setNameStudent(String val) {
	nameStudent=val;
}
public String getlastNameStudent() {
	return lastNameStudent;
}	
public void setlastNameStudent(String val) {
	lastNameStudent=val;
}
public String getCourseStudent() {
	return courseStudent;
}
public void setCourseStudent(String val) {
	courseStudent=val;
}
public int getTelephone() {
	return telephone;
}
public void setTelephone(int val) {
	telephone=val;
}
public String getDni() {
	return dni;
}
}
