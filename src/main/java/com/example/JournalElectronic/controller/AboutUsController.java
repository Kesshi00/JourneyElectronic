package com.example.JournalElectronic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutUsController {
    @GetMapping("/aboutUs")
    public String showAboutUs(){
        return "aboutUs";
    }
}
