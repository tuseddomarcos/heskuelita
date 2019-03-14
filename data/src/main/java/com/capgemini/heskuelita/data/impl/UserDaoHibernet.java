
package com.capgemini.heskuelita.data.impl;


import com.capgemini.heskuelita.data.DataException;
import com.capgemini.heskuelita.data.IUserDao;
import com.capgemini.heskuelita.data.entity.UserAnnotation;
import com.capgemini.heskuelita.data.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Conjunction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.util.List;


public class UserDaoHibernet implements IUserDao {


    private static SessionFactory sessionFactory;

    private static final Logger logger = LoggerFactory.getLogger (UserDaoHibernet.class);


    public UserDaoHibernet(SessionFactory sessionFactory) {

        super ();

        this.sessionFactory = sessionFactory;
    }


    public static void setup () {

        sessionFactory = HibernateUtil.getSessionFactory ();
    }


    public static void destroy () {

        sessionFactory.close ();
    }

    @Override
    public UserAnnotation login(String userName, String password) {

        // Get a session.
        Session session = null;
        final String    filter1 = userName;
        final String filter2 = password;
        UserAnnotation us = null;

        try {

            logger.info ("Getting a session...");
            session = sessionFactory.openSession ();
            logger.info (String.format ("Finding users by name and password [%s, %s] using criteria object.", filter1, filter2));
            Criterion criterion1 = Restrictions.like ("name", filter1);
            Criterion criterion2 = Restrictions.like ("password", filter2);
            LogicalExpression andExp = Restrictions.and (criterion1, criterion2);
            List<UserAnnotation> list = (List<UserAnnotation>) session.createCriteria (UserAnnotation.class).
                    add (andExp).list ();

            if(!list.isEmpty()){
                for (UserAnnotation e : list){
                    us = new UserAnnotation();

                    us.setName(e.getName());

                }

            }

            logger.info (String.format ("Users by username and password [%s, %s] using criteria object executed!", filter1, filter2));

        } catch (Exception ex) {

            String m = String.format ("Problems executing login %s", ex.getMessage ());
            logger.error (m);

        } finally {

            logger.info ("Closing session...");
            session.close ();
        }

        if (us == null) {
            throw new DataException ("Usuario " + userName + " desconocido");
        }

        return  us;
    }


    @Override
    public  void NewUser(String user_name, String password, String email){

        Session session = null;
        Transaction tx = null;
        try {

            logger.info("Getting a session...");
            session = sessionFactory.openSession ();
            tx = session.beginTransaction ();

            // Set the data to save.
            logger.info(String.format("Creating value to insert... %s , %s , %s",  user_name ,  password , email));
            UserAnnotation pt = new UserAnnotation (user_name,password,email);

            // Save the data.
            logger.info (String.format ("Saving value %s", pt.getName ()));
            session.save (pt);
            logger.info (String.format ("Value %s saved!", pt.getName ()));

            tx.commit ();

        } catch (Exception ex) {

            logger.error (ex.getMessage ());
            tx.rollback ();

        } finally { session.close (); }

    }

    @Override
    public List<UserAnnotation> FindingAllsUsers() {

        Session session = null;
        List<UserAnnotation> users = null;

        try {

            logger.info ("Executing select all users.");
            logger.info("Getting a session...");
            session = sessionFactory.openSession ();

            users = (List)session.createQuery ("from users").list ();

            Assertions.assertFalse (users.isEmpty (), "There are not users found!!!");

            logger.info ("Print all users info.");
            users.forEach ( e -> logger.info (String.format ("user %s name ==> %s",
                    e.getName (), e.getEmail()))
            );

        } catch (Exception e) {

            logger.error (e.getMessage ());
            Assertions.assertFalse (Boolean.TRUE, "Problems executing the test.");

        } finally { session.close(); }

        return users;
    }

    @Override
    public UserAnnotation FinById(int id) {

        // Get a session.
        Session session = null;
        final int    filter1 = id;
        UserAnnotation user = null;
        try {

            logger.info ("Getting a session...");
            session = sessionFactory.openSession ();

            logger.info (String.format ("Finding users by id  [%d] using criteria object.", filter1));
            Criterion criterion1 = Restrictions.gt ("id", filter1);
            Conjunction andExp = Restrictions.and (criterion1);

            List<UserAnnotation> list = (List<UserAnnotation>) session.createCriteria (UserAnnotation.class).
                    add (andExp).list ();
            logger.info (String.format ("Companies by id and country [%d, %s] using criteria object executed!", filter1));

            Assertions.assertFalse (list.isEmpty (), String.format ("User by id  [%d] using criteria object are empty!!!", filter1));

            logger.info ("Print all user info.");
            list.forEach ( e -> logger.info (e.getName ()));

            for (UserAnnotation us : list){
                user.setName(us.getName());
                user.setPassword(us.getPassword());
                user.setEmail(us.getEmail());

            }

        } catch (Exception ex) {

            String m = String.format ("Problems executing test %s", ex.getMessage ());
            logger.error (m);
            Assertions.assertFalse (Boolean.TRUE, m);

        } finally {

            logger.info ("Closing session...");
            session.close ();
        }

        return user;
    }

    @Override
    public void UpDateUserByName(String name , String password , String email) {
        final Session session;
        Transaction tx = null;
        final String    filter1 = name;

        try {

            logger.info("Getting a session...");
            session = sessionFactory.openSession ();
            tx = session.beginTransaction ();
            logger.info (String.format ("Finding users by name  [%s] using criteria object.", filter1));
            Criterion criterion1 = Restrictions.gt ("user_name", filter1);
            Conjunction andExp = Restrictions.and (criterion1);

            List<UserAnnotation> list = (List<UserAnnotation>) session.createCriteria (UserAnnotation.class).
                    add (andExp).list ();

            logger.info ("Print all employees info.");
            list.forEach (e -> {

                logger.info (String.format ("Updating %s ", e.getName ()));
                e.setName (name);
                e.setPassword(password);
                e.setEmail(email);
                session.save (e);
            });
            tx.commit ();

            Assertions.assertFalse (list.isEmpty (), "There are not employees found!!!");

        } catch (Exception e) {

            logger.error (e.getMessage ());
            Assertions.assertFalse (Boolean.TRUE, "Problems executing the test.");
        }
    }

    @Override
    public boolean removeUser(UserAnnotation user) {


        return false;
    }
}