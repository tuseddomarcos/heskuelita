
package com.capgemini.heskuelita.service.impl;


import com.capgemini.heskuelita.data.IUserDao;
import com.capgemini.heskuelita.data.entity.UserAnnotation;
import com.capgemini.heskuelita.service.IUserSecurityService;


public class UserUserSecurityServiceImpl implements IUserSecurityService {


    private IUserDao userDao;

    public UserUserSecurityServiceImpl(IUserDao userDao) {

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
    public void NewUser(UserAnnotation user) throws SecurityException {

        try {
            this.userDao.create(user.getName(),user.getPassword(),user.getEmail());
        }catch (Exception e){
            throw new SecurityException(e);
        }

    }

}