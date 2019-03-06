package com.capgemini.heskuelita.beans.service;
import com.capgemini.heskuelita.beans.Classroom;


public interface IClassroom {
	int find_classroom_by_id(int id_classrrom);
	Classroom[] find_all();
	
}
