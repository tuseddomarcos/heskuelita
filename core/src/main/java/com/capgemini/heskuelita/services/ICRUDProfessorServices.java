package com.capgemini.heskuelita.services;

import com.capgemini.heskuelita.beans.Professor;

public interface ICRUDProfessorServices {
	
	void add(Professor Professor);
	void remove(Professor Professor);
	void update(Professor Professor);
	Professor findByDni(int dni);

}
