package Package;

public class Person {

	private int id;
	private String firstName;
	private String lastName;
	private String documentation;
	private int identification;
	private String email;

	public Person(int id, String firstName, String lastName, String documentation, int identification, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.documentation = documentation;
		this.identification = identification;
		this.email = email;
	}

	public int getId() {
		return this.id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getDocumentation() {
		return this.documentation;
	}

	public int getIdentification() {
		return this.identification;
	}

	public String getEmail() {
		return this.email;
	}
}