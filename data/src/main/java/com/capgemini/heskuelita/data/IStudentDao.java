package com.capgemini.heskuelita.data;

import com.capgemini.heskuelita.data.entity.StudentAnnotation;
import com.capgemini.heskuelita.data.entity.UserAnnotation;

import java.util.List;

public interface IStudentDao {


    List<StudentAnnotation> findAll();
    UserAnnotation findById (int id);
    void update (StudentAnnotation user);
    boolean remove (StudentAnnotation us);

}
