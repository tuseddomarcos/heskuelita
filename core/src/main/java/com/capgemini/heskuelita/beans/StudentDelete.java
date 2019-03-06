package com.capgemini.heskuelita.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 

public class StudentDelete {

	 //Connecting..
    public static Connection connect() throws SQLException {
    	final String url = "jdbc:postgresql://localhost/postgres";
        final String user = "postgres";
        final String password = "kira1234";
        return DriverManager.getConnection(url, user, password);
    }

    
    //Delete students by ID
    public int deletebyId(int id) {
        String SQL = "DELETE FROM student WHERE stu_id = ?";
 
        int affectedrows = 0;
 
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
 
            pstmt.setInt(1, id);
 
            affectedrows = pstmt.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }

    
    //Delete students by Identification
    public int deletebyIdentification(int identification) {
        String SQL = "DELETE FROM student WHERE stu_identification = ?";
 
        int affectedrows = 0;
 
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
 
            pstmt.setInt(1, identification);
 
            affectedrows = pstmt.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }
    
    
    //Delete ALL students
    public int deleteAll() {
    	
        String SQL = "DELETE FROM student WHERE stu_id > 0";
    	long id = 0;
        int affectedrows = 0;

        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            affectedrows =  StudentSelect.getStudentCount();

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
            	id = 0;
	            pstmt.setLong(1, id);
	            id++;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }


    
    //Executing DELETE functions
    public static void main(String[] args) {
    	int rows = 0;
        StudentDelete delete = new StudentDelete();
     //   rows = delete.deletebyId (1);
     //   rows = delete.deletebyIdentification (34567890);
        rows = delete.deleteAll();
        System.out.println(
				  String.format("Deleted rows %d", rows ) 
				  );
    }
    
}