package com.capgemini.heskuelita.beans;

public class CourseObjetives extends IDComponent {
	
	private String name;
	private String objetives;
	private Course course;

	public CourseObjetives() {super();}
	
	public CourseObjetives(Long pID, String pName, String pObjetives, Course pCourse) {
		
		super(pID);
		this.name=pName;
		this.objetives=pObjetives;
		this.course=pCourse;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getObjetives() {
		return objetives;
	}


	public void setObjetives(String objetives) {
		this.objetives = objetives;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	
	
}
