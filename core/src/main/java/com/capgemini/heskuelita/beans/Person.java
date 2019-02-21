
package com.capgemini.heskuelita.beans;


public abstract class Person extends Component {

	private String name;
	
	private String lastName;
	
	private String email;
	
	private int dni;
	
	
	public Person () {
		
		super ();
	}

	public Person (Long id, String name, String lastName,
                   String email, int dni) {
		
		super (id);
		
		this.name     = name;
		this.lastName = lastName;
		this.email = email;
		this.dni   = dni;
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

	public String getEmail () {

	    return email;
	}

	public void setEmail (String email) {

	    this.email = email;
	}

	public int getDni () {

		return dni;
	}

	public void setDni (int dni) {

		this.dni = dni;
	}
}