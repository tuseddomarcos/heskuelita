package com.capgemini.heskuelita.beens;
import java.util.*;

public class ClasBD {

	static List<Student> students=new ArrayList<Student>();

	public ClasBD() {
	}

	static {

		students = Arrays.asList( 
				new Student("Marcos", "Tuseddo", 223, 445,'m', 471),
				new Student("raul", "pena", 122, 012,'m', 005),
				new Student("malena", "pizzul", 444, 199,'f', 471),
				new Student("veronica", "rodriguez", 221, 445,'f', 451),
				new Student("Matias", "Solari", 123, 645,'f', 671),
				new Student("Laura", "Espinoza", 266, 675,'m', 179),
				new Student("Hugo", "Zucchi", 1, 445,'m', 471)
				);


	}

	

	public static List<Student> getStudents() {
		return students;
	}

	public static void New_student(Student student) {
		students.add(student);
	}
	


}
