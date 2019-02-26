package com.capgemini.heskuelita.services;

import java.util.List;

import com.capgemini.heskuelita.beans.*;

public interface IAcademicOfferService {
	
	// lista todos las ofertas academicas
	List <AcademicOffer> findAll();
	
	// lista todas ofertas academicas donde esta registrado un estudiante
	List<AcademicOffer> findOfferStudent (Student student);
	
	// lista todas ofertas academicas donde esta registrado un estudiante
	List<AcademicOffer> findOTeacher (Teacher student);
	
	// Registra un estudiante en un conjunto de courses de la oferta academica
	void enrollStudent (Student student, List<AcademicOffer> courses);
	
	//Registra un profesor en un conjunto de courses de la oferta academica
	void enrollTeacher (Teacher teacher, List<AcademicOffer> courses);
	
}
