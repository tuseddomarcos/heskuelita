
package com.capgemini.heskuelita.service.impl;


import com.capgemini.heskuelita.data.IUserDao;
import com.capgemini.heskuelita.data.entity.StudentAnnotation;
import com.capgemini.heskuelita.data.entity.UserAnnotation;
import com.capgemini.heskuelita.service.IUserSecurityService;


public class UserSecurityServiceImpl implements IUserSecurityService {


    private IUserDao userDao;

    public UserSecurityServiceImpl(IUserDao userDao) {

        super ();

        this.userDao = userDao;
    }


    @Override
    public void login (UserAnnotation user) throws SecurityException {

        try {
            this.userDao.login (user.getName(), user.getPassword());
        } catch (Exception e) {

            throw new SecurityException(e);
        }
    }

    @Override
    public void NewUser(UserAnnotation user , StudentAnnotation student) throws SecurityException {

        try {
            this.userDao.create(user.getName(),user.getPassword(),user.getEmail(), student.getFirst_name(), student.getLast_name(),
                    student.getType_id(), student.getNumber_id(), student.getGender(),student.getPhone_number());
        }catch (Exception e){
            throw new SecurityException(e);
        }

    }

}