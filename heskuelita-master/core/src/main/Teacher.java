package com.capgemini.heskuelita.beens;

import java.util.Date;

public class Teacher extends Person {
	
	private int Id_teacher;
	
 //Constructor
public Teacher (String name, String last_name, int id, Date time, char gender, int phone, int id_teacher) {
		
		super(name,last_name,id,time,gender,phone);
		this.Id_teacher=id_teacher; 
	}

}
