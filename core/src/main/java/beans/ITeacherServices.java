package beans;

public interface ITeacherServices {
	
	public void addTeacher(Teacher aTeacher) ;
	
	public void deleteTeacher(Teacher aTeacher) ;
	
	public void deleteTeacherByDNI(int dni) ;
	
	public Teacher findByDNI(int dni) ;
	
	public Teacher findByCourse(int course) ;
	
	public Teacher findByLastName(String aLastName) ;

}
