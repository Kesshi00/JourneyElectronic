package com.example.JournalElectronic.model;

import jdk.jfr.Enabled;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Teacher extends Person {
    @Id
    private Long id;
    private int numberPhone;

    public Teacher(){
    }

    @Override
    public void add(User users) {

    }
    
    @OneToMany(mappedBy = "teacher")
    List<Class> classList;
}