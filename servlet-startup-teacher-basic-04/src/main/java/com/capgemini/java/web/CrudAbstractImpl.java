package com.capgemini.java.web;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;
import org.junit.Assert;

public abstract class CrudAbstractImpl{
	private final Logger logger = Logger.getLogger (CrudAbstractImpl.class);
	

	protected void Create(BasicDataSource dataSource, String name, String last_name, String doc_type, int doc_num, int phone, String sex,
			String screet, int screet_number, int zip_code, String email) throws Exception {

		try {
			PreparedStatement pstm = dataSource.getConnection ().prepareStatement 
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

	protected void Read(BasicDataSource dataSource, String campo, String tabla, String condicion) throws SQLException {
		try {
			Statement stm = dataSource.getConnection().createStatement();
			// Result set get the result of the SQL query
			ResultSet resultSet = stm.executeQuery ("SELECT "+campo+" from "+tabla+" WHERE "+condicion);

			// Print the messages.
			writeResult (resultSet);

		} catch (Exception e) {

			e.printStackTrace ();
			Assert.assertTrue ("Failure executing Insert...", e == null);

		}
	}
	
	protected void Update(BasicDataSource dataSource, String campo, String tabla, String condicion, String nuevoValor) {
		 try {

	            Statement stm = dataSource.getConnection ().createStatement ();

	            int r = stm.executeUpdate 
	            		("UPDATE "+tabla+" SET "+campo+"='"+nuevoValor+"' WHERE "+condicion+"");

	        } catch (Exception e) {

	            e.printStackTrace ();
	            Assert.assertTrue ("Failure executing Insert...", e == null);
	            
	        }
	}
	
	public void Delete(BasicDataSource dataSource, String tabla) {
		 try {

	            PreparedStatement stm = dataSource.getConnection ().prepareStatement 
	            		("DELETE FROM "+tabla+"");
	            int r = stm.executeUpdate ();


	        } catch (Exception e) {

	            e.printStackTrace ();
	            Assert.assertTrue ("Failure executing Insert...", e == null);
	        }
		
	}

	private void writeResult (ResultSet rs) throws SQLException {

		// ResultSet is initially before the first data set
		while (rs.next ()) {

			// It is possible to get the columns via name
			// also possible to get the columns via the column number
			// which starts at 1
			// e.g. resultSet.getSTring (2);

			logger.info(rs.getString (1)+" "+rs.getString (2));//+" "+rs.getString (3));

		}
	}
}
