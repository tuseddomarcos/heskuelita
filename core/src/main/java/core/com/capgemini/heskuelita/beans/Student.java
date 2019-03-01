package core.com.capgemini.heskuelita.beans;

public class Student extends Person {
	private String userName, password;
	public Student(String name, String last_name, String documentation_type, String screet, int identitication,
			int phone, int number, int zip_code, char sex, String user, String password, String userName) {
		super(name, last_name, documentation_type, screet, identitication, phone, number, zip_code, sex);
		this.setUserName(userName);
		this.setPassword(password);
	}
	
	public Student() {
		super();
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
