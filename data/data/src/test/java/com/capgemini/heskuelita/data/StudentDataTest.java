package com.capgemini.heskuelita.data;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.sql.*;
import static org.apache.commons.lang3.RandomStringUtils.*;
import java.time.LocalDate;


public class StudentDataTest {

	private DAOStudent daoStudent= new DAOStudent();
    private static final Logger logger= Logger.getLogger(StudentDataTest.class);
    
    public StudentDataTest() {
    	super();
    }
    
    private void writeResult(ResultSet rs) throws SQLException {
    	
    	while(rs.next()) {
    		
    		String name= rs.getString("name");
    		String surname= rs.getString("surname");
    		int dni= rs.getInt("dni");
    		int phone= rs.getInt("phone");
    		String email= rs.getString("email");
    		
    		logger.info(String.format("Name: %s", name));
    		logger.info(String.format("Surname: %s", surname));
    		logger.info(String.format("DNI: %s", dni));
    		logger.info(String.format("Phone: %s", phone));
    		logger.info(String.format("Email: %s", email));
    	}
    }
    
    @Before
    public void setUp() throws Exception{
    	daoStudent.setUp();
    }
    
    //tests are independent from each other
    //there are already two students inserted manually
    @Test
    public void testReadStudents() {
    	
    	try {
    		Statement stm= daoStudent.getDataSource().getConnection().createStatement();
    		ResultSet resulSet= stm.executeQuery("SELECT * from Person where discriminator= 'STUDENT'");
    		
    		Assert.assertTrue("There are students in the table", resulSet.next());
    		
    		writeResult(resulSet);
    		
    	}
    	catch (Exception e) {
    		
            e.printStackTrace ();
            Assert.assertTrue ("Failure executing SELECT....", e == null);
    	}
    }
    
    @Test
    public void testInsertStudent() {
    	
    	try {
    		Statement stm= daoStudent.getDataSource().getConnection().createStatement();
    		
    		int rows= stm.executeUpdate("insert into public.person values (default, "
					+ "'Lionel', 'Messi', 20987645, 1563289763, "
					+ "'liomessi@gmail.com', 'anything', 'M', "
					+ "'1987-06-24', 'STUDENT')");
    		
    		Assert.assertTrue("Insert executed successfully", rows == 1);
    	}
    	catch(Exception e){
    		
            e.printStackTrace ();
            Assert.assertTrue ("Failure executing Insert...", e == null);
    	}
    }
    

    //there are already two students inserted 
    //that way tests doesnt affect each other
    @Test
    public void testUpdateStudent () {

        try {

            Statement stm = daoStudent.getDataSource().getConnection ().createStatement ();

            int updatedRows = stm.executeUpdate ("UPDATE person SET password= '' where discriminator= 'STUDENT' ");

            Assert.assertTrue ("Row/s successfully updated", updatedRows > 0);

        } catch (Exception e) {

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing Update...", e == null);
        }
    }
    
    @Test
    public void testSecondInsert () {

        try {

            PreparedStatement pstm = daoStudent.getDataSource().getConnection ().prepareStatement ("INSERT INTO person VALUES (default, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            pstm.setString (1, "Cristiano");
            pstm.setString (2, "Ronaldo");
            pstm.setInt(3, 20987345);
            pstm.setInt(4, 1567893361);
            pstm.setString (5, "ronaldo@hotmail.com");
            pstm.setString(6, "bla");
            pstm.setString(7, "M");
            pstm.setDate(8, Date.valueOf(LocalDate.of(1985, 2, 5)));
            pstm.setString(9, "STUDENT");

            int rows= pstm.executeUpdate ();

            Assert.assertTrue ("Insert executed successfully", rows == 1);

        } catch (Exception e) {

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing Insert...", e == null);
        }
    }

    //delete only one student so that it doesnt affect other tests
    @Test
    public void testDeleteStudent () {

        try {

            Statement stm = daoStudent.getDataSource().getConnection ().createStatement();

            int deletedRows = stm.executeUpdate ("delete from person where id_person= \n" + 
            		"(SELECT id_person from Person where discriminator= 'STUDENT' limit 1)");

            Assert.assertTrue("Success executing Delete !!!", deletedRows == 1 );

        } catch (Exception e) {

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing Delete...", e == null);
        }
    }
    
    @After
    public void destroy () throws Exception {
    	daoStudent.destroy();
    }
    
}
