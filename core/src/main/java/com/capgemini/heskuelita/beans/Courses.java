package com.capgemini.heskuelita.beans;

public class Courses {
	
	private String Name;
	private String ID_Course;
    private String Descrption ;
    
    
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getID_Course() {
		return ID_Course;
	}
	public void setID_Course(String iD_Course) {
		ID_Course = iD_Course;
	}
	public String getDescrption() {
		return Descrption;
	}
	public void setDescrption(String descrption) {
		Descrption = descrption;
	}

	
	public Courses (String Name, String ID_Course, String Descrption) {
		this.Name=Name;
		this.ID_Course=ID_Course;
		this.Descrption=Descrption;
		
	}
	
	
	
}

