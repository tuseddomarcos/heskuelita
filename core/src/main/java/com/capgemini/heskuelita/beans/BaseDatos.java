package com.capgemini.heskuelita.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseDatos {

	private static List<Student> students;
	private static List<Courses> courses;

	public static void main(String[] args) {
		
	
		    final  List<Student> students = new ArrayList <Student>();
			final  List<Courses> courses = new ArrayList <Courses>();}
	
	static {
			
					students = Arrays.asList( 
					
					new Student("Katherine","Miranda","22/9",'f',"7162826873","12434","ABdshad"),
					new Student("Joel","Diaz","20/9",'M',"7167126873","123563","kjs8383883"),
					new Student("Mario","Perez","22/7",'M',"6287126873","2134353","ajh8687687"),
					new Student("Lucas","Perez","13/8",'M',"62873","353","ah86687"),
					new Student("Noelia","Jeff","2/9",'f',"7162873","3245345","78hads889")
					);
			}
		
	static {
			
			courses = Arrays.asList(
					new Courses ("Java","343434","Nivel inicial"),
					new Courses ("Diseño web","3242323","Avanzado"),
					new Courses ("SQL","34342234","Nivel Intermedio")
					);
		
			for (Student s : students) {
			System.out.println(s.getName());
			System.out.println(s.getSex());
			System.out.println(s.getBirthDay());
	
	       } }
	
	}
		


	


