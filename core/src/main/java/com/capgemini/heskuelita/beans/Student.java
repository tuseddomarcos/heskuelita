
package com.capgemini.heskuelita.beans;


public class Student extends Person {


    public Student () {

        super ();
    }

    public Student (Long id, String name, String lastName,
                    String email, int dni) {

        super (id, name, lastName,
               email, dni);
    }
}