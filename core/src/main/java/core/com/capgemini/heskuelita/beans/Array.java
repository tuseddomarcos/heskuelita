package core.com.capgemini.heskuelita.beans;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Array {
	
	public static void main(String[] args) {
		List<String> emails = Arrays.asList("raul.pega@gmail.com","raul.pega@hotmail.com","homer.simpsons@gmail.com","lisa.simpsons@hotmail.com","bart.simpsons@gmail.com");
		List<String> backup = new ArrayList<>();
		List<String> emails2 = new ArrayList<>();
		/*
		for(String mail : emails) {
			if(mail.contains("@gmail.com")) {
				backup.add(mail);
			}
		}
	    */
		
		emails.forEach(e -> {
			if(e.endsWith("gmail.com")) {
				emails2.add(e);
			}
		});
		System.out.println("emails2: ");
		emails2.forEach(System.out::println);
		
		
		backup = (ArrayList<String>) emails.stream().filter(e -> e.endsWith("hotmail.com")).collect(Collectors.toList());
		System.out.println("backup: ");
		backup.forEach(System.out::println);
	}
	
}
