package com.example.JournalElectronic.controller;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;


@Controller
public class LoggedController {
        @GetMapping("/logged")
        public String showAboutPage(Model model){
            model.addAttribute("username", SecurityContextHolder.getContext().getAuthentication().getName());
            return "logged";
        }


//    @GetMapping("/logged")
//    public String showAbautPage(Model model){
//
//        List<String> class_numbers = Arrays.asList("Raz", "dwa", "Trzy");
//       model.addAttribute("class_nr", class_numbers);
//        return "logged";
    }
