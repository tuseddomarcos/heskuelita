package core.com.capgemini.heskuelita.beans;

public class Teacher extends Person{

	public Teacher(String Name, String LastName , int dni) {
		super(Name, LastName, dni);
	}
	
	public static void main(String[] args) {
		Teacher t = new Teacher ("Edgardo" , "Sensei", 190404678);
		System.out.println(t.toString());
		System.out.println("Edad: " + t.getDni());
	}
}
