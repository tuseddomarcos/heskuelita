package beans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class App implements ICourseServices, IStudentServices, ITeacherServices {
	
	private ArrayList<Student>students ;
	private ArrayList<Teacher>teachers ;
	private ArrayList<Course>courses ;
	private ArrayList<AcademicOffer>offers ;
	
	public Course findByNumberClassroom(int numberClassroom) {
		
		return courses.stream().filter(course -> course.getNumber()
				== numberClassroom )
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
	public Student findUserByDNI(int dni) {
		
		return this.students.stream().filter(s -> s.getDNI() == dni )
				    .findFirst().get();
	}

	@Override
	public ArrayList<Student> findUsersByLastName(String aLastName) {
		
		return (ArrayList<Student>) this.students.stream().filter(s -> s.getLastname()
				== aLastName).collect(Collectors.toList());
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
	public void deleteTeacherByDNI(int dni) {
		
		Teacher teacher = this.teachers.stream().filter(t -> t.getIdentification()
				== dni).findFirst().get();
		
		this.teachers.remove(teacher) ;	
	}

	@Override
	public Teacher findByDNI(int dni) {
		
		return this.teachers.stream().filter(t -> t.getIdentification()
				== dni).findFirst().get();
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
