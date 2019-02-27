package javaPackage;
import java.util.*;
import java.util.stream.Collectors;


public class BeanFactory {
    public static void main (String[] args) {
	
	Persona_Estudiante raul = new Persona_Estudiante(1, "raul","sequeira",22,"M",1,1,3);
	Persona_Estudiante marcos = new Persona_Estudiante(1, "marcos","inca",23,"M",2,2,2);
	Persona_Estudiante brian = new Persona_Estudiante(1, "brian","cobol",24,"M",3,3,1);
	Persona_Estudiante rep = new Persona_Estudiante(1, "rep","guardiola",40,"M",4,4,5);
	
	//List<Persona_Estudiante> estudiantes = Arrays.asList(raul, marcos, brian,rep);
	ArrayList<Persona_Estudiante> estudiantes = new ArrayList<Persona_Estudiante>();
	estudiantes.add(raul);
	estudiantes.add(marcos);
	estudiantes.add(brian);
	estudiantes.add(rep);
	
	System.out.println("introduzca su id, nombre, apellido, edad, sexo, id estudiante, id persona, anio de la carrera"); 
	Scanner in = new Scanner(System.in);
	int id = in.nextInt();
	String nombre = in.next();
	String apellido = in.next();
	int edad = in.nextInt();
	String sexo = in.next();
	int id_estudiante = in.nextInt();
	int id_persona = in.nextInt();
	int anio_carrera = in.nextInt();
	in.close();
	Persona_Estudiante est1 = new Persona_Estudiante(id, nombre,apellido,edad,sexo,id_estudiante,id_persona,anio_carrera);
	
	//filtrar por estudiantes con anio de la carrera mayor a 2 
	
	estudiantes.add(est1);
	List<Persona_Estudiante>estudiantes2 = estudiantes.stream().filter(e->e.getAnio_est()>2).collect(Collectors.toList());
	estudiantes2.forEach(System.out::println);
	
}
}