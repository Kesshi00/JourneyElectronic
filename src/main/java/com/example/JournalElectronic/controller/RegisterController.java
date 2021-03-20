package com.example.JournalElectronic.controller;

import com.example.JournalElectronic.model.User;
import com.example.JournalElectronic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String registerForm(Model model) {
        model.addAttribute("login", new User());
        return "register";
    }
}
//    @PostMapping("/register")
//    public String registerUser(@Valid User user, BindingResult bindingResult, Model model) {
//        if (bindingResult.hasErrors()) {
//            return "views/registerForm";
//        }
//        if (userService.isUserPresent(user.getEmail())) {
//            model.addAttribute("exist", true);
//            return "views/registerForm";
//        }
//        userService.addUser(user);
//        return "views/success";
//    }
//}