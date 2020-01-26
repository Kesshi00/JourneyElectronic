package com.example.JournalElectronic.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adress {
    @Id
    private long id;
    private int code;
    private String city;
    private String street;
    private int houseNumber;
    private int apartmentNumber;
}
