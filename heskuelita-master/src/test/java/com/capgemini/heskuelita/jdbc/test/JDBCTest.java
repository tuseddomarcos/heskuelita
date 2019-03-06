package com.capgemini.heskuelita.jdbc.test;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import org.junit.*;

public class JDBCTest {
	   private Connection cnn;

	    // Logger object.
	  private static final Logger logger = Logger.getLogger (JDBCTest.class.toString());
	  
	    public JDBCTest () {

	        super ();
	    }


	    private void writeResult (ResultSet resultSet) throws SQLException {

	        // ResultSet is initially before the first data set
	        while (resultSet.next ()) {

	            // It is possible to get the columns via name
	            // also possible to get the columns via the column number
	            // which starts at 1
	            // e.g. resultSet.getSTring (2);
	       
	            String first_name = resultSet.getString ("first_name");
	            String last_name = resultSet.getString ("last_name");
	            String type_identificacion = resultSet.getString ("type_identificacion");
	            Integer personal_id  = resultSet.getInt ("personal_id");
	            String gender  = resultSet.getString ("gender");
	            Integer phone_numbre  = resultSet.getInt ("phone_numbre");
	            
	           
	            logger.info (String.format ("First_name: %s", first_name));
	            logger.info (String.format ("Last_name: %s", last_name));
	            logger.info (String.format ("Type_id: %s", type_identificacion));
	            logger.info (String.format ("Personal_id: %d", personal_id ));
	            logger.info (String.format ("Gender: %s", gender));
	            logger.info (String.format ("Phone: %d", phone_numbre));
	            
	        }
	    }


	    @BeforeClass
	    public static void setupAll () throws Exception {

	        // Register the driver.
	        Class.forName ("org.postgresql.Driver");
	    }

	    @Before
	    public void setup () throws Exception {

	        // Create a new connection.
	        this.cnn = DriverManager.getConnection ("jdbc:postgresql://localhost:5432/heskuelita", "postgres", "marcos36634093");
	    }	

	  
	    public void testCreate () {

	        try {

	            PreparedStatement pstm = this.cnn.prepareStatement ("INSERT INTO student (id_stdent, first_name, last_name, type_identificacion, personal_id, gender, phone_numbre) VALUES (default, ?, ?, ?, ?, ?, ?)");
	     
	            pstm.setString (1, randomAlphabetic (12));
	            pstm.setString (2, randomAlphabetic (14));
	            pstm.setString (3, randomAlphabetic (1));
	            pstm.setInt    (4, (Integer.parseInt((randomNumeric(5)))));
	            pstm.setString (5, randomAlphanumeric (1));
	            pstm.setInt (6, (Integer.parseInt((randomNumeric(4)))));

	        } catch (Exception e) {

	            e.printStackTrace ();
	            Assert.assertTrue ("Failure executing Insert...", e == null);
	        }
	    }

	   
	    public void testRead () {

	        try {

	            Statement stm = this.cnn.createStatement ();

	            // Result set get the result of the SQL query
	            ResultSet resultSet = stm.executeQuery ("SELECT * from student");

	            // Print the messages.
	            writeResult (resultSet);

	            Assert.assertTrue("The tables is empty !!!", !resultSet.isBeforeFirst ());

	        } catch (Exception e) {

	            e.printStackTrace ();
	            Assert.assertTrue ("Failure executing SELECT Into...", e == null);
	        }
	    }

	  
	    public void testUpdate () {

	        try {

	            Statement stm = this.cnn.createStatement ();

	            int r = stm.executeUpdate ("UPDATE student SET First_name = '--'");

	            Assert.assertTrue ("Failure executing Update !!!", r > 0);

	        } catch (Exception e) {

	            e.printStackTrace ();
	            Assert.assertTrue ("Failure executing Update...", e == null);
	        }
	    }

	  
	    public void testDelete () {

	        try {

	            PreparedStatement stm = this.cnn.prepareStatement ("DELETE FROM student");
	            int r = stm.executeUpdate ();

	            Assert.assertTrue("Failure executing Delete !!!", r > 0);

	        } catch (Exception e) {

	            e.printStackTrace ();
	            Assert.assertTrue ("Failure executing Delete...", e == null);
	        }
	    }

	 
	    public void testTX () {

	        try {

	            this.cnn.setAutoCommit (false);

	            this.cnn.createStatement ().
	                    executeUpdate ("DELETE FROM student");

	            this.cnn.commit ();

	        } catch (Exception e) {

	            try {
	                this.cnn.rollback ();
	            } catch (Exception e2) {}

	            e.printStackTrace ();
	            Assert.assertTrue ("Failure executing Insert...", e == null);
	        }
	    }

	    @After
	    public void destroy () throws Exception {

	        this.cnn.close ();
	    }

}
