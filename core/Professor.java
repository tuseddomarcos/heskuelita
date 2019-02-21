package com.capgemini.heskuelita.beans;
import java.util.*;

public class Professor extends Person{
	
	//Declaration of new atributes
	private int Id;
	
	// Constructor id
	public int GetId() {
		return Id;
	}
	public void SetId(int Id) {
		this.Id = Id;
	}
	
	//Constructor sin atributos
	Professor () {}
	
	// Constructor ALL Professor atributes 
	public Professor (String Name, String LastName, Date Birthdate, String DocumentType, int Identification, int Phone, char Sex, String City, String Adress, int Zipcode, int Id) {
			super (Name, LastName, Birthdate, DocumentType, Identification, Phone, Sex, City, Adress, Zipcode);
			this.Id = Id;
	}
	
}
