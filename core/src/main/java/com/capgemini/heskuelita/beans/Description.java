package com.capgemini.heskuelita.beans;

public class Description extends Component {
	
	//Declaration of Schedule atributes
	private Course course;
	private String name;
	private String description;
	
	// Getters and Setters: Course
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
		
	//Getters and Setters: Name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	
	//Getters and Setters: Description
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	//Constructor without atributes
	public Description () {
		super();
	}
	// Constructor ALL Schedule atributes 
	public Description  (long id, Course course, String name, String description) {
		super(id);
		this.course = course;
		this.name = name;
		this.description = description;
	}
	
	
}
