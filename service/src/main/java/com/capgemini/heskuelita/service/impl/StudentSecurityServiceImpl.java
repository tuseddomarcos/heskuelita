package com.capgemini.heskuelita.service.impl;

import com.capgemini.heskuelita.data.IStudentDao;
import com.capgemini.heskuelita.data.entity.StudentAnnotation;
import com.capgemini.heskuelita.service.IStuentSecurityService;



public class StudentSecurityServiceImpl implements IStuentSecurityService {

    IStudentDao studentDao;

    public StudentSecurityServiceImpl(IStudentDao studentDao) {

        super();

        this.studentDao = studentDao;
    }

    @Override
    public void NewStudent(StudentAnnotation student) throws SecurityException {


        try {
            this.studentDao.create (student.getFirst_name(),student.getFirst_name(), student.getType_id() , student.getNumber_id() ,
                    student.getGender(), student.getPhone_number());
        }catch (Exception e){
            throw new SecurityException(e);
        }


    }


}
