package com.capgemini.heskuelita.beans;

import java.util.ArrayList;
import java.util.Date;

public class Student extends Person {
	ArrayList<Course> courses = new ArrayList<Course>();
	
	public Student(int idStudent, String name, String lastName, Date birthdate, String documentType, int phone, char gender,
			String email, String password, String securityQuest, String answer) {
		super(idStudent, name, lastName, birthdate, documentType, phone, gender, email, password, securityQuest, answer);
		// TODO Auto-generated constructor stub
	}
	
	public void registerCourse(Course course) {
		courses.add(course);
	}
	
	public ArrayList<Course> getRegisteredCourse(){
		return courses;
	}
}
