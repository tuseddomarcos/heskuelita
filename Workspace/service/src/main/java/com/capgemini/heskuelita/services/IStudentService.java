package com.capgemini.heskuelita.services;

import com.capgemini.heskuelita.beans.Student;

public interface IStudentService {
	
	void enrollStudent(Student student);
	
	void deleteStudent(int idStudent);
	
	void updateStudent(Student student);

}
