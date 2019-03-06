package app;
import com.capgemini.*;
import java.util.*;
import java.util.stream.Collectors;
 
 
public class Practica {
	
	public static void main (String [] arg ) {
		
		
		List<String> emails= Arrays.asList("raul.pane@hotmal.com","homer.simpson@gmail.com",
													"raul.pena@gmail.com", "lista@hotmail.com");
		
		ArrayList<String> aux = new ArrayList();
		
		for(String i : emails) {
			
			if(i.endsWith("@gmailcom"));{
				
				aux.add(i);
				System.out.println(i);
				
			}
		
			aux.clear();
			emails.forEach(e -> {
				
				if(i.endsWith("@gmailcom"));{
					
					aux.add(e);
					System.out.println(e);
					
				}	
				
			});
			
			
			emails.stream().filter(e-> e.endsWith("@gmail.com")).collect(Collectors.toList());
			emails.forEach(System.out::println);
		}
			
		
	}

}
