package com.capgemini.heskuelita.beans;

import java.util.*;
import java.util.stream.*;

public class DataBaseManager {
	
	public static void main(String[] args) {

		List <Student> studentList = new ArrayList<Student>();
		
		Student mauri = new Student ();
		Student gonza = new Student ();
		Student ramirez = new Student ();
		
		mauri.setName("Mauri");
		gonza.setName("Gonza");
		ramirez.setName("Ramirez");
		
		studentList.add(mauri);
		studentList.add(gonza);
		studentList.add(ramirez);
		
		System.out.println("Lista original: ");
		studentList.forEach(System.out::println);
		
		Scanner in = new Scanner (System.in);
		mauri.setName(in.nextLine());
		
		System.out.println( "\n"  + "Lista filtrada: ");
		updateName(mauri, studentList).forEach(System.out::println);;
		
		System.out.println( "\n"  + "Lista final: ");
		studentList.forEach(System.out::println);
	}
	
	public static List<Student> updateName(Student student, List<Student> studentList) {
		return studentList.stream().filter
				(s -> s.getName().contains(student.name)).collect(Collectors.toList());
			
	}
	
	

}