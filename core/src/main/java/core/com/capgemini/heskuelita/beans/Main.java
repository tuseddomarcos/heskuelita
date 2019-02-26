package core.com.capgemini.heskuelita.beans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course c = new Course(1L, "Aula Java", "Aula para el aprendizaje de Java");
		
		Teacher t = new Teacher(1L, "Homer", "Simpson", "homer@hotmail.com", 11111111);
		
		ClassRoom r = new ClassRoom(1L, "Aula 201", "Aula piso 2");
		
		List<AcademicOffer>list = new ArrayList <AcademicOffer>();
	}

}
