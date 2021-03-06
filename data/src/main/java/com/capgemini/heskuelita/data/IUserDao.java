
package com.capgemini.heskuelita.data;


import com.capgemini.heskuelita.data.entity.UserAnnotation;

import java.util.List;


public interface IUserDao {

      UserAnnotation login (String userName, String password);
      void create (String user_name,String password, String email, String first_name, String last_name, String type_id, String number_id, String gender, String phone_number );
      List<UserAnnotation> findAll();
      UserAnnotation findById (int id);
      void update (UserAnnotation user);
      boolean remove (UserAnnotation us);

}