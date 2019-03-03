package practica;

import java.io.FileReader;
import java.io.IOException;

public class Leer_Fichero {

	//private FileReader entrada;

	public void lee() { try {//intentar hacer...
		
		FileReader entrada = new FileReader("C:/Users/rauul/Desktop/fichero.txt");
		//guardo un caracter que esta en forma de codigo
		int c = entrada.read();
		while(c!=-1) { //mientras llege al final
			char letra = (char)c; //convierto el codigo en caracter
			System.out.print(letra);
			c = entrada.read(); //leo el que sigue
		}
		
	}catch (IOException e){//sino capturo el fallo
		System.out.println("no se encontro el fichero");
	}
  }
}
