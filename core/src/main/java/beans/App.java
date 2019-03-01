package beans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import interfaces.ICourseServices;
import interfaces.IStudentServices;
import interfaces.ITeacherServices;


public class App implements ICourseServices, IStudentServices, ITeacherServices {
	
	private ArrayList<Student>students ;
	private ArrayList<Teacher>teachers ;
	private ArrayList<Course>courses ;
	private ArrayList<AcademicOffer>offers ;
	private ArrayList<Inscription>incriptions ;
	
	public Course findByNumberClassroom(int course_id) {
		
		return courses.stream().filter(course -> course.getId()
				== course_id )
		    .findFirst().get();
	}
	
	public ArrayList<AcademicOffer> filterByADate(LocalDate aDate) {
		
		return (ArrayList<AcademicOffer>) offers.stream().filter(offer -> offer.getDate()
				== aDate).collect(Collectors.toList());
	}

	@Override
	public ArrayList filterByAnHour(LocalDate aTime) {
		
		return (ArrayList<AcademicOffer>) offers.stream().filter(offer -> offer.getDate()
				== aTime).collect(Collectors.toList());
	}

	@Override
	public void addUser(Student aStudent) {
		this.students.add(aStudent) ;
	}

	@Override
	public void deleteUser(Student aStudent) {
		this.students.remove(aStudent) ;
	}

	@Override
	public ArrayList<Student> findUserByIdentification(int identification) {
		
		return (ArrayList<Student>) this.students.stream().filter(s -> s.getIdentification() == identification )
				    .collect(Collectors.toList());
	}

	@Override
	public ArrayList<Student> findUsersByLastName(String aLastName) {
		
		return (ArrayList<Student>) this.students.stream().filter(s -> s.getLastname()
				== aLastName).collect(Collectors.toList());
	}
	
	@Override
	public Student findUserByEmail(String email) {
		
		return students.stream().filter(s -> s.getEmail() == email).findFirst().get() ;
	}

	@Override
	public ArrayList<Student> findUserByTelephone(int telephone) {
		
		return (ArrayList<Student>) students.stream().filter(s->s.getTelephone() == telephone)
				.collect(Collectors.toList()) ;
	}

	@Override
	public void addTeacher(Teacher aTeacher) {
		this.teachers.add(aTeacher) ;		
	}

	@Override
	public void deleteTeacher(Teacher aTeacher) {
		this.teachers.remove(aTeacher) ;
	}

	@Override
	public void deleteTeacherByIdentification(int identification) {
		
		Teacher teacher = this.teachers.stream().filter(t -> t.getIdentification()
				== identification).findFirst().get();
		
		this.teachers.remove(teacher) ;	
	}

	@Override
	public Teacher findByIdentification(int identification) {
		
		return this.teachers.stream().filter(t -> t.getIdentification()
				== identification).findFirst().get();
	}

	@Override
	public Teacher findByCourse(int course_id) {
		
		return this.offers.stream().filter(o -> o.getCourse().getId()
				== course_id).findFirst().get().getTeacher() ;
	}

	@Override
	public ArrayList<Teacher> findByLastName(String aLastName) {
		
		return (ArrayList<Teacher>) this.teachers.stream().filter(t -> t.getLastname()
				== aLastName).collect(Collectors.toList());
	}

	
	
	
	
}
