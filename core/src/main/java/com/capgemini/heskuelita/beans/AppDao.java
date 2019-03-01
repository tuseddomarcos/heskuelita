package com.capgemini.heskuelita.beans;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AppDao {

	public static void main(String[] args) {

		DAOStudentWithCollections dao= new DAOStudentWithCollections();
		dao.cargarDatos();
		Scanner in= new Scanner(System.in);
		
		//busca por dni
		System.out.println("Introduzca su dni ");
		Student student= dao.findByDNI(in.nextInt());
		System.out.println("Usted es: " + student.getFirstName() + " " + 
		                                             student.getLastName());
		
		//busca por apellido
		System.out.println("Introduzca su apellido");
		Student student2= dao.findyByLastName(in.next());
		System.out.println("Usted es: " + student2.getFirstName() + " " + student2.getLastName());
		
		//busca a todos los estudiantes masculinos
		List<Student> males=dao.findMales();
		System.out.println("Los estudiantes masculinos son:");
		males.forEach(m -> System.out.println(m.getFirstName() + " " + m.getLastName()));
		
	
	}

}
