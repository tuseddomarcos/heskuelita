package com.capgemini.heskuelita.service;
import com.capgemini.heskuelita.beans.Student;

public interface IStudentService {

	void add(Student student);
	
	void delete(Student student);
	
	void update(Student student);
	
	void studentByDNI (int dni);
	
	Student [] findAll();
	
}