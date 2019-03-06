package com.capgemini.heskuelita.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentSelect {

	//Connecting
    public static Connection connect() throws SQLException {
    	final String url = "jdbc:postgresql://localhost/postgres";
        final String user = "postgres";
        final String password = "kira1234";
        return DriverManager.getConnection(url, user, password);
    }
 
    
    //Show all stuents
    public void getStudents() {
 
        String SQL = "SELECT stu_id, stu_name, stu_last_name, stu_birthdate, stu_document_type, stu_identification, stu_phone, "
        		+ "stu_sex, stu_city, stu_adress, stu_zipcode, stu_active  FROM student";
 
        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) {
            // display actor information
        	displayStudent(rs);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    

    //Get Students Quantity
    public static int getStudentCount() {
        String SQL = "SELECT count(*) FROM actor";
        int count = 0;
 
        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
 
        return count;
    }
    
	
    //Find Max ID
    public static int maxId() {
        String SQL = "SELECT max(stu_id) FROM student";
        int max = 0;
 
        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            max = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
 
        return max;
    }
 
    //Display students format
    private static void displayStudent(ResultSet rs) throws SQLException {
        while (rs.next()) {
            System.out.println(rs.getString("stu_id") + "\t"
                    + rs.getString("stu_name") + "\t"
                    + rs.getString("stu_last_name")+ "\t"
                    + rs.getString("stu_birthdate") + "\t"
                    + rs.getString("stu_document_type") + "\t"
                    + rs.getString("stu_identification") + "\t"
                    + rs.getString("stu_phone") + "\t"
                    + rs.getString("stu_sex") + "\t"
                    + rs.getString("stu_city") + "\t"
                    + rs.getString("stu_adress") + "\t"
                    + rs.getString("stu_zipcode") + "\t"
                    + rs.getString("stu_active") + "\t"
            		);          
 
        }
    }
 
    
    //find student by ID
    public static void findStudentByID(int studentId) {
        String SQL = "SELECT stu_id, stu_name, stu_last_name, stu_birthdate, stu_document_type, stu_identification, stu_phone,"
        		+ " stu_sex, stu_city, stu_adress, stu_zipcode, stu_active "
                + "FROM student "
                + "WHERE stu_id = ?";
 
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
 
            pstmt.setInt(1, studentId);
            ResultSet rs = pstmt.executeQuery();
            displayStudent(rs);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    //find student by IDENTIFICATION
    public static void findStudentByIdentification(int identification) {
        String SQL = "SELECT stu_id, stu_name, stu_last_name, stu_birthdate, stu_document_type, stu_identification, stu_phone, "
        		+ "stu_sex, stu_city, stu_adress, stu_zipcode, stu_active "
                + "FROM student "
                + "WHERE stu_identification = ?";
 
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
 
            pstmt.setInt(1, identification);
            ResultSet rs = pstmt.executeQuery();
            displayStudent(rs);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
 


    //Execute SELECT functions
    public static void main(String[] args) {
        StudentSelect select = new StudentSelect();
        select.getStudents();
        StudentSelect.findStudentByID(1);
        StudentSelect.findStudentByIdentification(34567890);
    }
}
