package com.capgemini.heskuelita.beans;

public class Course extends Component{

	//Declaretion of Course atributes
	private String name;
	private String description;
	private int duration;
	private int limitPerson;
	
	private boolean active = true; 	//currently existing
	private Professor[] professor;	//profs que dan esta case
	private Classroom[] classroom;	//aulas disonibles para esta clase
	

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
	public Professor[] getProfessor() {
		return professor;
	}
	public void setProfessors(Professor[] professor) {
		this.professor = professor;
	}	
	
	//Getters and Setters: Classrooms
	public Classroom[] getClassroom() {
		return classroom;
	}
	public void setClassrooms(Classroom[] classroom) {
		this.classroom = classroom;
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
