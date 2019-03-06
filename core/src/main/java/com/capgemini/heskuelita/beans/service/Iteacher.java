package com.capgemini.heskuelita.beans.service;
import com.capgemini.heskuelita.beans.Teacher;

import java.util.*;


public interface Iteacher {

	Teacher[] find_all();
	Teacher finde_by_Id(int Id_teacher);
	
	
	
	public void mensaje();
	
	
}
