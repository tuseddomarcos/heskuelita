package com.capgemini.heskuelita.services;

import com.capgemini.heskuelita.beans.Student;

public interface IStudentService {
	
	void enrollStudent(Student student);
	
	void deleteStudent(Student idStudent);
	
	void updateStudent(Student student);
	
	Student findByIdentification(Student student);

}
