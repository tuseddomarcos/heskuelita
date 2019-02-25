package com.capgemini.heskuelita.services;

import java.util.List;

import com.capgemini.heskuelita.beans.*;

public interface IAcademicOfferService {
	
	List <AcademicOffer> findAll();
	
	void enroll (Student estudent, List<AcademicOffer> courses);
	
}
