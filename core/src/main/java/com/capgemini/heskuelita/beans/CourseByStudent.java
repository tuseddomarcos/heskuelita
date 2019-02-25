package com.capgemini.heskuelita.beans;

public class CourseByStudent extends IDComponent {

	
	private Student student;
	private Course course;
	
	public CourseByStudent () {
		super ();
	}
	
	public CourseByStudent (Long pID, Student pStudent, Course pCourse) {
		
		super(pID);
		this.student=pStudent;
		this.course =pCourse;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	
	
}
