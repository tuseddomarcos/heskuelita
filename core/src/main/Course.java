package com.capgemini.heskuelita.beans;

public class Course {
	private int idCourse;
	private String nameCourse;
	private String description;
	private short duration;
	private short limitPerson;
	
	
	public Course(int idCourse, String nameCourse, String description, short duration, short limitPerson ) {
		this.idCourse = idCourse;
		this.nameCourse = nameCourse;
		this.description = description;
		this.duration = duration;
		this.limitPerson = limitPerson;
	}
	
	public Course() {
		
	}
	
	public int getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(int idCourse) {
		this.idCourse = idCourse;
	}

	public String getNameCourse() {
		return nameCourse;
	}

	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public short getDuration() {
		return duration;
	}

	public void setDuration(short duration) {
		this.duration = duration;
	}

	public short getLimitPerson() {
		return limitPerson;
	}

	public void setLimitPerson(short limitPerson) {
		this.limitPerson = limitPerson;
	}
	
	

}
