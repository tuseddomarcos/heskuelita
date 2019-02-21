package com.capgemini.heskuelita.beans;
import java.util.*;

public class CourseProfessor {
	
	//Declaretion of Description atributes
	private int Id;
	private int IdCourse;
	private int IdProfessor;

	
	//Constructor sin atributos
	CourseProfessor () {}
	
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
	
	// Constructor IdProfessor
	public int GetIdProfessor() {
		return IdProfessor;
	}
	public void SetIdProfessor(int IdProfessor) {
		this.IdProfessor = IdProfessor;
	}
	
	// Constructor ALL CourseProfessor atributes 
	public CourseProfessor  (int Id, int IdCourse, int IdProfessor) {
		this.Id = Id;
		this.IdCourse = IdCourse;
		this.IdProfessor = IdProfessor;
	}
	
}
