package core.com.capgemini.heskuelita.beans;

public class Person {
	private String Name;
	private String LastName;
	private int Dni;
	
	public Person(String Name, String LastName , int dni) {
		this.Name = Name;
		this.LastName = LastName;
		this.Dni = dni;
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
	
}
