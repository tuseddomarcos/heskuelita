package com.capgemini.heskuelita.beans;

import java.util.*;

public class Student extends Person {

	
	public Student(String Name, String LastName,String BirthDay, char Sex, String NumId, String Phone, String ID_Student) {
		super(Name, LastName, BirthDay, Sex, NumId);
		this.Phone=Phone;
		this.ID_Student=ID_Student;
	
	}

	private String Phone;
	private String ID_Student;
	

	public String getID_Student() {
		return ID_Student;
	}

	public void setID_Student(String iD_Student) {
		ID_Student = iD_Student;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public static Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	

}

