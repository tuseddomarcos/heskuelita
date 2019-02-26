package Package;
import java.util.*;
import java.util.stream.*;

public class Filler {

		Student marcos = new Student(01, "Marcos", "Inca", "DNI", 190, "marcos@gmail.com");
		Student juan = new Student(02, "Juan", "Lopez", "DNI", 198, "juan@hotmail.com");
		Student pedro = new Student(03, "Pedro", "Lopez", "DNI", 102, "pedro@hotmail.com");
		Student manuel = new Student(04, "Manuel", "Deo", "DNI", 209, "manuel@hotmail.com");

		List<Student> students = Arrays.asList(marcos, juan, pedro, manuel);
		List<Student> gmail = students.stream().filter(e -> e.getLastName() == "Lopez").collect(Collectors.toList());
		
		
}
