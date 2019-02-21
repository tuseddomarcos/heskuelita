package com.capgemini.heskuelita.beans;

public class App {

	public static void main(String[] args) {

		Student s1=new Student(null, null, 0, 'e');
		Student s2=new Student(null, null, 0, 'g');
		Student s3=new Student(null, null, 0, 't');
		Student s4=new Student(null, null, 0, 'r');
		Student s5=new Student(null, null, 0, 'r');
		Student s6=new Student(null, null, 0, 'r');
		
		System.out.println(Student.count);
	}

}
