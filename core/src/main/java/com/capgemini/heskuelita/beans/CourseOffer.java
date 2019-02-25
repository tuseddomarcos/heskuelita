package com.capgemini.heskuelita.beans;

import java.time.*;

public class CourseOffer extends IDComponent {
	
	
	private Course course;
	
	private LocalTime time;
	
	private LocalDate date;
	
	private Professor professor;
	
	private ClassRoom classroom;
	
	
	public CourseOffer () {super();}
	
	public CourseOffer(Course pCourse, Professor pProfessor, ClassRoom pClassRoom, LocalTime pTime, LocalDate pDate) {
		
		super();
		this.course=pCourse;
		this.time=pTime;
		this.date=pDate;
		this.professor=pProfessor;
		this.classroom=pClassRoom;
		
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public ClassRoom getClassroom() {
		return classroom;
	}

	public void setClassroom(ClassRoom classroom) {
		this.classroom = classroom;
	}
	
	
	

}
