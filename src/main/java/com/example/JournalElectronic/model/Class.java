package com.example.JournalElectronic.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Class {

    @Id
    private Long id;
    private int classNr;
    private int roomNr;


    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}
