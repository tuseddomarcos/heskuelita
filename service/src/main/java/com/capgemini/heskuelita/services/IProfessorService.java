
package com.capgemini.heskuelita.services;

import java.util.ArrayList;

import com.capgemini.heskuelita.beans.ClassRoom;
import com.capgemini.heskuelita.beans.Course;
import com.capgemini.heskuelita.beans.Professor;

public interface IProfessorService {
	
	
	public void AddStudent(Professor pProfessor);
	
	public void DeleteStudent(Professor pProfessor);
	
	public ArrayList<Professor> ProfessorByCourse(Professor pProfessor, Course pCourse);
	
	public ArrayList<Professor> ProfessorByClassroom(Professor pProfessor, ClassRoom pClassRoom);
	
	
}
