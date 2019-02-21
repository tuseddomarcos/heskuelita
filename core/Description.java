package com.capgemini.heskuelita.beans;

public class Description {

	//Declaretion of Description atributes
	private int Id;
	private int IdCourse;
	private String Name;
	private String Description;
	
	//Constructor sin atributos
	Description () {}
	
	// Constructor id
	public int GetId() {
		return Id;
	}
	public void SetId(int Id) {
		this.Id = Id;
	}
	
	// Constructor idCourse
	public int GetIdCourse() {
		return IdCourse;
	}
	public void SetIdCourse(int IdCourse) {
		this.IdCourse = IdCourse;
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
	
	// Constructor ALL Description atributes 
	public Description  (int Id, int IdCourse, String Name, String Description) {
		this.Id = Id;
		this.IdCourse = IdCourse;
		this.Name = Name;
		this.Description = Description;
	}
	
	
}
