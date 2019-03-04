package com.capgemini.heskuelita.workhome.lambda;

import com.capgemini.heskuelita.beans.Course;
import com.capgemini.heskuelita.beans.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;


public class DBMock {
	
	private  ArrayList <Student> students;
	private  ArrayList <Course> courses;
	
	public DBMock () {
		super ();
		this.students = new ArrayList<Student>(
				 Arrays.asList (
							new Student (1, "Lucas", "Perez", LocalDate.of(2000, 1, 1), "dni", 38752964, 228447927, 'm', "lucas.perez@gmail.com", "12345","What was the name of your first pet?", "Firulais"),
							new Student (2, "Josefina", "Baez", LocalDate.of(1991, 3, 6), "dni", 33752860, 2494222, 'f', "josefina22@gmail.com", "12345","What was the name of your first pet?", "Pope"),
							new Student (3, "Marco", "Ruiz", LocalDate.of(1993, 8, 5), "dni", 33456789, 11569872, 'm', "marquito27@gmail.com", "12345","What was the name of your first pet?", "Homer"),
							new Student (4, "Eugenia", "Bota", LocalDate.of(1998, 10, 8), "dni", 32102152, 221569635, 'f', "eugeniabota@gmail.com", "0000","What was the name of your first pet?", "Firulais")
							)
				);
	
	
		courses = new ArrayList<Course>(
				Arrays.asList(
						new Course(1, "POO", "Programacion Orientada a Objetos", 10, 35),
						new Course(2, "EyAD", "Estructura y almacenamiento de Datos", 12, 40),
						new Course(3, "IPI", "Intoduccion a la Programacion 1", 4, 50)
						)
				);
    }
	
	public ArrayList<Student> getStudents () {
		return students;
    }
	
	public ArrayList<Course> getCourses () {
		return courses;
	}

}
