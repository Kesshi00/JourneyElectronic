package com.example.JournalElectronic.controller;

import com.example.JournalElectronic.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
//TO JEST DO ZMIANY, TUTAJ POWINNA POWSTAĆ WERYFIKACJA POPRZEZ LOGOWANIE CZY DANY USER ISTNIEJE
// I POWINNO ZROBIĆ PRZEKIEROWANIE..

    @GetMapping("/login")
    public ModelAndView login() {
        System.out.println("User logged in!");
        return new ModelAndView("login", "userToInsert", new User());
    }
}
