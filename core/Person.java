package com.capgemini.heskuelita.beans;
import java.util.*;

public class Person {

	//Declaretion of Person atributes
	private String Name; 
	private String LastName;
	private Date Birthdate;
	private String DocumentType;
	private int Identification;
	private int Phone;
	private char Sex;
	private String City;
	private String Adress;
	private int Zipcode;
	
	//Cnstructor sin atributos
	Person () {}
	
	// Constructor Name
	public String GetName() {
		return Name;
	}
	public void SetName(String Name) {
		this.Name = Name;
	}
	
	// Constructor LastName
	public String GetLastName() {
		return LastName;
	}
	public void SetLastName(String LastName) {
		this.LastName = LastName;
	}
	
	// Constructor Birthdate
	public Date GetBirthdate() {
		return Birthdate;
	}
	public void SetBirthdate (Date Birthdate) {
		this.Birthdate = Birthdate;
	}
	
	// Constructor DocumentType
	public String GetDocumentType() {
		return DocumentType;
	}
	public void SetDocumentType(String DocumentType) {
		this.DocumentType = DocumentType;
	}
	
	// Constructor Identification
	public int GetIdentification() {
		return Identification;
	}
	public void SetIdentification (int Identification) {
		this.Identification = Identification;
	}
	
	// Constructor Phone
	public int GetPhone() {
		return Phone;
	}
	public void SetPhone (int Phone) {
		this.Phone = Phone;
	}
	
	// Constructor Sex
	public char GetSex() {
		return Sex;
	}
	public void SetSex (char Sex) {
		this.Sex = Sex;
	}

	// Constructor City
	public String GetCity() {
		return City;
	}
	public void SetCity (String City) {
		this.City = City;
	}

	// Constructor Adress
	public String GetAdress() {
		return Adress;
	}
	public void SetAdress (String Adress) {
		this.Adress = Adress;
	}

	// Constructor Zipcode
	public int GetZipcode() {
		return Zipcode;
	}
	public void SetZipcode (int Zipcode) {
		this.Zipcode = Zipcode;
	}
	
	// Constructor ALL Person atributes 
	public Person(String Name, String LastName, Date Birthdate, String DocumentType, int Identification, int Phone, char Sex, String City, String Adress, int Zipcode) {
			this.Name = Name;
			this.LastName = LastName;
			this.Birthdate = Birthdate;
			this.DocumentType = DocumentType;
			this.Identification = Identification;
			this.Phone = Phone;
			this.Sex = Sex;
			this.City = City;
			this.Adress = Adress;
			this.Zipcode = Zipcode;
	}
	
}
