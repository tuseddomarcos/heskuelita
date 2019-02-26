package com.capgemini.heskuelita.beans;

public class Student extends Person {
	 
	
    public Student () {

        super ();
    }
    
	public Student(int id, String name, String lastName,String gender,int age, String doc_type, int identification, int phone, String email)
		{
			super (id,name, lastName, gender, age,doc_type,identification, phone, email);
		
					}
	
	
	
}
