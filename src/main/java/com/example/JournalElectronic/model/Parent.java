package com.example.JournalElectronic.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Parent extends Person {
    @Id
    private Long id;
    private int numberPhone;

    public Parent(){
    }

    @Override
    public void add(User users) {

    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adress_id")
    private Adress adress;
}
