package Package;

public class Teacher extends Person {
	private String[] students;
	
	public Teacher(String name, String lastName, int id, String[] students) {
		super(name, lastName, id);
		this.students = students;
	}
	
	public getStudents() {
		return students;
	}
}
