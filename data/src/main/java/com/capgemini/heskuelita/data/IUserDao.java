
package com.capgemini.heskuelita.data;


import com.capgemini.heskuelita.data.entity.UserAnnotation;

import java.util.List;


public interface IUserDao {

      UserAnnotation login (String userName, String password);

      void NewUser (String user_name,String password, String email );
      List<UserAnnotation> FindingAllsUsers();
      UserAnnotation FinById(int id);
      void UpDateUserByName(String name, String password , String email);
      public  boolean removeUser(UserAnnotation user);

}