
package com.capgemini.heskuelita.services;


import java.util.List;

import com.capgemini.heskuelita.beans.AcademicOffer;
import com.capgemini.heskuelita.beans.Student;


public interface IAcademicOfferService {


    List<AcademicOffer> findAll ();

    void enroll (Student student, List<AcademicOffer> courses);
}