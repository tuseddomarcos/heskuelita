package Package;

public class Course extends ContentID {
	private String name;
	private String description;
		
	public Course(int id, String name, String description) {
		super(id);
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}

}