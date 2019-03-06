package com.capgemini.heskuelita.beens.service;
import com.capgemini.heskuelita.beens.Student;

public interface Iservice {
	
	 Student Ifind_by_dni(int dni);
	 void  IAdd(Student Student);
	 Student Ilist_student();
	 
}