package com.capgemini.heskuelita.beans;

public class Claaasroom_per_course {
	private int id;
	private Classroom classroom;
	private Course course;


	public Claaasroom_per_course(int id, Classroom classroom, Course course) {
		this.setId(id);
		this.setClassroom(classroom);
		this.setCourse(course);
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Classroom getClassroom() {
		return classroom;
	}


	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}
}
