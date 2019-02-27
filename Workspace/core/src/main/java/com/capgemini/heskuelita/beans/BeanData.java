package com.capgemini.heskuelita.beans;

import java.util.List;
import java.util.Arrays;
import java.time.LocalDate;


public class BeanData {
	
	private static final List <Student> students;
	
	static {
		students = Arrays.asList (
				new Student(1, "Lucas", "Perez", LocalDate.of(2000, 1, 1), "dni", 38752964, 228447927, 'm', "lucas.perez@gmail.com", "12345","What was the name of your first pet?", "Firulais"),
				new Student(2, "Josefina", "Baez", LocalDate.of(1991, 3, 6), "dni", 33752860, 2494222, 'f', "josefina22@gmail.com", "12345","What was the name of your first pet?", "Pope"),
				new Student(3, "Marco", "Ruiz", LocalDate.of(1993, 25, 5), "dni", 33456789, 11569872, 'm', "marquito27@gmail.com", "12345","What was the name of your first pet?", "Homer"),
				new Student(4, "Eugenia", "Bota", LocalDate.of(1998, 10, 8), "dni", 32102152, 221569635, 'f', "eugeniabota@gmail.com", "0000","What was the name of your first pet?", "Firulais")
				);
	}
	
	public BeanData () {
		super ();
    }
	
	public static List<Student> getStudents () {
		return students;
    }
	

}
