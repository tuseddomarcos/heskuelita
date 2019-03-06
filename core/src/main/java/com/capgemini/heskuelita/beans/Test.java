package com.capgemini.heskuelita.beans;

import com.capgemini.heskuelita.beans.*;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;


public class Test {

	public static void AskingData() {
		  
		List<Student> student = new ArrayList<Student>();
		
		//Asking for data
		System.out.println ("Igrese su nombre:");
		Scanner in = new Scanner (System.in);
		System.out.println ("Su nombre es: " + in.next());
	}
	
	
	//Asigning data 
	private static final List<Student> studentDB;
	static {
 			studentDB = Arrays.asList(
			new Student(1,"Lucia","Gomez", LocalDate.of(1999, 07, 23), "DNI", 34567890, 46952156, 'F', "Capital Federal", "Corrientes 2345", 1235),
			new Student(2,"Carlos","Martinez", LocalDate.of(2000, 02, 15), "DNI", 41659822, 48926565, 'M', "Capital Federal", "Uruguay 645", 1235),
			new Student(3,"Tomas","Ramirez", LocalDate.of(1985, 11, 24), "DNI", 45698512, 46985123, 'M', "Capital Federal", "Forida 2364", 1235),
			new Student(4,"Enrique","Perez", LocalDate.of(1999, 06, 20), "DNI", 2645913, 15569842, 'M', "Capital Federal", "Pueyrredon 1535", 1235),
			new Student(5,"Soledad","Blanco", LocalDate.of(1995, 05, 01), "DNI", 12564893, 46542365, 'F', "Capital Federal", "Paseo Colon 546", 1235),
			new Student(6,"Francisco","Diaz", LocalDate.of(1960, 07, 17), "DNI", 15946259, 159842356, 'M', "Capital Federal", "Corrientes 1256", 1235)
 			);
	}
	

	
	public static void main(String[] args) {
		
		// Name FIlter, names containing "l"
		List<String> nameFilter = studentDB.stream ()
		                .filter (p -> p.getName().contains("l"))
		                .map (Student::getName)
		                .collect (toList ());
		System.out.println ("Names with L : " + nameFilter );
		nameFilter.forEach (System.out::println);
		
		
		// Last Name filter, ending in "ez"
		List<String> LastNameEnding = studentDB.stream ()
		                .filter (p -> p.getLastName().endsWith("ez"))
		                .map (Student::getLastName)
		                .collect (toList ());
		System.out.println ("Last names ending in \"ez\" : " + LastNameEnding );
		LastNameEnding.forEach (System.out::println);
		
		
// CORREGIR ERROR EN LA DEVOLUCION 
		// Identification filter, search a specific identification number
		Student SearchIdentification = studentDB.stream ()
		                .filter (p -> p.getIdentification() == 45698512 ).findAny().get();
		System.out.println ("Identification belongs to: " + SearchIdentification );
		//SearchIdentification.forEach(System.out::println);
		
	
		
		
	}
	



}







