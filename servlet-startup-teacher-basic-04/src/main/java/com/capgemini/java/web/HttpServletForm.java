package com.capgemini.java.web;

import org.apache.commons.dbcp2.BasicDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HttpServletForm")
public class HttpServletForm extends HttpServlet {

	private static final Logger logger = LoggerFactory.getLogger (HttpServletForm.class);
    private BasicDataSource dataSource;
    
    public void setup () throws Exception {
		 
		try {
			// Create a new Datasource.
	        this.dataSource = new BasicDataSource ();

	        dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
	        dataSource.setUsername ("postgres");
	        dataSource.setPassword ("andres");
	        dataSource.setMinIdle (5);
	        dataSource.setMaxIdle (10);
	        dataSource.setMaxOpenPreparedStatements (100);
	        dataSource.setDriverClassName("org.postgresql.Driver");

		}catch (Exception e){
			throw e;
		}
        
    }

    public void create (
    		String name, 
    		String last_name, 
    		String doc_type, 
    		int doc_num, 
    		int phone, 
    		String sex,
			String screet, 
			int screet_number, 
			int zip_code, 
			String email) {

        try {
            PreparedStatement pstm = this.dataSource.getConnection ().prepareStatement 
            		("INSERT INTO student VALUES (default, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            pstm.setString (1, name);
            pstm.setString (2, last_name);
            pstm.setString (3, doc_type);
            pstm.setInt (4, doc_num);
            pstm.setInt (5, phone);
            pstm.setString (6, sex);
            pstm.setString (7, screet);
            pstm.setInt (8, screet_number);
            pstm.setInt (9, zip_code);
            pstm.setString (10, email);
         
            // Execute the insert.
           pstm.executeUpdate ();
 
        } catch (Exception e) {

            e.printStackTrace ();
            
        }
    }
    public void destroy () {
        try {
			this.dataSource.close ();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {
    	
    	try {
			setup();
		} catch (Exception e) {
			throw new IOException(e);
		}
    	create(request.getParameter("name"), request.getParameter("lastName"), " ",	0,0, request.getParameter("gender"),request.getParameter("address"),0,0," ");
    	
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

        logger.debug (String.format ("Request Received [name=%s, last name=%s, address=%s, gender=%s, position=%s, experience=%s]",
               name, lastName, address, gender, position, experience));
        */
        destroy();
        response.sendRedirect ("result.html");
    }
}