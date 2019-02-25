package com.capgemini.heskuelita.beans;

import java.util.*;

public class Student extends Person {
	
	//Declaration of Student atributes
	private boolean active = true ;		//is cursing smth
	private Course[] course;			
	private String CourseState;  		//Cursing Aproved Disaproved

	
	// Constructor active
	public boolean GetactiveId() {
		return active;
	}
	public void SetId(boolean active) {
		this.active = active;
	}
	
	// Constructor Course
	public Course[] GetCourse() {
		return course;
	}
	public void SetCourse(Course[] course) {
		this.course = course;
	}
	
	// Constructor CourseState
	public String GetCourseState() {
		return CourseState;
	}
	public void SetCourseState(String CourseState) {
		this.CourseState = CourseState;
	}
	
	// Constructor without atributes
	public Student () {
		super();
	}
	
	
	// Constructor ALL Student atributes 
	public Student(long id, String name, String lastName, Date birthdate, String documentType, 
			int identification, int phone, char sex, String city, String adress, int zipcode) {
		super (id, name, lastName, birthdate, documentType, identification, phone, sex, city, adress, zipcode);
			
	}

}
