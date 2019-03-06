package com.capgemini.heskuelita.beens.service;
import com.capgemini.heskuelita.beens.Course;


public interface Iservice_couse {
	
	int find_val_course(int id_couse);
	Course find_by_Id(Course course);
	Course[] find_all();
	
}
