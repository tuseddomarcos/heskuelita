package com.capgemini.heskuelita.beans;

import java.time.LocalDate;
import java.time.LocalTime;

public class AcademicOffer {
	
	private Course course;
	private Teacher teacher;
	private Classroom classroom;
	private LocalDate date;
	private LocalTime time;
	
	public AcademicOffer(Course course, Teacher teacher, Classroom classroom,  LocalDate date, LocalTime time) {
		this.course = course;
		this.teacher = teacher;
		this.classroom = classroom;
		this.date = date;
		this.time = time;
	}
	
	public AcademicOffer(){
		
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

}
