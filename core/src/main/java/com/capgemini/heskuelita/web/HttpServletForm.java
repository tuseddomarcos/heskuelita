package com.capgemini.heskuelita.web;

import java.time.LocalDate;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.capgemini.heskuelita.beans.Teacher;

@WebServlet("/HttpServletForm")
public class HttpServletForm extends HttpServlet{

    private static final Logger logger = LoggerFactory.getLogger (HttpServletForm.class);
    //private DAOTeacher daoTeacher; bueno noc porque goma no me deja importar
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {

		String firstName= request.getParameter("firstName");
		String surname= request.getParameter("surName");
		String dni= request.getParameter("dni");
		String phone= request.getParameter("phone");
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		String gender= request.getParameter("genderRadios");
		
        logger.debug (String.format ("Request Received [name=%s, last name=%s, dni=%s, gender=%s, phone=%s, email=%s]",
                firstName, surname, dni, gender, phone, email));
		
		Teacher teacher= new Teacher(firstName, surname, Integer.valueOf(dni), gender.charAt(0));
		teacher.setPhone(Integer.valueOf(phone));
		teacher.setEmail(email);
		teacher.setPassword(password);
		teacher.setBirthdate(LocalDate.now());//en el form todavia no hay para seleccionar fecha
		
		
	}
    
}
