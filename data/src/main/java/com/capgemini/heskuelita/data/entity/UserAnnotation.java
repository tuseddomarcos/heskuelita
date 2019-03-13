package com.capgemini.heskuelita.data.entity;


import java.util.Date;

import javax.persistence.*;


@Entity (name =  "User")
@Table (name = "users")
public class UserAnnotation {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq")
    @Column (name="users_id", nullable=false, unique=true)
    private int id;

    @Column(name="user_name", length=28, nullable=false)
    private String name;

    @Column(name="password", length=28, nullable=false)
    private String password;

    @Column(name="email", nullable=false)
    private String email;

    public UserAnnotation() {

        super ();
    }

    public UserAnnotation(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
