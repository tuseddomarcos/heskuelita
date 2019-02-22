package Package;
import java.util.List;

public class Teacher extends Person {
	private String[] students;
	List<int>idStudents = new List;
	
	public Teacher(String name, String lastName, int id, String[] students) {
		super(name, lastName, id);
		this.students = students;
	}
	
	public String getStudents() {
		return students[];
	}
}