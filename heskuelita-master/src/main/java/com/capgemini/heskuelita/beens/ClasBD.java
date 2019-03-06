package com.capgemini.heskuelita.beens;
import java.util.*;

public class ClasBD {
	static List<Student> students=new ArrayList<Student>();
	static List<Course> courses;

	 public ClasBD() {
	}

			static {
				
			students = Arrays.asList( 
					new Student("Marcos", "Tuseddo", 223, 445,'m', 471, 001),
					new Student("raul", "pena", 122, 012,'m', 005, 002),
					new Student("malena", "pizzul", 444, 199,'f', 471, 003),
					new Student("veronica", "rodriguez", 223, 445,'f', 451, 004),
					new Student("Matias", "Solari", 123, 645,'f', 671, 005),
					new Student("Laura", "Espinoza", 266, 675,'m', 179, 006),
					new Student("Hugo", "Zucchi", 1, 445,'m', 471, 1)
					);
			
				courses = Arrays.asList(new Course(001, "laboratorio1", 20, 35),
						new Course(002, "Java", 25, 15),
						new Course(003, "Data Bases", 12, 50),
						new Course(004, "Opetative System", 20, 30),
						new Course(001, "Math", 30, 100)
						);
		
			}

		public static List<Student> getStudents() {
			return students;
		}

		public static List<Course> getCourses() {
			return courses;
		}
		
	public static void New_student(Student student) {
		students.add(student);
	}
		


}






