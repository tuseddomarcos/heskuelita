package core.com.capgemini.heskuelita.beans;
import java.io.IOException;
import java.util.Properties;

public class TestException {
	public static void main(String[] args) {
		Properties pop = new Properties();
		String us = "";
		String pw = "";
	
		try {
			pop.load(TestException.class.getClassLoader().getResourceAsStream("test"));
		
			us = pop.getProperty("user");
			pw = pop.getProperty("pw");
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	
		System.out.println(us);
		System.out.println(pw);
	}
}
