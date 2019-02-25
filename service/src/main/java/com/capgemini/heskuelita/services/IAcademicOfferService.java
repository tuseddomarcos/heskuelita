package com.capgemini.heskuelita.services;

import java.util.List;

import core.com.capgemini.heskuelita.beans.AcademicOffer;
import core.com.capgemini.heskuelita.beans.Student;


public interface IAcademicOfferService {


    List<AcademicOffer> findAll ();

    void enroll (Student student, List<AcademicOffer> courses);
}