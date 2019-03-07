
package com.capgemini.heskuelita.services;

import java.util.*;

import com.capgemini.heskuelita.beans.Student;
import com.capgemini.heskuelita.beans.User;


public interface IStudentService extends IGerenicCrud <Student, Long> {
				
	//Crud + extra methods
	
	public User FindByUserEmail(String pEmail);
	
	public ArrayList<Student> FilterBySex(char pSex);
	
	
}