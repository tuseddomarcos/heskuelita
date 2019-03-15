package com.capgemini.heskuelita.data;

import com.capgemini.heskuelita.data.entity.StudentAnnotation;
import com.capgemini.heskuelita.data.entity.UserAnnotation;

import java.util.List;

public interface IStudentDao {


    void create (String first_name, String last_name, String type_id, String number_id, String gender, String phone_number);
    List<StudentAnnotation> findAll();
    UserAnnotation findById (int id);
    void update (StudentAnnotation user);
    boolean remove (StudentAnnotation us);

}
