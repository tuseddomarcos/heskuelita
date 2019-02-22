package core.com.capgemini.heskuelita.beans;

public class Student {

	private String name;
	private String description;
	
	public Student() {
		
	}
	
	public Student(String name, String description, int id) {
		
		this.name=name;
		
		this.description=description;
		
		super(id);
	}
	
	
}

