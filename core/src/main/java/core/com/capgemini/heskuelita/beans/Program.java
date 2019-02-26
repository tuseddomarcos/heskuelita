package core.com.capgemini.heskuelita.beans;

import java.util.Scanner;

public class Program {

	private static Scanner in=new Scanner(System.in);

	public static void main(String[] args) {
		carga(1);
		in.close();
	}
	
	public static void eliminarPorDni(int dni) {
		
	}
	public static void carga(int cantidad) {
		for(int e=0 ; e<cantidad ; e++) {
			Student student=new Student();
			System.out.println("Introduzca nombre, email, numero de documento");
			
			String nombre=in.next();
			String email=in.next();
			int dniNumber=in.nextInt();
			
			student.setName(nombre);
			student.setNumber(dniNumber);
			student.setEmail(email);
			
			Data.agragarStudent(student);
		}
	}
	
	public static Student buscar(String email) { 
		return Data.getStudents().stream().filter(e -> e.getEmail().equals(email)).findFirst().get();
	}
	
}
