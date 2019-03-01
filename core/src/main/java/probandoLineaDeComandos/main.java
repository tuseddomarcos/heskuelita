package probandoLineaDeComandos;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import beans.Student;

public class main {
	
	private static List<Student> students;

	static {
		 students = Arrays.asList(
				new Student("Jose", "Lopez", "JLopez@gmail.com", 123456) ,  
				 new Student("Mariano", "Gomez", "MarianGomez@hotmail.com", 234567) ,
				 new Student("Maria", "Nardi", "mnardi@hotmail.com", 345678) ,
				 new Student("Mercedes", "Davila", "MercedesDav@gmail.com", 901234) ,
				 new Student("Melina", "Torres", "JLopez@gmail.com", 567890) ) ;
	}
				 
	public static void main (String[] args) {
		System.out.println("Introduzca su nombre : ") ;
		Scanner in = new Scanner(System.in) ;
		System.out.println("Su nombre es:" + in.next()) ;
	}
		
	
	


}
