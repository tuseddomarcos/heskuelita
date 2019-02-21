package com.capgemini.heskuelita.beens.service;
import com.capgemini.heskuelita.beens.Teacher;


public interface Iteacher {

	Teacher[] find_all();
	Teacher finde_by_Id(int Id_teacher);
	
}
