
package com.capgemini.heskuelita.services;


import java.util.ArrayList;

import com.capgemini.heskuelita.beans.CourseOffer;
import com.capgemini.heskuelita.beans.Student;


public interface IAcademicOfferService extends IGenericCrud<CourseOffer, Long> {

	//crud + extra methods 
	
    ArrayList<CourseOffer> findAll ();

    void enroll (Student student, ArrayList<CourseOffer> courses);
    
    
}
