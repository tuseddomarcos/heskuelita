package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import src.Student;

public class CollectionsTest {
	ArrayList <Student> students ;
	Student student1 ;
	
	HashSet <String> studentsNames ;
	
	Map <Integer, String> prototipoDeMail ;
	
@Before
public void setUp() {
	students = new ArrayList<Student>() ;
	Student student1 = new Student() ;
	
	studentsNames = new HashSet<String>() ;
	
	prototipoDeMail = new HashMap<Integer, String>() ;
	
	}

	
@Test
public void unArrayListPuedeResponderSiEstaVacia() {
	
	assertTrue(this.students.isEmpty()) ;
	}

@Test
public void siAUnArrayListVacioLeAgregoUnEstudianteTendraEseMismoYSuLongitudSeraUno() {

	int esperado = 1 ;
	students.add(student1) ;
	
	assertTrue(students.contains(student1)) ;
	
	assertEquals(esperado, students.size());
	}

@Test
public void unHashSetSabeResponderSiEstaVacio() {
	
	assertTrue(studentsNames.isEmpty()) ;
	}

@Test
public void siAUnHashSetVacioLeAgregoUnObjetoTendraEseMismoYSuLongitudSeraUno() {

	int esperado = 1 ;
	String studentName = "Romina" ;
	studentsNames.add(studentName) ;
	
	assertTrue(studentsNames.contains(studentName)) ;
	
	assertEquals(esperado, studentsNames.size()) ;
	}

@Test
public void unHashMapsabeResponderSiEstaVacio() {
	
	assertTrue(prototipoDeMail.isEmpty()) ;
	}

@Test
public void unHashMapSabeResponderSiTieneUnClavePredeterminada() {
	
	prototipoDeMail.put( 12345,"Mariana98@gmail.com" ) ;
	
	assertTrue(prototipoDeMail.containsKey(12345)) ;
	}

@Test 
public void unHashMapSabeDevolverElValorDeUnaClave() {
	
	String valorEsperado = "Mariana98@gmail.com" ;
	
	prototipoDeMail.put( 12345,"Mariana98@gmail.com" ) ;
	
	assertEquals(valorEsperado, prototipoDeMail.get(12345)) ;	
	
	valorEsperado.charAt(2) ;
	System.out.println(valorEsperado.charAt(2)) ;
	}

}
