package core.com.capgemini.heskuelita.beans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner in = new Scanner(System.in);
		
				Student e1 = new Student(1L, "Luis", "Herrera", "luisherrera@hotmail.com", 11111111);
				Student e2 = new Student(2L, "Mario", "Pereira", "mariopereira@hotmail.com", 11111211);
				Student e3 = new Student(3L, "Matias", "Suarez", "matiassuarez@gmail.com", 11111311);
				Student e4 = new Student(4L, "Lisandro", "López", "lisandrolopez@yahoo.com", 11111411);
				Student e5 = new Student(5L, "Andrea", "Pirlo", "andreapirlo@gmail.com", 11111511);
				Student e6 = new Student(6L, "Mario", "Mandzukic", "mariomandzukic@hotmail.com", 11111611);
				Student e7 = new Student(7L, "Mario", "Balotelli", "mariobalotelli@yahoo.com", 11111717);
				Student e8 = new Student(8L, "Mauro", "Formica", "mauroformica@hotmail.com", 11111811);
				Student e10 = new Student(10L, "Esteban", "Cambiaso", "estebancambiaso@gmail.com", 11111011);
				Student e11 = new Student(11L, "Diego", "Forlan", "diegoforlan@hotmail.com", 11111215);
				Student e12 = new Student(12L, "Mario", "Pereira", "mariopereira90@hotmail.com", 11111219);
				Student e13 = new Student(13L, "Diego", "Mancuso", "diegomancuso@hotmail.com", 11111212);

				Course curso = new Course(1L, "Curso Java", "Introduccion a Java", 20);
				
				curso.agregarAlumno(e1);
				curso.agregarAlumno(e2);
				curso.agregarAlumno(e3);
				curso.agregarAlumno(e4);
				curso.agregarAlumno(e5);
				curso.agregarAlumno(e6);
				curso.agregarAlumno(e7);
				curso.agregarAlumno(e8);
				curso.agregarAlumno(e10);
				curso.agregarAlumno(e11);
				curso.agregarAlumno(e12);
				curso.agregarAlumno(e13);
				
//				System.out.println(curso.getRegistrados());
//				
//				System.out.println(curso.buscarPorDni(11111111));
//				
//				System.out.println("Introduza su nombre");
//				System.out.println("" + in.next());
//				System.out.println(curso.buscarPorMail(in.next()));
				
				System.out.println("Introduza el dni");
				
//				System.out.println("" + in.next());
				System.out.println(curso.buscarPorMail("herrera"));
				curso.eliminarPorDni(in.nextInt());
				System.out.println(curso.buscarPorMail("herrera"));
		
	}

}
