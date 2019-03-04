package com.capgemini.heskuelita.services;

import java.util.List;

import com.capgemini.heskuelita.beans.Student;

public interface IStudentService {
	
	void enrollStudent(Student student);
	
	void deleteStudent(Student idStudent);
	
	void updateStudent(Student student);
	
	Student findByIdentification(Student student);
	
	List<Student> findByEmailConcurrence(String concurrence);
	
	Student findByEmail(Student student);
	
	
	
	

}
