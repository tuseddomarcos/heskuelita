package com.capgemini.heskuelita.beans;
import java.time.LocalDate;

public class Person extends Component{

	//Declaration of Person atributes
	private String name; 
	private String lastName;
	private LocalDate birthdate;
	private String documentType;
	private int identification;
	private int phone;
	private char sex;
	private String city;
	private String adress;
	private int zipcode;
	
	// Getters and Setters: Name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Getters and Setters: LastName
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// Getters and Setters: Birthdate
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate (LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	
	// Getters and Setters: DocumentType
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	
	// Getters and Setters: Identification
	public int getIdentification() {
		return identification;
	}
	public void setIdentification (int identification) {
		this.identification = identification;
	}
	
	// Getters and Setters: Phone
	public int getPhone() {
		return phone;
	}
	public void setPhone (int phone) {
		this.phone = phone;
	}
	
	// Getters and Setters: Sex
	public char getSex() {
		return sex;
	}
	public void setSex (char sex) {
		this.sex = sex;
	}

	// Getters and Setters: City
	public String getCity() {
		return city;
	}
	public void setCity (String city) {
		this.city = city;
	}

	// Getters and Setters: Adress
	public String getAdress() {
		return adress;
	}
	public void setAdress (String adress) {
		this.adress = adress;
	}

	// Getters and Setters: Zipcode
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode (int zipcode) {
		this.zipcode = zipcode;
	}
	
	//Constructor without atributes
	public Person () {
		super ();
	}
	
	// Constructor ALL Person atributes 
	public Person(long id, String name, String lastName, LocalDate birthdate, String documentType, 
			int identification, int phone, char sex, String city, String adress, int zipcode) {
		super(id);
		this.name = name;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.documentType = documentType;
		this.identification = identification;
		this.phone = phone;
		this.sex = sex;
		this.city = city;
		this.adress = adress;
		this.zipcode = zipcode;
	}
	
}
