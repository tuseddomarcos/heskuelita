package com.capgemini.heskuelita.beans;
import java.sql.*;

import org.apache.log4j.Logger;
import org.junit.*;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;

public class JDBCConTest {
		
	   private Connection cnn;

	    // Logger object.
	    private static final Logger logger = Logger.getLogger (JDBCConTest.class);

	    public JDBCConTest () {

	    
	    	
	    }    

	    private void writeResult (ResultSet resultSet) throws SQLException {

	        // ResultSet is initially before the first data set
	        while (resultSet.next ()) {

	        	String name= rs.getString("name");
	    		String lastname= rs.getString("lastname");
	    		LocalDate bday= rs.getDate("bday");
	    		String doctype= rs.getString("doctype")
	    		String dni= rs.getInt("dni");
	    		char sex= resulSet.getString("sex").charAt(0);
	    		ContactData contactdata.phone= rs.getString("phone");
	    		ContactData contactdata.add_st= rs.getString("street");
	    		ContactData contactdata.add_num= rs.getString("strnumber");
	    		ContactData contactdata.add_zipc= rs.getString("zipcode");
	    		
	    		logger.info(String.format("Name: %s", name));
	    		logger.info(String.format("Lastname: %s", lastname));
	    		logger.info(String.format("Birthday: %s", bday));
	    		logger.info(String.format("Dnitype: %s", doctype));
	    		logger.info(String.format("Dni: %s", dni));
	    		logger.info(String.format("Sex: %s", sex));
	    		logger.info(String.format("Phone: %s", phone));
	    		logger.info(String.format("Street: %s", add_st));
	    		logger.info(String.format("Streetnum: %s", add_num));
	    		logger.info(String.format("Zipcode: %s", add_zipc));
	    		
	        }
	    }

////////////
	    
	    //ANTES DE COMENZAR
	    @BeforeClass
	    public static void setupAll () throws Exception {

	        // Register the driver.
	        Class.forName ("org.postgresql.Driver");	       
	    }

////////////
	    
	    @Before
	    public void setup () throws Exception {

	        // Create a new connection.
	        this.cnn = DriverManager.getConnection ("jdbc:postgresql://localhost:5432/heskuelita", "postgres", "admin");
	        System.out.print("Conectado");
	    }

////////////
	    
	    @Test
	    public void testCreate () {

	        try {

	            PreparedStatement pstm = this.cnn.prepareStatement ("INSERT INTO person (ID, FIRSTNAME, LASTNAME, GENDER, PHONE) VALUES (?, ?, ?, ?, ?)");

	            pstm.setString (1, randomNumeric (10));
	            //pstm.setString (2, String.format ("%s@gmail.com", randomAlphabetic (10)));
	            pstm.setString (2, randomAlphabetic (20));
	            pstm.setString (3, randomAlphabetic (20));
	            pstm.setString (4, randomAlphanumeric (10));
	            pstm.setString (5, randomNumeric (20));

	            // Execute the insert.
	            int r = pstm.executeUpdate ();

	            Assert.assertTrue ("Failure executing Insert !!!", r > 0);

	        } catch (Exception e) {

	            e.printStackTrace ();
	            Assert.assertTrue ("Failure executing Insert...", e == null);
	        }
	    }
	    
////////////

	    @Test
	    public void testRead () {
	    	
	    	//Testing

	        try {	        	

	            Statement stm = this.cnn.createStatement ();

	            // Result set get the result of the SQL query
	            ResultSet resultSet = stm.executeQuery ("SELECT * from PERSON");

	            // Print the messages.
	            writeResult (resultSet);

	            Assert.assertTrue("The tables is empty !!!", !resultSet.isBeforeFirst ());

	        } catch (Exception e) {
	            e.printStackTrace ();
	            Assert.assertTrue ("Failure executing SELECT FROM TABLE...", e == null);
	        }
	    }

	    
////////////	    
	    
	    @Test
	    public void testUpdate () {

	        try {

	            Statement stm = this.cnn.createStatement ();

	            int r = stm.executeUpdate ("update person set firstname='name' where id=1");

	            Assert.assertTrue ("Failure executing Update !!!", r > 0);

	        } catch (Exception e) {
	            e.printStackTrace ();
	            Assert.assertTrue ("Failure executing Update...", e == null);
	        }
	    }

	    
////////////	    
	    
	    
	    @Test
	    public void testDelete () {

	        try {

	            PreparedStatement stm = this.cnn.prepareStatement ("DELETE * from person where id=1");
	            int r = stm.executeUpdate ();

	            Assert.assertTrue("Failure executing Delete !!!", r > 0);

	        } catch (Exception e) {

	            e.printStackTrace ();
	            Assert.assertTrue ("Failure executing Delete...", e == null);
	        }
	    }

	    
////////////
	    
	    @Test
	    public void testTX () {

	        try {
	            this.cnn.setAutoCommit (false);
	            this.cnn.createStatement ().
	                    executeUpdate ("DELETE FROM comments");
	            int i = 1/0;
	            this.cnn.commit ();

	        } catch (Exception e) {
	            try {
	                this.cnn.rollback ();
	            } catch (Exception e2) {}

	            e.printStackTrace ();
	            Assert.assertTrue ("Failure executing Insert...", e == null);
	        }
	    }

	    
	    
////////////
	    
	    @After
	    public void destroy () throws Exception {
	        this.cnn.close ();
	    }

}
