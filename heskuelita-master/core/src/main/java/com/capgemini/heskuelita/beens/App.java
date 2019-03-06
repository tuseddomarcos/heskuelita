package com.capgemini.heskuelita.beens;
import java.util.*;
import java.util.stream.Collectors;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;

public class App {
	static Scanner in = new Scanner(System.in);

	public static void main (String [] arg) {

		Returns_names();
		boolean rta =Delete_Student(223);
		Returns_names();

	}

	public static void newStudent() {

		System.out.println("ingrese nombre del alumno\n");
		String name = in.nextLine();
		System.out.println("ingrese Apellido del alumno\n");
		String last_name = in.next();
		System.out.println("ingrese el id del alumno\n");
		int id= in.nextInt();
		System.out.println("ingrese la fecha de nacimiento del alumno\n");
		int time = in.nextInt();
		System.out.println("ingrese el genero del alumno\n");
		char gender = in.next().charAt(0);
		System.out.println("ingrese el numero de telefono del alumno\n");
		int phone = in.nextInt();
		in.close();
		Student New_student = new Student(name,last_name,id,time,gender,phone);
		ClasBD.New_student(New_student);
	}
	public static void Returns_names() {

		List<String> Names = new ArrayList<>();
		ClasBD.getStudents().forEach(Student ->Names.add( Student.getName()));
		System.out.println("forEach :" + Names);



	}
	public static boolean Delete_Student(int id) {	 
		   
		boolean rta = false;
		List<Student> eliminate= ClasBD.getStudents().stream().filter(e -> e.getId() == id).collect(Collectors.toList());
		
		for(Student i : eliminate) {
			rta =ClasBD.getStudents().remove(i);
		}
		return rta;
	}
}