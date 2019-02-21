package core.com.capgemini.heskuelita.service;

import core.com.capgemini.heskuelita.beans.Student;

public interface IStudentService {
	void SinIn(Student student);
	Student Read(int dni);
	void Update(Student student);
	void Delete(Student student);
}
