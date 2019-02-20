package com.capgemini.heskuelita.beans;

public class Course extends Room {
	private String courseName;
	private String description;
	
	public Course() {};
	
	public Course(int idRoom, int capacity, String courseName, String description) {
		super(idRoom, capacity);
		this.courseName = courseName;
		this.description = description;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public String getDescription() {
		return this.description;
	}

}