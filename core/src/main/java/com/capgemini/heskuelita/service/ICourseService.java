package com.capgemini.heskuelita.service;
import com.capgemini.heskuelita.beans.Course;

public interface ICourseService {
	
	void add(Course course);
	
	void delete(Course course);
	
	void update(Course course);
	
	Course[] findAll();

}
