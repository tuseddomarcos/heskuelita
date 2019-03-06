package com.capgemini.heskuelita.beans;


public class Teacher extends Person {


    public Teacher () {

        super ();
    }

    public Teacher (Long id, String name, String lastName,
                    String email, int dni) {

        super (id, name, lastName,
                email, dni);
    }
}