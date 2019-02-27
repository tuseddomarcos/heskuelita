package Package;

public abstract class Person extends ContentID {

	private String firstName;
	private String lastName;
	private String sex;
	private String documentation;
	private int identification;
	private String email;

	public Person(int id, String firstName, String lastName, String sex, String documentation, int identification, String email) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.documentation = documentation;
		this.identification = identification;
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getSex() {
		return this.sex;
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