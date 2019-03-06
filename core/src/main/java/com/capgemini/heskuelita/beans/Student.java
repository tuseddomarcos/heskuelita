package com.capgemini.heskuelita.beans;

import java.time.LocalDate;
import java.util.*;

public class Student extends Person {
	
	//Declaration of Student atributes
	private boolean active = true ;		//is cursing smth
	private List<Course> course;			

	
	// Constructor active
	public boolean getActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	// Constructor Course
	public List<Course> GetCourse() {
		return course;
	}
	public void SetCourse(List<Course> course) {
		this.course = course;
	}

	// Constructor without atributes
	public Student () {
		super();
	}
	
	
	// Constructor ALL Student atributes 
	public Student(long id, String name, String lastName, LocalDate birthdate, String documentType, 
			int identification, int phone, char sex, String city, String adress, int zipcode) {
		super (id, name, lastName, birthdate, documentType, identification, phone, sex, city, adress, zipcode);
			
	}

}
