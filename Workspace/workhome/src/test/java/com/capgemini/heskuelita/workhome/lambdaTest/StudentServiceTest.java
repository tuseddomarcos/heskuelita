package com.capgemini.heskuelita.workhome.lambdaTest;


import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.capgemini.heskuelita.beans.Student;
import com.capgemini.heskuelita.workhome.lambda.StudentService;

public class StudentServiceTest {
	
	private static StudentService stService;
	
	
	@BeforeClass
	public static void setUpClass() {
		stService = new StudentService();
	}
	
	@Test
	public void testEnrollStudent() {
		Student stAdded = new Student(5, "Jose", "Dominguez", LocalDate.of(2000, 1, 1), "dni", 23568971, 225266225, 'm', "jose_dominguez@hotmail.com", "25789", "What was the name of your first pet?", "Pepito");
		stService.enrollStudent(stAdded);
		assertTrue("No se agrego el nuevo estudiante", stService.getStudents().contains(stAdded));
	}
	
	@Test
	public void testDeleteStudent() {
		Student stDelete = new Student (2, "Josefina", "Baez", LocalDate.of(1991, 3, 6), "dni", 33752860, 2494222, 'f', "josefina22@gmail.com", "12345","What was the name of your first pet?", "Pope");
		stService.deleteStudent(stDelete);
		assertFalse("No se agrego el nuevo estudiante", stService.getStudents().contains(stDelete));	
	}
	
	@Test
	public void testUpdateStudent() {
		Student stUpdate= new Student (2, "Josefina", "Baez Lopez", LocalDate.of(1991, 3, 6), "dni", 33752860, 2494222, 'f', "josefina22@gmail.com", "12345","What was the name of your first pet?", "Pope");
		stService.updateStudent(stUpdate);
		String lastNameActual= stUpdate.getLastName();
		String lastNameEsperado = stService.getStudents().get(stService.getStudents().indexOf(stUpdate)).getLastName();
		assertEquals("No se realizo el proceso de actualizacion del apellido", lastNameEsperado, lastNameActual);
	}
	
	
	@Test
	public void testFindByIdentification() {
		Student stToFind = new Student (1, "Lucas", "Perez", LocalDate.of(2000, 1, 1), "dni", 38752964, 228447927, 'm', "lucas.perez@gmail.com", "12345","What was the name of your first pet?", "Firulais");
		Student stFound = stService.findByIdentification(stToFind);
		assertEquals("No se encontro ningun estudiante con el nro de identifiacion buscado: " + stFound,stToFind, stFound);
	}
	
	@Test
	public void testFindByEmailConcurrence() {
		String concurrence= "@gmail.com";
		List <Student> listConcurrence= stService.findByEmailConcurrence(concurrence);
		for (Student student : listConcurrence) {
			assertTrue("Falla en la concurrencia de email", student.getEmail().contains(concurrence));
		}
		
		
	}
	
	@Test
	public void testFindByEmail() {
		Student studentToFind = new Student (3, "Marco", "Ruiz", LocalDate.of(1993, 8, 5), "dni", 33456789, 11569872, 'm', "marquito27@gmail.com", "12345","What was the name of your first pet?", "Homer");
		Student studentFounded = stService.findByEmail(studentToFind);
		assertEquals("Los estudiantes no coinciden ", studentFounded, studentToFind);
	}
	
	
	@AfterClass
	public static void closeClass() {
		stService=null;
	}
}
