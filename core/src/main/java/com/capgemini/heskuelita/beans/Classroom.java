package com.capgemini.heskuelita.beans;


public class Classroom  {


    private String name;

    private String description;


    public Classroom () {

        super ();
    }

    public Classroom (Long id, String name, String description) {

        this.name = name;
        this.description = description;
    }


    public String getName () {
        
        return name;
    }

    public void setName (String name) {

        this.name = name;
    }

    public String getDescription () {

        return description;
    }

    public void setDescription (String description) {

        this.description = description;
    }
}