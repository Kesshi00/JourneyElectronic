package com.example.JournalElectronic.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "student")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Student extends Person {

    public Student() {
    }

    @Id
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_id")
    private Parent parent;

    public Student(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void add(User users) {

    }

    @ManyToMany(mappedBy = "students")
    Set<Presence> presences;
}