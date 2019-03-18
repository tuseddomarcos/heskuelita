package com.capgemini.heskuelita.data.impl;

import com.capgemini.heskuelita.data.IStudentDao;
import com.capgemini.heskuelita.data.entity.StudentAnnotation;
import com.capgemini.heskuelita.data.entity.UserAnnotation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class StudentDaoHibernate implements IStudentDao {

    private static SessionFactory sessionFactory;

    private static final Logger logger = LoggerFactory.getLogger (StudentDaoHibernate.class);


    public  StudentDaoHibernate(SessionFactory sessionFactory){

        super ();

        this.sessionFactory = sessionFactory;
    }


    @Override
    public List<StudentAnnotation> findAll() {
        return null;
    }

    @Override
    public UserAnnotation findById(int id) {
        return null;
    }

    @Override
    public void update(StudentAnnotation user) {

    }

    @Override
    public boolean remove(StudentAnnotation us) {
        return false;
    }
}
