package com.capgemini.heskuelita.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;
import org.junit.Assert;

import core.com.capgemini.heskuelita.service.IConectionServer;

public class ConectionPostgre implements IConectionServer{
	
protected BasicDataSource dataSource = new BasicDataSource();
	
	// Logger object.
	protected static final Logger logger = Logger.getLogger (ConectionPostgre.class);
	
	public ConectionPostgre() {
		Setup();
	} 
 
 
	public void Setup() {
		try {
			// Create a new Datasource.
	        this.dataSource = new BasicDataSource ();

	        dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
	        dataSource.setUsername ("postgres");
	        dataSource.setPassword ("andres");
	        dataSource.setMinIdle (5);
	        dataSource.setMaxIdle (10);
	        dataSource.setMaxOpenPreparedStatements (100);
	        
	        logger.debug("Connected to database");
	        
	          
		}catch (Exception e){
			
		}
		
	}
	 
	public void Create(String name, String last_name, String doc_type, int doc_num, int phone, String sex,
			String screet, int screet_number, int zip_code, String email) throws Exception {

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
            int r = pstm.executeUpdate ();
            
            logger.info("student "+name+" "+last_name+" successfully loaded");
 
        } catch (Exception e) {

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing Insert...", e == null);
            
        }
	}

	public void Read() {
		try {

            Statement stm = this.dataSource.getConnection ().createStatement ();

            // Result set get the result of the SQL query
            ResultSet resultSet = stm.executeQuery ("SELECT * from student");

            // Print the messages.
            writeResult (resultSet);

        } catch (Exception e) {

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing Insert...", e == null);
            
        }
		
	}

	public void Update() {
		 try {

	            Statement stm = this.dataSource.getConnection ().createStatement ();

	            int r = stm.executeUpdate 
	            		("UPDATE student SET stu_name='Andres', stu_last_name='Petrizzo' "
	            				+ "WHERE stu_id='3'");

	        } catch (Exception e) {

	            e.printStackTrace ();
	            Assert.assertTrue ("Failure executing Insert...", e == null);
	            
	        }
		
	}

	public void Delete() {
		 try {

	            PreparedStatement stm = this.dataSource.getConnection ().prepareStatement 
	            		("DELETE FROM student");
	            int r = stm.executeUpdate ();


	        } catch (Exception e) {

	            e.printStackTrace ();
	            Assert.assertTrue ("Failure executing Insert...", e == null);
	        }
		
	}

	public void Destroy() throws SQLException {
		this.dataSource.close ();
        logger.debug("Connected to finalized database");
		
	}
	
	private void writeResult (ResultSet rs) throws SQLException{
		// ResultSet is initially before the first data set
		while (rs.next ()) {

			// It is possible to get the columns via name
			// also possible to get the columns via the column number
			// which starts at 1
			// e.g. resultSet.getSTring (2);

			logger.info(rs.getString (1)+" "+rs.getString (2)+" "+rs.getString (3));
		}
	}
}
