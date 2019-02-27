package dbtesting;

import java.util.Scanner;

public class Execute {

	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		DataSourcePractice miClase = new DataSourcePractice();
		
		miClase.setup();
		miClase.startOpt();
		//miClase.addStudent();
		//miClase.showRegisters();
		//miClase.updateStudent();
		//miClase.deleteStudentDataByDni();
		
		entrada.close();

	}

}
