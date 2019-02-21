package com.capgemini.heskuelita.beans;

public class Student extends Person{

	public static int count;
	
	public Student(String firstName, String lastName, int dni, char gender) {
		super(firstName, lastName, dni, gender);
		count++;
	}



}
