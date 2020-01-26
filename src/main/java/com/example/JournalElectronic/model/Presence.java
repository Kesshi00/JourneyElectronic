package com.example.JournalElectronic.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Presence {
    @Id
    private long id;
    private int date;
    private String comment;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "classes_id")
    private Class classes;


    @ManyToMany
    @JoinTable(
            name = "student_presence",
            joinColumns = @JoinColumn(name = "presence_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    Set<Student> students;

}
