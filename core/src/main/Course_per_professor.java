package com.capgemini.heskuelita.beans;

public class Course_per_professor {
	private int id;
	private Course course;
	private Professor professor;
	
	public Course_per_professor(int id, Course course, Professor professor) {
		this.setId(id);
		this.setCourse(course);
		this.setProfessor(professor);
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
