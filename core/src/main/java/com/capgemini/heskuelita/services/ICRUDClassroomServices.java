package com.capgemini.heskuelita.services;

import com.capgemini.heskuelita.beans.Classroom;

public interface ICRUDClassroomServices {
	
	void add(Classroom Classroom);
	void remove(Classroom Classroom);
	void update(Classroom Classroom);
	Classroom findByClassroomNum(int classroomNum);

}
