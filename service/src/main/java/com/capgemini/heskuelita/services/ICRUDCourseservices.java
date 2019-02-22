package com.capgemini.heskuelita.services;

import com.capgemini.heskuelita.beans.Course;

public interface ICRUDCourseservices {
	
	void add(Course Course);
	void remove(Course Course);
	void update(Course Course);
	Course findByIdCou(int idCou);

}
