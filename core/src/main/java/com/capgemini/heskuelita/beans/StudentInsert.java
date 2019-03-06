package com.capgemini.heskuelita.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;


public class StudentInsert {


    public static Connection connect() throws SQLException {
    	final String url = "jdbc:postgresql://localhost/postgres";
        final String user = "postgres";
        final String password = "kira1234";
        return DriverManager.getConnection(url, user, password);
    }
    
	public long insertStudent(Student student) {
		
        String SQL = "INSERT INTO student(stu_id, stu_name, stu_last_name, stu_birthdate, stu_document_type, stu_identification, stu_phone, stu_sex, stu_city, stu_adress, stu_zipcode, stu_active)"
        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
 
        long id = student.getId () +1;
        student.setId(id);
 
        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL,
                Statement.RETURN_GENERATED_KEYS)) {

            pstmt.setLong(1, student.getId());
            pstmt.setString(2, student.getName());
            pstmt.setString(3, student.getLastName());
            pstmt.setDate(4, null );
            pstmt.setString(5, student.getDocumentType());
            pstmt.setInt(6, student.getIdentification());
            pstmt.setInt(7, student.getPhone());
            pstmt.setString(8, String.valueOf(student.getSex()) );
            pstmt.setString(9, student.getCity());
            pstmt.setString(10, student.getAdress());
            pstmt.setInt(11, student.getZipcode());
            pstmt.setBoolean(12, student.getActive());
 

            int affectedRows = pstmt.executeUpdate();
            // check the affected rows 
            if (affectedRows > 0) {
                // get the ID back
                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        id = rs.getLong(1);
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return id;
    }
	


	public static void main(String[] args) {
		
		StudentInsert insert = new StudentInsert ();
		long id = StudentSelect.maxId(); 
		
		
		Student student = new Student(id ,"Lucia","Gomez", LocalDate.of(1999, 07, 23), "DNI", 34567890, 46952156, 'F', "Capital Federal", "Corrientes 2345", 1235);
		id = insert.insertStudent(student);
		System.out.println(
				  String.format ("Added Student´s information: \n\n"
				  		+ "Id = %d \n"
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
				  		,id, student.getIdentification(), student.getName(), student.getLastName(), student.getBirthdate(), student.getDocumentType()
				  		,student.getPhone(), student.getSex(), student.getCity(),student.getAdress(), student.getZipcode()  ) 
				  );
		
		
		
		Student student2 = new Student(id ,"Carlos","Gomez", LocalDate.of(1999, 07, 23), "DNI", 34567890, 46952156, 'F', "Capital Federal", "Corrientes 2345", 1235);
		id = insert.insertStudent(student2);
		System.out.println(
				  String.format("Added Student´s information: \n\n"
					  		+ "Id = %d \n"
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
					  		,id, student2.getIdentification(), student2.getName(), student2.getLastName(), student2.getBirthdate(), student2.getDocumentType()
					  		,student2.getPhone(), student2.getSex(), student2.getCity(),student2.getAdress(), student2.getZipcode()  ) 
				  );
		
	
	}
}

