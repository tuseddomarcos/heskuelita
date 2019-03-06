package com.capgemini.heskuelita.beans.service;
import com.capgemini.heskuelita.beans.Student;

public interface Iservice {
	
	 Student Ifind_by_dni(int dni);
	 void  IAdd(Student Student);
	 Student Ilist_student();
	 
}