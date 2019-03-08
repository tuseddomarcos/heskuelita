

package com.capgemini.java.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HttpServletForm")
public class HttpServletForm extends HttpServlet {


    private static final Logger logger = LoggerFactory.getLogger (HttpServletForm.class);
    private DataBaseAccess cnn;

    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {


        String name =  request.getParameter("name");

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
         this.cnn = new DataBaseAccess();
         logger.debug (String.format ("Request Received [name=%s, last name=%s, address=%s, gender=%s, position=%s, experience=%s]",
                 name, lastName, address, gender, position, experience));
         response.sendRedirect ("result.html");

         try {
			cnn.registerPerson(new Person(name, lastName, address, gender, position, experience));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
        
        
        
    }
}