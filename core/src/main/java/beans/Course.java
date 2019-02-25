package beans;

public class Course extends Component{
	
	private int id;
	private String name;
	private String description;
	private int duracion;
	private int limit_person;

	public Course (int id, String name, String description, int duracion, int limit_person) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.duracion = duracion;
		this.limit_person = limit_person;
	}
	
	
	public int getNumber() {
		return this.id ;
	}

}
