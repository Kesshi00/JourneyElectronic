package com.example.JournalElectronic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddUserController {

    @GetMapping("/addUser")
    public String getAddUser(){
        return ("addUser");
    }
}

