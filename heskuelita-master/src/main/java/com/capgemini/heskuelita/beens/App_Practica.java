package com.capgemini.heskuelita.beens;
import java.util.*;
import java.util.stream.Collectors;

public class App_Practica {

	
	public static Scanner in = new Scanner(System.in);

	public static void main(String [] arg) {
		System.out.println("Ingrese el nombre a buscar \n");
		String name = in.next();
		buscar(name);
	}
	
	public static void newStudent() {
		
		System.out.println("ingrese nombre del alumno\n");
		 String name = in.nextLine();
		System.out.println("ingrese Apellido del alumno\n");
		 String last_name = in.next();
			System.out.println("ingrese el id del alumno\n");
		 int id= in.nextInt();
		 System.out.println("ingrese la fecha de nacimiento del alumno\n");
		 int time = in.nextInt();
		 System.out.println("ingrese el genero del alumno\n");
		 char gender = in.next().charAt(0);
		 System.out.println("ingrese el numero de telefono del alumno\n");
		 int phone = in.nextInt();
		 System.out.println("ingrese el id del estudiante alumno\n");
		 int id_student = in.nextInt();
		 in.close();
		  Student New_student = new Student(name,last_name,id,time,gender,phone,id_student);
		ClasBD.New_student(New_student);
	}
	
	public static void buscar(String nombre) {
		
		ClasBD.getStudents().stream().filter(e ->e.getName().equals(nombre)).collect(Collectors.toList());
		ClasBD.getStudents().stream().forEach(System.out::println);
		
		}
	public static void eliminar(int id) {
		
		ClasBD.getStudents().stream().filter(e -> e.getId_student()== id);
	}
}
