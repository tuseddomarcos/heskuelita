package beans;

public interface IStudentServices {
	
	public void addUser(Student aStudent) ;
	
	public void deleteUser(Student aStudent) ;
	
	public void deleteUserByDNI(int dni) ;
	
	public Student findUserByDNI(int dni) ;
	
	public Student findUserByLastName(String aLastName) ;
	
}
