package com.example.JournalElectronic.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoggedController {
    @GetMapping("/logged")
    public String showAbautPage(){
        return "logged";
    }
}
