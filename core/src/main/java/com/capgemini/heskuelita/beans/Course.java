package com.capgemini.heskuelita.beans;

import java.util.List;

public class Course extends Component{

	//Declaretion of Course atributes
	private String name;
	private String description;
	private int duration;
	private int limitPerson;
	
	private boolean active = true; 		//currently existing
	private List<Professor> professor;	//profs que dan esta case
	private List<Classroom> classroom;	//aulas disonibles para esta clase
	private List<Student> student;		//students doing this course
	private String state;				// if profesorr teaching or not-- if student coursing aproved or disaproved
	

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
	
	//Getters and Setters: Duration
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	//Getters and Setters: LimitPerson
	public int getLimitPerson() {
		return limitPerson;
	}
	public void setLimitPerson(int limitPerson) {
		this.limitPerson = limitPerson;
	}	
	
	//Getters and Setters: Active
	public boolean getActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}	
	
	//Getters and Setters: Professors
	public List<Professor> getProfessor() {
		return professor;
	}
	public void setProfessors(List<Professor> professor) {
		this.professor = professor;
	}	
	
	//Getters and Setters: Classrooms
	public List<Classroom> getClassroom() {
		return classroom;
	}
	public void setClassroom(List<Classroom> classroom) {
		this.classroom = classroom;
	}	
	
	//Getters and Setters: Classrooms
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}	
	
	// Constructor state
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
		
	//Constructor without atributes
	public Course () {
		super();
	}
	
	// Constructor ALL Course atributes 
	public Course(long id, String name, String description, int duration, int limitPerson) {
		super(id);
		this.name = name;
		this.description = description;
		this.duration = duration;
		this.limitPerson = limitPerson;
	}
	
	
}
