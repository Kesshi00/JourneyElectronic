package com.example.JournalElectronic.model;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class User extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Valid
    @NotNull
    @NotEmpty
    private String email;

    @NotNull
    @NotEmpty
    private String password;

    @NotNull
    @NotEmpty
    private String login;

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private String surname;

    public User() {
    }

    public User(String name, String surname,String email, String password, String login) {
        super(name, surname);
        this.password = password;
        this.login = login;
        this.email = email;
        this.name = name;
        this.surname = surname;
    }


    public String getName() {return name;}


    public void setName(String name) {this.name = name;}


    public String getSurname() {return surname; }


    public void setSurname(String surname) {this.surname = surname;}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() { return email;
    }

    public void setEmail(String email) { this.email = email;
    }

    @Override
    public void add(User users) {

    }

    @OneToMany(mappedBy = "user")
    List<Class> classList;

}
