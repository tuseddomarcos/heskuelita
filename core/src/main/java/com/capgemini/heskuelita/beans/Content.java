package com.capgemini.heskuelita.beans;

public class Content extends IDGenerator{

	private String content;
	private String courseName;
	private int courseId;

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	@Override
	public String toString() {
		return courseName +" - "+ content ;
	}
	
}