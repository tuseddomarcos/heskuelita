package com.capgemini.heskuelita.beans;

public abstract class Person extends Component {

	private String name;
	private String lastName;
	private String gender;
	private int age;
	private String doc_type;
	private int identification;
	private int phone;
	private String email;
	
	public Person() {
		super ();
		
	}
	
	public Person(int id, String name, String lastName,String gender,int age, String doc_type, int identification, int phone, String email) {
		super (id);
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.doc_type = doc_type;
		this.identification = identification;
		this.phone = phone;
		this.setEmail(email);
	}
	
	public String getName () {

		return name;
	}

	public void setName (String name) {

	    this.name = name;
	}

	public String getLastName () {

	    return lastName;
	}

	public void setLastName (String lastName) {

	    this.lastName = lastName;
	}
	
	public String getgender () {

	    return gender;
	}

	public void setgender (String gender) {

	    this.gender = gender;
	}

	public int getage () {

	    return age;
	}

	public void setage (short age) {

	    this.age = age;
	}
	
	public String getdoc_type () {

	    return doc_type;
	}

	public void setdoc_type (String doc_type) {

	    this.doc_type = doc_type;
	}
	
	public int getidentification () {

	    return identification;
	}

	public void setidentification (int identification) {

	    this.identification= identification;
	}
	
	public int getphone () {

	    return phone;
	}

	public void setphone (int phone) {

	    this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
