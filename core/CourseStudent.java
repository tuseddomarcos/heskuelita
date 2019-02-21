package com.capgemini.heskuelita.beans;
import java.util.*;

public class CourseStudent {
	
	//Declaretion of Description atributes
	private int Id;
	private int IdCourse;
	private int IdStudent;

	
	//Constructor sin atributos
	CourseStudent () {}
	
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
	
	// Constructor IdStudent
	public int GetIdStudent() {
		return IdStudent;
	}
	public void SetIdStudent(int IdStudent) {
		this.IdStudent = IdStudent;
	}
	
	// Constructor ALL CourseStudent atributes 
	public CourseStudent  (int Id, int IdCourse, int IdStudent) {
		this.Id = Id;
		this.IdCourse = IdCourse;
		this.IdStudent = IdStudent;
	}
}
