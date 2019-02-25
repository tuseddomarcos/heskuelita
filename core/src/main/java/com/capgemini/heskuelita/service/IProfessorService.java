package com.capgemini.heskuelita.service;
import com.capgemini.heskuelita.beans.Professor;

public interface IProfessorService {
	
	void add(Professor professor);
	
	void delete(Professor professor);
	
	void update(Professor professor);
	
	Professor findByID(int id);
	
	Professor[] findAll();

}