package com.capgemini.heskuelita.beans;


public abstract class IDComponent {


    private Long id;


    public IDComponent () {

        super ();
    }

    public IDComponent (Long id) {

        super ();

        this.id = id;
    }


    public Long getId () {

        return id;
    }

    public void setId (Long id) {

        this.id = id;
    }
}