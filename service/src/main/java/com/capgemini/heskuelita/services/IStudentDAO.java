
package com.capgemini.heskuelita.services;

import java.util.*;

import com.capgemini.heskuelita.beans.Student;
import com.capgemini.heskuelita.beans.User;


public interface IStudentDAO extends DAO <Student, Long> {
				
	//Crude from DAO + extra methods
	
	public User FindByUserEmail(String pEmail);
	
	public ArrayList<Student> FilterBySex(char pSex);
	
	
}