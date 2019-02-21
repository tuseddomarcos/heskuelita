package core.com.capgemini.heskuelita.service;

import core.com.capgemini.heskuelita.beans.Professor;

public interface IProfessor {
	void SinIn(Professor professor);
	Professor Read(int number);
	void Update(Professor professor);
	void Delete(Professor professor);
}
