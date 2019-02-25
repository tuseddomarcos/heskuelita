package Package;
import java.util.*;
import Package.Student;

public class Teacher extends Person {
	List<Student> students = new List<Student> ();
	
	public Teacher(int id, char firstName, char lastName, char documentation, int identification, char email) {
		super(id, firstName, lastName, documentation, identification, email);
		this.students = students;
	}
}