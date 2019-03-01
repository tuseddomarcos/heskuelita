package interfaces;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import beans.AcademicOffer;
import beans.Course;
import beans.Inscription;
import beans.Student;
import beans.Teacher;


	public interface IAcademicOfferService {

		public  List<AcademicOffer> findAll ();

	    public void enroll (Student student, List<AcademicOffer> courses);
	    
	    public void deleteEnroll(Inscription id) ;
	    
	    public List<Teacher> coursesTaughtBy(Teacher teacher) ;
	    
	    public List<Course> coursesAtDate (LocalDate date) ;
	    
	    public List<Course> coursesAtTime(LocalTime time) ;
	    
	}

	