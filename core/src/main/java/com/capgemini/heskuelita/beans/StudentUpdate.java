package com.capgemini.heskuelita.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentUpdate {


	//Connecting..
    public static Connection connect() throws SQLException {
    	final String url = "jdbc:postgresql://localhost/postgres";
        final String user = "postgres";
        final String password = "kira1234";
        return DriverManager.getConnection(url, user, password);
    }
 

	
    //Update Student's IDENTIFICATION based on his ID
    public int updateIdentification(long identification, long  id) {
        String SQL = "UPDATE student "
                + "SET stu_identification = ? "
                + "WHERE stu_id = ?";
        int affectedrows = 0;
 
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
 
            pstmt.setLong(1, identification);
            pstmt.setLong(2, id);
            affectedrows = pstmt.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }
 

    //Update Student's NAME based on his identidication
    public int updateName(long identification, String Name) {
        String SQL = "UPDATE student "
                + "SET stu_name = ? "
                + "WHERE stu_identification = ?";
        int affectedrows = 0;
 
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
 
            pstmt.setString(1, Name);
            pstmt.setLong(2, identification);
            affectedrows = pstmt.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }
 

    //Update Student's LASTNAME based on his identidication
    public int updateLastName(long identification, String lastName) {
        String SQL = "UPDATE student "
                + "SET stu_last_name = ? "
                + "WHERE stu_identification = ?";
        int affectedrows = 0;
 
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
 
            pstmt.setString(1, lastName);
            pstmt.setLong(2, identification);
            affectedrows = pstmt.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }
 
    

    //Update Student's BIRTHDATE based on his identidication
    public int updateBirthdate(long identification, String birthdate) {
        String SQL = "UPDATE student "
                + "SET stu_birthdate = ? "
                + "WHERE stu_identification = ?";
        int affectedrows = 0;
 
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
 
            pstmt.setString(1, birthdate);
            pstmt.setLong(2, identification);
            affectedrows = pstmt.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }
    

    //Update Student's DOCUMENT TYPE based on his identidication
    public int updateDocumentType(long identification, String documentType) {
        String SQL = "UPDATE student "
                + "SET stu_document_type = ? "
                + "WHERE stu_identification = ?";
        int affectedrows = 0;
 
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
 
            pstmt.setString(1, documentType);
            pstmt.setLong(2, identification);
            affectedrows = pstmt.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }
	

    //Update Student's PHONE based on his identidication
    public int updatePhone(long identification, int phone) {
        String SQL = "UPDATE student "
                + "SET stu_phone = ? "
                + "WHERE stu_identification = ?";
        int affectedrows = 0;
 
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
 
            pstmt.setInt(1, phone);
            pstmt.setLong(2, identification);
            affectedrows = pstmt.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }
	

    //Update Student's SEX based on his identidication
    public int updateSex(long identification, char sex) {
        String SQL = "UPDATE student "
                + "SET stu_sex = ? "
                + "WHERE stu_identification = ?";
        int affectedrows = 0;
 
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
 
            pstmt.setString(1, String.valueOf(sex));
            pstmt.setLong(2, identification);
            affectedrows = pstmt.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }
    

    //Update Student's CITY based on his identidication
    public int updateCity(long identification, String city) {
        String SQL = "UPDATE student "
                + "SET stu_city = ? "
                + "WHERE stu_identification = ?";
        int affectedrows = 0;
 
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
 
            pstmt.setString(1, city);
            pstmt.setLong(2, identification);
            affectedrows = pstmt.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }
    

    //Update Student's ADRESS based on his identidication
    public int updateAdress(long identification, String adress) {
        String SQL = "UPDATE student "
                + "SET stu_adress = ? "
                + "WHERE stu_identification = ?";
        int affectedrows = 0;
 
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
 
            pstmt.setString(1, adress);
            pstmt.setLong(2, identification);
            affectedrows = pstmt.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }

    

    //Update Student's ZIPCODE based on his identidication
    public int updateZipcode(long identification, int zipcode) {
        String SQL = "UPDATE student "
                + "SET stu_zipcode = ? "
                + "WHERE stu_identification = ?";
        int affectedrows = 0;
 
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
 
            pstmt.setInt(1, zipcode);
            pstmt.setLong(2, identification);
            affectedrows = pstmt.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }
    
    
	
    
    
    //Execute UPDATE functions
    public static void main(String[] args) {
        StudentUpdate update = new StudentUpdate();
        int rows = 0;
        
    	//Changing information based on one identification number
        long identification = 34567890;
                
        String  newName = "Becky";
        String newLastName = "Zitto";
        String newBirthdate = "2000-01-01";
        String newDocumentType = "Pasaprt";
        int newPhone = 44444444;
        char newSex = 'M';
        String newCity = "Bariloche";
        String newAdress = "Calle Falsa 123";
    	int newZipcode = 159;
    	
        rows = update.updateName(identification, newName);
        rows = update.updateLastName(identification, newLastName);
        rows = update.updateBirthdate(identification, newBirthdate);
        rows = update.updateDocumentType(identification, newDocumentType);
        rows = update.updatePhone(identification, newPhone);
        rows = update.updateSex(identification, newSex);
        rows = update.updateCity(identification, newCity);
        rows = update.updateAdress(identification, newAdress);
        rows = update.updateZipcode(identification, newZipcode);
        
        if (rows>0) {
        	System.out.println(
				  String.format("Updated Student´s information: \n\n"
					  		+ "Identification = %d \n"
					  		+ "Name = %s \n"
					  		+ "LastName = %s \n"
					  		+ "Birthdate = %s \n"
					  		+ "DocumentType = %s \n"
					  		+ "Phone = %d \n"
					  		+ "Sex = %s \n"
					  		+ "City = %s \n"
					  		+ "Adress = %s \n"
					  		+ "Zipcode = %d \n"			  		
				  		
				  		, identification, newName, newLastName,  newBirthdate, newDocumentType, newPhone, newSex , newCity , newAdress, newZipcode  ) 
				  );
        }else {
        	System.out.println("No cahnges where made");
        }
  
        
        //Changing idedntification number based on id number
        long id = 1;
    	int newIdentification = 33333333;
        rows = update.updateIdentification(newIdentification, id);
        if (rows>0) {
        	System.out.println(
				  String.format("Updated Student´s information: \n\n"
					  		+ "Identification = %d \n", newIdentification));
        }else {
        	System.out.println("No cahnges where made");
        }
      
        
        
    }
	
	
	
	
	
	
}
