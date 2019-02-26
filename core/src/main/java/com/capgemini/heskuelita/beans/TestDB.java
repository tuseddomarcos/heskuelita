package com.capgemini.heskuelita.beans;
import java.util.*;
import java.util.stream.Collectors;


public class TestDB {

private static final List<Student> students;
 
static {
	 
	 students =Arrays.asList (
			 new Student (1, "Rafael","Acosta", "M", 21, "DNI", 44059075,1164794928, "acosta.rafael89@gmail.com"),
			 new Student (2, "Nadia","Acosta", "F", 20, "DNI", 44987456,1123456789,"nadia.acosta@hotmail.com"),
			 new Student (3, "Sergio","Acosta", "M", 22, "DNI", 44059074,1134348011,"sergio.acosta@gmail.com"),
			 new Student (4, "Juan","Ramirez", "M", 23, "DNI", 42031848,1174562138, "juanramirez@outlook.com"),
			 new Student (5, "Alvaro","Mendoza", "M", 22, "DNI", 44054456,1121345678, "alvaro.mendoza@outlook.com"),
			 new Student (6, "Micaela","Conca", "F", 21, "DNI", 44059075,1134237895, "micaela.conca@gmail.com"),
			 new Student (7, "Wendy","Iudica", "F", 21, "DNI", 44059075,1164794928, "iudicawnedy@gmail.com"),
			 new Student (8, "Jesica","Ramirez", "F", 21, "DNI", 42321456,1153692279,"ramirezjesica@hotmail.com" ),
			 new Student (9, "Luca","Espinoza", "M", 20, "DNI", 44123456,1133665544,"luca.espinoza@outlook.com" ),
			 new Student (10, "Mauro","Cristofanetti", "M", 20, "DNI", 44654321,1112345678, "mauroc@live.com")
			 
			 
			 );
			 
 }



	



public static void main(String[] args) {
	
	System.out.println("The gmail accounts are: ");
	
	List <String> gmails= students.stream().filter(e->e.getEmail().endsWith("gmail.com")).map( e -> e.getEmail()).collect(Collectors.toList());

	gmails.forEach (System.out::println);
	
	System.out.println("Search by DNI:  ");
	Scanner in= new Scanner (System.in);
	System.out.println("DNI: "); String dni= in.next();
	
	
	
  
}
}



