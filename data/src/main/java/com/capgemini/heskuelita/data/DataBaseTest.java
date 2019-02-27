package com.capgemini.heskuelita.data;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

import java.sql.*;
import java.time.LocalDate;
import org.apache.log4j.Logger;
import org.junit.*;


public class DataBaseTest {

	private Connection connection;
	private static final Logger logger = Logger.getLogger (DataBaseTest.class);
	
	@BeforeClass
    public static void setupAll () throws Exception {

        // Register the driver.
        Class.forName ("org.postgresql.Driver");
    }
	
	@Before
    public void setup () throws Exception {

        // Create a new connection.
        this.connection = DriverManager.getConnection ("jdbc:postgresql://localhost:5432/heskuelita", "postgres", "admin");
    }
	
	private void readResult (ResultSet resultSet) throws SQLException {

        while (resultSet.next ()) {

            Integer id = resultSet.getInt ("student id");
            String name = resultSet.getString ("name");
            LocalDate birthday = resultSet.getDate ("birthday").toLocalDate();
            String sex = resultSet.getString("sex");
            String user = resultSet.getString("user");
            String pw = resultSet.getString("password");
            
            logger.info (String.format ("Student id: %s", id));
            logger.info (String.format ("Student name: %s", name));
            logger.info (String.format ("Student birthday: %s", birthday));
            logger.info (String.format ("Student sex: %s", sex));
            logger.info (String.format ("Student user: %s", user));
            logger.info (String.format ("Student password: %s", pw));
            
        }
        
	}
	
	@Test
    public void testRead () {

        try {

            Statement stm = this.connection.createStatement ();
            
            ResultSet resultSet = stm.executeQuery ("SELECT * from student");

            readResult (resultSet);

            Assert.assertTrue("The tables is empty !!!", !resultSet.isBeforeFirst ());

        } catch (Exception e) {

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing SELECT Into...", e == null);
        }
    }
	
	@Test
    public void testCreate () {

        try {

            PreparedStatement pstm = this.connection.prepareStatement ("INSERT INTO student (MYUSER, EMAIL, WEBPAGE, SUMMARY, COMMENTS) VALUES (?, ?, ?, ?, ?)");

            pstm.setString (1, randomNumeric (10));
            pstm.setString (2, String.format ("%s@gmail.com", randomAlphabetic (10)));
            pstm.setString (3, randomAlphabetic (20));
            pstm.setString (4, randomAlphanumeric (10));
            pstm.setString (5, randomAlphanumeric (50));

            // Execute the insert.
            int r = pstm.executeUpdate ();

            Assert.assertTrue ("Failure executing Insert !!!", r > 0);

        } catch (Exception e) {

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing Insert...", e == null);
        }
    }
	
}
	