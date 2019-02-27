package core.com.capgemini.heskuelita.beans;
import java.util.Scanner;

public class DataBase {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Student s1 = new Student("Lucas","Cabrera","LuCabrera@hotmail.com",00000001,100000001);
		Student s2 = new Student("Luis","Herrera","LuHerrera@hotmail.com",00000002,100000002);
		Student s3 = new Student("Brian","Palacio","BrPalacio@hotmail.com",00000003,100000003);
		Student s4 = new Student("Lucas","Sosa","AlSosa@hotmail.com",00000004,100000004);
		Student s5 = new Student("Armando","Barreda","ArBarreda@hotmail.com",00000005,100000005);
		
		Room Salon = new Room("Escuelita Java", 0001 , 5);
		Salon.AnotarAlumno(s1);
		Salon.AnotarAlumno(s2);
		Salon.AnotarAlumno(s3);
		Salon.AnotarAlumno(s4);
		Salon.AnotarAlumno(s5);
		
		System.out.println(Salon.BuscarPorDNI(00000001));
		System.out.println(Salon.getCapacidad());
		System.out.println(Salon.getRegistrados());
		System.out.println(Salon.BuscarPorNombre(reader.nextLine()));
		Salon.EliminarAlumno(s5);
		System.out.println(Salon.getRegistrados());
		System.out.println(Salon.BuscarPorMail(reader.nextLine()));
		System.out.println(Salon.BuscarPorNombre(reader.nextLine()));
		System.out.println(Salon.BuscarPorNombre(reader.nextLine()));
		
	}
}
