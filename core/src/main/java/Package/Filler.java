package Package;
import java.util.ArrayList;
import java.util.Arrays;;

public class Filler {

	static Student marcos = new Student(01, "Marcos", "Inca", "M", "DNI", 190, "marcos@gmail.com");
	static Student juan = new Student(02, "Juan", "Lopez", "M", "DNI", 198, "juan@hotmail.com");
	static Student laura = new Student(03, "Laura", "Lopez", "F", "DNI", 102, "pedro@hotmail.com");
	static Student manuel = new Student(04, "Manuel", "Deo", "M", "DNI", 209, "manuel@hotmail.com");

	static ArrayList<Student> students = new ArrayList<> (Arrays.asList(marcos, juan, laura, manuel));
}
