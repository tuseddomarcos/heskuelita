package Package;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class App {
				
		public static void main (String[] args) {
			
			Student marcos = new Student(01, "Marcos", "Inca", "DNI", 190, "marcos@gmail.com");
			Student juan = new Student(02, "Juan", "Lopez", "DNI", 198, "juan@hotmail.com");
			Student pedro = new Student(03, "Pedro", "Lopez", "DNI", 102, "pedro@hotmail.com");
			Student manuel = new Student(04, "Manuel", "Deo", "DNI", 209, "manuel@hotmail.com");

			List<Student> students = Arrays.asList(marcos, juan, pedro, manuel);
			
			Scanner in = new Scanner(System.in);
			System.out.println("Write your ID, Name, Last Name, Doc, Idem, Email");
			int idN = in.nextInt();
			String nameN = in.next();
			String lastN = in.next();
			String docN = in.next();
			int idemN = in.nextInt();
			String emailN = in.next();

			Student generic = new Student(idN, nameN, lastN, docN, idemN, emailN);
			
			students.add(generic);
			in.close();
		}
}
