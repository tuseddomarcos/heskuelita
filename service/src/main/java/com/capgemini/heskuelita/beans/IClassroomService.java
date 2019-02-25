package com.capgemini.heskuelita.beans;

import java.util.List;

import com.capgemini.heskuelita.beans.Classroom;

public interface IClassroomService {

	//Adds Classroom
	void AddClassroom (Classroom classroom);
	
	//Finds ONE Classroom with specific info, 
	Classroom FindbyId (int id);
	
	//Finds multiple Classrooms
	List<Classroom> FindbyClassroom (int roomNumber);	
	List<Classroom> FindbyFloor (short floor);	
	
	//Modifys Classroom info
	Classroom ChangeClassroom (Classroom classroom, int roomNumber);
	Classroom ChangeFloor (Classroom classroom, short floor);	
	
	//Showing all the Classrooms 
	List<Classroom> ShowAll();	
	
	//Delete a Classroom
	void DeleteClassroom(Classroom classroom);
	
	
}
