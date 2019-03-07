package com.capgemini.heskuelita.beans;
import java.sql.*;
import java.util.*;


import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.apache.commons.lang3.RandomStringUtils.*;


public class StudentDataTest {


    private BasicDataSource dataSource;

    
    private static final Logger logger = Logger.getLogger (DataSourceTest.class);


    public DataSourceTest() {

        super ();
    }


    private void writeResult (ResultSet rs) throws SQLException {

        // ResultSet is initially before the first data set
        while (rs.next ()) {

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


    @Before
    public void setup () throws Exception {

        // Create a new Datasource
        this.dataSource = new BasicDataSource ();

        dataSource.setUrl("jdbc:mysql://localhost:5432/heskuelita");
        dataSource.setUsername ("postgres");
        dataSource.setPassword ("admin");
        dataSource.setMinIdle (5);
        dataSource.setMaxIdle (10);
        dataSource.setMaxOpenPreparedStatements (100);
    }

    @Test
    public void testCreate () {

        try {

            PreparedStatement pstm = this.dataSource.getConnection ().prepareStatement ("INSERT INTO student VALUES (default, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            pstm.setString (1, "Facundo");
            pstm.setString (2, "Reyes");
            pstm.setDate(3, Date.valueOf(LocalDate.of(1995, 8, 8)));
            pstm.setString (4, "DNI");
            pstm.setString (5, "12345678");
            pstm.setString (6, "M");
            pstm.setString (7, "1548748987");
            pstm.setString (8, "Lavalle");
            pstm.setString (9, "825");
            pstm.setString (10, "1706");

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

            Statement stm = this.dataSource.getConnection ().createStatement ();

            // Result set get the result of the SQL query
            ResultSet resultSet = stm.executeQuery ("SELECT * from comments");

            Assert.assertTrue("The tables is empty !!!", resultSet.isBeforeFirst ());

            // Print the messages.
            writeResult (resultSet);

        } catch (Exception e) {

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing SELECT Into...", e == null);
        }
    }

    @Test
    public void testUpdate () {

        try {

            Statement stm = this.dataSource.getConnection ().createStatement ();

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

            PreparedStatement stm = this.dataSource.getConnection ().prepareStatement ("DELETE FROM comments");
            int r = stm.executeUpdate ();

            Assert.assertTrue("Failure executing Delete !!!", r > 0);

        } catch (Exception e) {

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing Delete...", e == null);
        }
    }

    @Test
    public void testTX () {

        Connection cnn = null;
        try {

            cnn = this.dataSource.getConnection ();

            cnn.setAutoCommit (false);

            cnn.createStatement ().
                    executeUpdate (String.
                            format ("INSERT INTO comments (name, lastname, bday, doctype, dni, sex, phone, add_st, add_num, add_zipc) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')",
                            		"facundo",
                                    "reyes",
                                    Date.valueOf(LocalDate.of(1995, 8, 8)),
                                    "DNI",
                                    "39171666"
                                    "M",
                                    "1123656123",
                                    "Charcas",
                                    "227",
                                    "2112"
                                    "raul.pena@gmail.com"));

            cnn.createStatement ().
                    executeUpdate (String.
                            format ("INSERT INTO comments (name, lastname, bday, doctype, dni, sex, phone, add_st, add_num, add_zipc) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')",
                                    "facundo",
                                    "reyes",
                                    Date.valueOf(LocalDate.of(1995, 8, 8)),
                                    "DNI",
                                    "39171666"
                                    "M",
                                    "1123656123",
                                    "Charcas",
                                    "227",
                                    "2112"
                                    "raul.pena@gmail.com"));

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

        this.dataSource.close ();
    }
}