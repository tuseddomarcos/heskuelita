package dbtesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.heskuelita.beans.Student;

public class DataPractice {
	
	static List<Student> studentList;
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(1, "Jose", "Nieva", 37751726, 1154158733, "Peralta Ramos 1348", 'M');
		Student s2 = new Student(2, "Gabriel", "Nieva", 39331027, 1145678733, "Peralta Ramos 1348", 'M');
		Student s3 = new Student(3, "Cristian", "Faccio", 37458726, 1178658733, "Bouchard 345", 'M');
		
		studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		DataPracticeMethods.startOpt();
		
		entrada.close();

	}

}
