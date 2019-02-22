package com.capgemini.heskuelita.services;

import java.util.Collection;
import com.capgemini.heskuelita.beans.Student;

public interface IStudentService {

	void addStudent(Student student);
	
	Student findByDNI(Student student);
	
	Collection<Student> findAll();
	
	void deleteStudentByDNI(Student student);
	
	void updateStudentEmail(Student student, String email);
	
	void updateStudentPhone(Student student, int phone);
	
	
}
