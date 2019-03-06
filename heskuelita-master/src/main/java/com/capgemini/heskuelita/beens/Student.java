package com.capgemini.heskuelita.beens;
import java.util.*;

public class Student extends Person{
	
	private int Id_student;
	
	
	//Constructor
	
public Student (String name, String last_name, int id, int time,char gender, int phone, int id_student) {
		
		super(name,last_name,id,time,gender,phone);
		this.Id_student=id_student;
	}


public int getId_student() {
	return Id_student;
}


public void setId_student(int id_student) {
	Id_student = id_student;
}


	
	

}
