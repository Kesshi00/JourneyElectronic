package com.example.JournalElectronic.configuration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/index.html")
    public String index(){
        return "index";
    }
    @GetMapping("/login.html")
    public String login(){
        return "login";
    }
}
