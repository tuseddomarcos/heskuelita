package com.capgemini.heskuelita.data;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import org.apache.log4j.Logger;
import org.junit.*;


public class StudentDataSourceTest {
	
	private Connection connection;
	private static final Logger logger = Logger.getLogger (StudentDataSourceTest.class);
	
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

		// ResultSet is initially before the first data set
        while (resultSet.next ()) {

        	// It is possible to get the columns via name
            // also possible to get the columns via the column number
            // which starts at 1
            // e.g. resultSet.getSTring (2);
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
    public void testCreate () {

        try {

            PreparedStatement pstm = this.connection.prepareStatement ("INSERT INTO public.student(\r\n" + 
            		"	id, name, birthday, sex, \"user\", pw, email)\r\n" + 
            		"	VALUES (?, ?, ?, ?, ?, ?, ?); ");

            pstm.setInt (1, 1 );
            pstm.setString (2, "cosme fulanito");
            pstm.setDate (3, new java.sql.Date(( new
                    		SimpleDateFormat("MM/dd/yyyy").parse("11/08/1989")).getTime()));
            pstm.setString (4, "m");
            pstm.setString (5, "cosme_fulanito");
            pstm.setString(6, "1234");
            pstm.setString(7, String.format("cosme_fulanito@gmail.com"));

            // Execute the insert.
            int r = pstm.executeUpdate ();

            Assert.assertTrue ("Failure executing Insert !!!", r > 0);

        } catch (Exception e) {

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing Insert...", e == null);
        }
    }
	
	@Test
    public void testRead () {

        try {

            Statement stm = this.connection.createStatement ();
            
            ResultSet resultSet = stm.executeQuery ("SELECT * from public.student");

            readResult (resultSet);

            Assert.assertTrue("The tables is empty !!!", !resultSet.isBeforeFirst ());

        } catch (Exception e) {

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing SELECT Into...", e == null);
        }
    }
	
	@Test
    public void testUpdate () {

        try {

            Statement stm = this.connection.createStatement ();
            
            int r = stm.executeUpdate ("UPDATE public.student SET email = '--';");

            Assert.assertTrue ("Failure executing Update !!!", r > 0);

        } catch (Exception e) {

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing Update...", e == null);
        }
    }
	
//	@Test
//    public void testDelete () {
//
//        try {
//
//            PreparedStatement stm = this.connection.prepareStatement ("DELETE FROM public.student");
//            int r = stm.executeUpdate ();
//
//            Assert.assertTrue("Failure executing Delete !!!", r > 0);
//
//        } catch (Exception e) {
//
//            e.printStackTrace ();
//            Assert.assertTrue ("Failure executing Delete...", e == null);
//        }
//    }
	
	@Test
    public void testTX () {

        Connection cnn = null;
        try {

            cnn =connection;

            cnn.setAutoCommit (false);

            cnn.createStatement ().
                    executeUpdate (String.
                            format ("INSERT INTO student (id, name, birthday, sex, \"user\", pw, email) VALUES ('%s', '%s', '%s', '%s', '%s')",
                                    1,
                            		"cosme fulano",
                                    "cosme@gmail.com",
                                    "1/9/1900",
                                    "m",
                                    "cosmefulano123",
                                    "1234"));

            cnn.createStatement ().
                    executeUpdate (String.
                    		format ("INSERT INTO student (id, name, birthday, sex, \"user\", pw, email) VALUES ('%s', '%s', '%s', '%s', '%s')",
                                    1,
                            		"cosme fulano",
                                    "cosme@gmail.com",
                                    "1/9/1900",
                                    "m",
                                    "cosmefulano123",
                                    "1234"));

            cnn.commit ();

        } catch (Exception e) {

            try {
                cnn.rollback ();
            } catch (Exception e2) {}

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing Insert...", e == null);
        }
    }
	
	@After
    public void destroy () throws Exception {

        connection.close();
    }
	
}
	