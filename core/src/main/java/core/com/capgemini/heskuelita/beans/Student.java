package core.com.capgemini.heskuelita.beans;

public class Student extends Person{
	private int Legajo;
	private static int cont;
	
	public Student(String Name, String LastName, int dni){
		super(Name, LastName , dni);
		cont++;
	}
	
	public Student(String Name, String LastName,int dni, int Legajo) {
		super(Name, LastName , dni);
		this.Legajo = Legajo;
	}
	
	
	public void mostrarCont() {
		System.out.println("Hay " + cont + " objetos creados");
	}
	public int getLegajo() {
		return Legajo;
	}

	public void setLegajo(int legajo) {
		Legajo = legajo;
	}

	public static void main(String[] args) {
		Student s = new Student ("Pepe" , "Argento", 44 , 19303456);
		System.out.println(s.toString());
		System.out.println("Edad: " + s.getDni());
		System.out.println("Legajo: " + s.Legajo);
	}
}
