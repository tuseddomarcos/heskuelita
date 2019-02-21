package com.capgemini.heskuelita.beans;
import java.util.*;

public class Student extends Person {
	
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
	Student () {
		count =+ 1;
	}
	
	
	// Constructor Name
	public Student(String Name) {
		super(Name);
	}
	
	// Constructor LastName
	public Student (String LastName) {
		super(LastName);
	}
	
	// Constructor Birthdate
	public Student (Date Birthdate) {
		super(Birthdate);
	}
	
	// Constructor DocumentType
	public Student (String DocumentType) {
		this.DocumentType = DocumentType;
	}
	
	// Constructor Identification
	public Student (int Identification) {
		this.Identification = Identification;
	}
	
	// Constructor Phone
	public Student (int Phone) {
		this.Phone = Phone;
	}
	
	// Constructor Sex
	public Student (char Sex) {
		this.Sex = Sex;
	}

	// Constructor City
	public Student (String City) {
		this.City = City;
	}

	// Constructor Adress
	public Student (String Adress) {
		this.Adress = Adress;
	}

	// Constructor Zipcode
	public Student (int Zipcode) {
		super (Zipcode);
	}
	
	
	// Constructor ALL Student atributes 
	public Student(String Name, String LastName, Date Birthdate, String DocumentType, int Identification, int Phone, char Sex, String City, String Adress, int Zipcode, int Id) {
			super (Name, LastName, Birthdate, DocumentType, Identification, Phone, Sex, City, Adress, Zipcode);
			this.Id = Id;
			Student.count =+ 1;
	}

}
