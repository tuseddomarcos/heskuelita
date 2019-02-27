package dbtesting;

import com.capgemini.heskuelita.beans.Student;

public class DataPracticeMethods {
	
	public static void addStu() {
		System.out.println("INTRODUZCA NOMBRE DEL ESTUDIANTE:");
		String nombre = DataPractice.entrada.nextLine();
		System.out.println("INTRODUZCA APELLIDO DEL ESTUDIANTE:");
		String apellido = DataPractice.entrada.nextLine();
		System.out.println("INTRODUZCA DIRECCION DEL ESTUDIANTE:");
		String direccion = DataPractice.entrada.nextLine();
		System.out.println("INTRODUZCA DNI DEL ESTUDIANTE:");
		int dni = DataPractice.entrada.nextInt();
		System.out.println("INTRODUZCA TELEFONO DEL ESTUDIANTE:");
		int telefono = DataPractice.entrada.nextInt();
		char sexo = 'M';
		
		// ES MEJOR VISTO INSTANCIAR Y USAR O INSTANCIAR EN EL USO?
		Student stu = new Student(4, nombre, apellido, dni, telefono, direccion, sexo);
		DataPractice.studentList.add(stu);
		
//		Practica.studentList.add(new Student(4, nombre, apellido, dni, telefono, direccion, sexo));
		
		System.out.println("\n\nLISTA DE ESTUDIANTES");
		
		// VALE LA PENA USAR LAMBDA PARA RECORRER Y MOSTRAR TODO? O SOLO CON CONDICIONES?
		for(Student e : DataPractice.studentList) {
			System.out.println(e.getName());
		}
	}
	
	public static void removeStu() {
		DataPractice.studentList.remove(searchByDni());
		
		System.out.println("\n\nLISTA DE ESTUDIANTES");
		
		for(Student e : DataPractice.studentList) {
			System.out.println(e.getName());
		}
	}
	
	public static Student searchByDni() {
		System.out.println("INTRODUZCA DNI DE ESTUDIANTE:");
		int dni = DataPractice.entrada.nextInt();
		
		return DataPractice.studentList.stream().filter(stu -> 
			stu.getDni()==dni).findFirst().get();
	}
	
	public static void startOpt() {
		int continuar = 1;
		
		while(continuar == 1) {
			System.out.println("QUE FUNCION DESEA EJECCUTAR?\n1- AGREGAR\n2- BUSCAR\n3- REMOVER");
			int input = DataPractice.entrada.nextInt();
			
			if (input == 1) {
				DataPractice.entrada.nextLine();
				addStu();
			} else if (input == 2) {
				DataPractice.entrada.nextLine();
				System.out.println(searchByDni().getName());
			} else {
				DataPractice.entrada.nextLine();
				removeStu();
			}
			
			System.out.println("\n\nDESEA REALIZAR OTRA OPERACION?\n1- Si\n2- No");
			continuar = DataPractice.entrada.nextInt();
			DataPractice.entrada.nextLine();
		}
		
	}

}
