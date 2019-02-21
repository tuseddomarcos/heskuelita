

public class Course {
	private int id, duration, limit_person;
	private String name, description;
	
	public Course(int id, int duration, int limit_person, String name, String description ) {
		this.id=id;
		this.description=description;
		this.duration=duration;
		this.limit_person=limit_person;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getLimit_person() {
		return limit_person;
	}

	public void setLimit_person(int limit_person) {
		this.limit_person = limit_person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
