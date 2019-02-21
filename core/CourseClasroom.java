package com.capgemini.heskuelita.beans;
import java.util.*;

public class CourseClassroom {
	
	//Declaretion of Description atributes
	private int Id;
	private int IdCourse;
	private int IdClassroom;

	
	//Constructor sin atributos
	CourseClassroom () {}
	
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
	
	// Constructor IdClassroom
	public int GetIdClassroom() {
		return IdClassroom;
	}
	public void SetIdClassroom(int IdClassroom) {
		this.IdClassroom = IdClassroom;
	}
	
	// Constructor ALL CourseClassroom atributes 
	public CourseClassroom  (int Id, int IdCourse, int IdClassroom) {
		this.Id = Id;
		this.IdCourse = IdCourse;
		this.IdClassroom = IdClassroom;
	}
	
}
