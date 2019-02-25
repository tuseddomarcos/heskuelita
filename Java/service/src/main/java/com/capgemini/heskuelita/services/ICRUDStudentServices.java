package com.capgemini.heskuelita.services;

import com.capgemini.heskuelita.beans.Student;

public interface ICRUDStudentServices {
	
	void add(Student Student);
	void remove(Student Student);
	void update(Student Student);
	Student findByDni(int dni);

}
