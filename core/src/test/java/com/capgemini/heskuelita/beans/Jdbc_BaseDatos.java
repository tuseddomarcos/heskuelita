package com.capgemini.heskuelita.beans;


import java.sql.*;

import org.apache.log4j.Logger;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;

import org.junit.*;


public class Jdbc_BaseDatos {


    private Connection cnn;


    // Logger object.
    private static final Logger logger = Logger.getLogger (Jdbc_BaseDatos.class);


    public Jdbc_BaseDatos () {

        super ();
    }


    private void writeResult (ResultSet resultSet) throws SQLException {

        // ResultSet is initially before the first data set
        while (resultSet.next ()) {

            // It is possible to get the columns via name
            // also possible to get the columns via the column number
            // which starts at 1
            // e.g. resultSet.getSTring (2);
            String    user = resultSet.getString ("myuser");
            String email   = resultSet.getString ("email");
            String website = resultSet.getString ("webpage");
            String summary = resultSet.getString ("summary");
            String comment = resultSet.getString ("comments");

            logger.info (String.format ("User: %s", user));
            logger.info (String.format ("Email: %s", email));
            logger.info (String.format ("Website: %s", website));
            logger.info (String.format ("summary: %s", summary));
            logger.info (String.format ("Comment: %s", comment));
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
        this.cnn = DriverManager.getConnection ("jdbc:postgresql://localhost:5432/heskuelita", "postgres", "dcd16cP_");
    }

    @Test
    public void testCreate () {

        try {

            PreparedStatement pstm = this.cnn.prepareStatement ("INSERT INTO comments (MYUSER, EMAIL, WEBPAGE, SUMMARY, COMMENTS) VALUES (?, ?, ?, ?, ?)");

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

    @Test
    public void testRead () {

        try {

            Statement stm = this.cnn.createStatement ();

            // Result set get the result of the SQL query
            ResultSet resultSet = stm.executeQuery ("SELECT * from comments");

            // Print the messages.
            writeResult (resultSet);

            Assert.assertTrue("The tables is empty !!!", !resultSet.isBeforeFirst ());

        } catch (Exception e) {

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing SELECT Into...", e == null);
        }
    }

    @Test
    public void testUpdate () {

        try {

            Statement stm = this.cnn.createStatement ();

            int r = stm.executeUpdate ("UPDATE comments SET summary = '--'");

            Assert.assertTrue ("Failure executing Update !!!", r > 0);

        } catch (Exception e) {

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing Update...", e == null);
        }
    }

    @Test
    public void testDelete () {

        try {

            PreparedStatement stm = this.cnn.prepareStatement ("DELETE FROM comments");
            int r = stm.executeUpdate ();

            Assert.assertTrue("Failure executing Delete !!!", r > 0);

        } catch (Exception e) {

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing Delete...", e == null);
        }
    }

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

    @After
    public void destroy () throws Exception {

        this.cnn.close ();
    }
}