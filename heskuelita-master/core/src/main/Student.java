package com.capgemini.heskuelita.beens;
import java.util.*;

public class Student extends Person{
	
	private int Id_student;
	
	
	//Constructor
	
public Student (String name, String last_name, int id, Date time,char gender, int phone, int id_student) {
		
		super(name,last_name,id,time,gender,phone);
		this.Id_student=id_student;
	}
	
	
	

}
