
package com.capgemini.heskuelita.data;


import com.capgemini.heskuelita.data.entity.UserAnnotation;


public interface IUserDao {

      UserAnnotation login (String userName, String password);

      void NewUser (String user_name,String password, String email );
      void FindingAllsUsers();
      void FinById(int id);

}