package com.capgemini.java.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/httpServletForm")
public class HttpServletForm extends HttpServlet {


    private static final Logger logger = LoggerFactory.getLogger (HttpServletForm.class);


    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {

    	//instancio la fabrica para crear una conexion
    	ConectionFactory newConecction=new ConectionFactory();
    			
    	//Conecto mi fabrica a la base de datos
    	//este objeto solo posee la habiladad de conecctarse y desconectarce de una base de datos
    	//posee un metod get para retornar dicha conexion
    	IConectionServer conecction=newConecction.getConection("Postgre");
    	
    	CrudAbstractImpl crud=new CrudPostgre();
    	
    	try {
			conecction.Setup();	
			crud.Create(conecction.getDataSource(), request.getParameter("name"), 
					request.getParameter("lastName"), "Dni", 0, 0,
					request.getParameter("gender"), 
					request.getParameter("address"), 1100, 1888, "dbkjh@sdlksd.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        /*String name =  request.getParameter("name");

        String lastName =  request.getParameter("lastName");

        String address =  request.getParameter("address");

        String gender =  request.getParameter("gender");

        String position =  request.getParameter("position");

        String experience = request.getParameter("experience");

        if (experience == null) {
            experience = "No";
        } else{
            experience = "Si";
        }
        */

        //logger.debug (String.format ("Request Received [name=%s, last name=%s, address=%s, gender=%s, position=%s, experience=%s]",
               // name, lastName, address, gender, position, experience));
        response.sendRedirect ("result.html");
    }
}