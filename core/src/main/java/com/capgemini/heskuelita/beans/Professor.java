package com.capgemini.heskuelita.beans;
import java.time.LocalDate;
import java.util.*;

public class Professor extends Person{
	
	//Declaration of Professor atributes
	private boolean active = true ;		//is teaching smth
	private List<Course> course;
	
	// Constructor active
	public boolean GetactiveId() {
		return active;
	}
	public void SetId(boolean active) {
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
	public Professor () {
		super();
	}
	
	
	// Constructor ALL Student atributes 
	public Professor (long id, String name, String lastName, LocalDate birthdate, String documentType, 
			int identification, int phone, char sex, String city, String adress, int zipcode) {
		super (id, name, lastName, birthdate, documentType, identification, phone, sex, city, adress, zipcode);
			
	}
	
}
