package com.capgemini.heskuelita.beans;

public abstract class Person extends IDComponent {

	
	protected String name;
	protected String lastName;

	
	
public Person() { super (); }	



public Person(Long pID, String pName, String plastName) {

	super(pID);
	this.name=pName;
	this.lastName=plastName;
	
}



public String getName() {
	return name;
}



public void setName(String pName) throws Exception {
		
	
        if (pName.trim().length() == 0 || pName.trim().length() >= 50)
        {
              throw new Exception("El nombre debe contener entre 1 y 50 caracteres.");
        }

        this.name = pName.trim();    	
	
}



public String getLastName() {
	return lastName;
}



public void setlastName(String plastName) throws Exception {
	
	
    if (plastName.trim().length() == 0 || plastName.trim().length() >= 50)
    {
          throw new Exception("El apellido debe contener entre 1 y 50 caracteres.");
    }

    this.lastName = plastName.trim();    	

}


}