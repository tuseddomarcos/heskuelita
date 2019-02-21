package com.capgemini.heskuelita.beans;
import java.util.*;

public class Classroom {

	//Declaretion of Classroom atributes
	private int Id;
	private int Classroom;
	private short Floor;
	
	
	//Cnstructor sin atributos
	Classroom () {}
	
	// Constructor id
	public int GetId() {
		return Id;
	}
	public void SetId(int Id) {
		this.Id = Id;
	}
	
	// Constructor Classroom
	public int GetClassroom() {
		return Classroom;
	}
	public void SetClassroom(int Classroom) {
		this.Classroom = Classroom;
	}
	
	// Constructor Floor
	public short GetFloor() {
		return Floor;
	}
	public void SetFloor(short Floor) {
		this.Floor = Floor;
	}

	// Constructor ALL Professor atributes 
	public Classroom (int Id, int Classroom, short Floor) {
		this.Id = Id;
		this.Classroom = Classroom;
		this.Floor = Floor;
	}
	
}
