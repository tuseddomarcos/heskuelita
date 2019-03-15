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
    public void create(String first_name, String last_name, String type_id, String number_id, String gender, String phone_number) {

        Session session = null;
        Transaction tx = null;
        try {

            logger.info("Getting a session...");
            session = sessionFactory.openSession ();
            tx = session.beginTransaction ();

            // Set the data to save.
            logger.info(String.format("Creating value to insert... %s , %s , %s .....",  first_name ,  last_name , type_id));
           StudentAnnotation st = new StudentAnnotation();

            // Save the data.
            logger.info (String.format ("Saving value %s", st.getFirst_name ()));
            session.save (st);
            logger.info (String.format ("Value %s saved!", st.getFirst_name ()));

            tx.commit ();

        } catch (Exception ex) {

            logger.error (ex.getMessage ());
            tx.rollback ();

        } finally { session.close (); }


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
