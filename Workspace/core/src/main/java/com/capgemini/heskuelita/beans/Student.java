package com.capgemini.heskuelita.beans;

import java.time.LocalDate;
import java.util.ArrayList;


public class Student extends Person {
	ArrayList<Course> courses = new ArrayList<Course>();
	
	public Student() {
		super();
	}
	
	public Student(long idStudent, String name, String lastName, LocalDate birthdate, String documentType,long identification ,long phone, char gender,
			String email, String password, String securityQuest, String answer) {
			super(idStudent, name, lastName, birthdate, documentType, identification,phone, gender, email, password, securityQuest, answer);
		// TODO Auto-generated constructor stub
	}
	
	public void registerCourse(Course course) {
		courses.add(course);
	}
	
	public ArrayList<Course> getRegisteredCourse(){
		return courses;
	}
	
	
	
}
