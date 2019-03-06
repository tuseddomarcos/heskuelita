
package com.capgemini.heskuelita.services;

import java.util.ArrayList;

import com.capgemini.heskuelita.beans.ClassRoom;
import com.capgemini.heskuelita.beans.Course;
import com.capgemini.heskuelita.beans.Professor;

public interface IProfessorDAO extends DAO {
	
	//crud from DAO + extra methods	
	
	public ArrayList<Professor> ProfessorByCourse(Professor pProfessor, Course pCourse);
	
	public ArrayList<Professor> ProfessorByClassroom(Professor pProfessor, ClassRoom pClassRoom);
	
	
}
