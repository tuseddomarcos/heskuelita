package beans;

import java.util.List;


	public interface IAcademicOfferService {

	    List<AcademicOffer> findAll ();

	    void enroll (Student student, List<AcademicOffer> courses);
	}

	