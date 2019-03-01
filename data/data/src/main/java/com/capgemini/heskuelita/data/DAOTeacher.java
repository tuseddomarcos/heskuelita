package com.capgemini.heskuelita.data;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.Assert;

import com.capgemini.heskuelita.beans.Teacher;

public class DAOTeacher extends DAO{
	
	
	public Set<Teacher> getTeachers(){
		
		Set<Teacher> teachers= new HashSet<Teacher>();
		
		try {
    		Statement stm= getDataSource().getConnection().createStatement();
    		ResultSet resulSet= stm.executeQuery("SELECT * from Person where discriminator= 'TEACHER'");
    		
    		while (resulSet.next()) {
    			
        		String name= resulSet.getString("name");
        		String surname= resulSet.getString("surname");
        		int dni= resulSet.getInt("dni");
        		char gender= resulSet.getString("gender").charAt(0);
    			
    			teachers.add(new Teacher(name, surname, dni, gender));
    		}
    		    		
    	}
    	catch (Exception e) {
    		
            e.printStackTrace ();
    	}
		
		return teachers;
		
	}
	
	public int updateTeachersPass(String password) {
		
		int rowsUpdated = 0;
		
        try {

            PreparedStatement pstm = getDataSource().getConnection ().prepareStatement ("UPDATE person SET password=? where discriminator= 'TEACHER' ");
            pstm.setString(1, password);
            rowsUpdated= pstm.executeUpdate();

        } catch (Exception e) {

            e.printStackTrace ();
        }
        
        return rowsUpdated;
	}
	
	public int insertTeacher(Teacher teacher) {
		
		int rowsInserted= 0;
		
        try {

            PreparedStatement pstm = getDataSource().getConnection ().prepareStatement ("INSERT INTO person VALUES (default, ?, ?, ?, ?, ?, ?, ?, ?, 'TEACHER')");

            pstm.setString (1, teacher.getFirstName());
            pstm.setString (2, teacher.getLastName());
            pstm.setInt(3, teacher.getDni());
            pstm.setInt(4, teacher.getPhone());
            pstm.setString (5, teacher.getEmail());
            pstm.setString(6, teacher.getPassword());
            pstm.setString(7, String.valueOf(teacher.getGender()));
            pstm.setDate(8, Date.valueOf(teacher.getBirthdate()));

            rowsInserted= pstm.executeUpdate ();

        } catch (Exception e) {

            e.printStackTrace ();
        }
        
        return rowsInserted;
	}
	

}
