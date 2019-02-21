package com.capgemini.heskuelita.beans;

public class Course {

	//Declaretion of Classroom atributes
	private int Id;
	private String Name;
	private String Description;
	private int Duration;
	private int LimitPerson;
	
	//Cnstructor sin atributos
	Course () {}
	
	// Constructor id
	public int GetId() {
		return Id;
	}
	public void Set(int Id) {
		this.Id = Id;
	}	
	
	// Constructor Name
	public String GetName() {
		return Name;
	}
	public void SetName(String Name) {
		this.Name = Name;
	}	
	
	// Constructor Description
	public String GetDescription() {
		return Description;
	}
	public void SetDescription(String Description) {
		this.Description = Description;
	}
	
	// Constructor Duration
	public int GetDuration() {
		return Duration;
	}
	public void SetDuration(int Duration) {
		this.Duration = Duration;
	}
	
	// Constructor LimitPerson
	public int GetLimitPerson() {
		return LimitPerson;
	}
	public void SetLimitPerson(int LimitPerson) {
		this.LimitPerson = LimitPerson;
	}	
	
	
	// Constructor ALL Course atributes 
	public Course( int Id, String Name, String Description, int Duration, int LimitPerson) {
		this.Id = Id;
		this.Name = Name;
		this.Description = Description;
		this.Duration = Duration;
		this.LimitPerson = LimitPerson;
	}
	
	
}
