package com.capgemini.heskuelita.data;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.capgemini.heskuelita.beans.Teacher;
import java.sql.*;
import java.time.LocalDate;

public class TeacherDataTest {

	private DAOTeacher daoTeacher= new DAOTeacher();
    
    public TeacherDataTest() {
    	super();
    }
	
    @Before
    public void setUp() throws Exception{
	
    	daoTeacher.setUp();
    }
    
    
    //this test are made using DAOS
    //instead of creating querys in the same tests
    @Test
    public void testReadTeacher() {
    	
    	Assert.assertNotNull("There are teachers in table", daoTeacher.getTeachers());
    	
    }
    
    @Test
    public void testUpdatePerson () {

    	Assert.assertTrue("Row/s successfully updated", 
    			daoTeacher.updateTeachersPass("any") > 0);
    	
    }
    
    @Test
    public void testInsertTeacher() {
    	
    	Teacher teacher= new Teacher("Luca", "Modric", 26904145, 'M');
    	teacher.setPhone(1513999729);
    	teacher.setEmail("modric@yahoo.com");
    	teacher.setPassword("hacked");
    	teacher.setBirthdate(LocalDate.of(1987, 6, 24));
    	
    	Assert.assertTrue("Inserted executed successfully", 
    			daoTeacher.insertTeacher(teacher) == 1);
    	
    }
    
    @After
    public void destroy () throws Exception {

        daoTeacher.destroy ();
    }

}
