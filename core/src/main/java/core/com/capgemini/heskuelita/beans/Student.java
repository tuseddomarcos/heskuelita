package core.com.capgemini.heskuelita.beans;

public class Student extends Person{
	private int Legajo;
		
	public Student(String Name, String LastName,String email ,int dni, int Legajo) {
		super(Name,LastName,email,dni);
		this.Legajo = Legajo;
	}

	public int getLegajo() {
		return Legajo;
	}

	public void setLegajo(int legajo) {
		Legajo = legajo;
	}
}
