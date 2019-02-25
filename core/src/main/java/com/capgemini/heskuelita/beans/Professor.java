package com.capgemini.heskuelita.beans;
import java.util.*;

public class Professor extends Person{
	
	//Declaration of Professor atributes
	private boolean active = true ;		//is teaching smth
	private Course[] course;
	private String CourseState;  		//teaching not teaching
	
	// Constructor active
	public boolean GetactiveId() {
		return active;
	}
	public void SetId(boolean active) {
		this.active = active;
	}
	
	// Constructor CourseState
	public String GetCourseState() {
		return CourseState;
	}
	public void SetId(String CourseState) {
		this.CourseState = CourseState;
	}
	
	// Constructor Course
	public Course[] GetCourse() {
		return course;
	}
	public void SetCourse(Course[] course) {
		this.course = course;
	}
	
	// Constructor without atributes
	public Professor () {
		super();
	}
	
	
	// Constructor ALL Student atributes 
	public Professor (long id, String name, String lastName, Date birthdate, String documentType, 
			int identification, int phone, char sex, String city, String adress, int zipcode) {
		super (id, name, lastName, birthdate, documentType, identification, phone, sex, city, adress, zipcode);
			
	}
	
}
