package core.com.capgemini.heskuelita.service;

import core.com.capgemini.heskuelita.beans.Classroom;

public interface IClassroom {
	void SinIn(Classroom classromm);
	Classroom Read(int number);
	void Update(Classroom classromm);
	void Delete(Classroom classromm);
}
