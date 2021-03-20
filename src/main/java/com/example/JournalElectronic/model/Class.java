package com.example.JournalElectronic.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int classNr;
    private int roomNr;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
