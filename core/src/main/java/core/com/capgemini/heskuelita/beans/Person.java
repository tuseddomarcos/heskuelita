package core.com.capgemini.heskuelita.beans;

public class Person {
	private int ID;
	private String Name;
	private String LastName;
	private int Dni;
	private String email;
	private int cont=0;
	
	public Person(String Name, String LastName ,String email,int dni) {
		this.ID = cont;
		this.Name = Name;
		this.LastName = LastName;
		this.setEmail(email);
		this.Dni = dni;
		cont++;
	}

	public int getDni() {
		return Dni;
	}

	public void setDni(int dni) {
		Dni = dni;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	@Override
	public String toString() {
		return Name + " " + LastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean equals(Student S) {
		if((S.getDni() == Dni)) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
