package com.capgemini.heskuelita.beens.service;
import com.capgemini.heskuelita.beens.Classroom;


public interface IClassroom {
	int find_classroom_by_id(int id_classrrom);
	Classroom[] find_all();
	
}
