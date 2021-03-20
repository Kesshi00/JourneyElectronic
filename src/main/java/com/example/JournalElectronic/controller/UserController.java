package com.example.JournalElectronic.controller;

import com.example.JournalElectronic.dao.UserDAO;
import com.example.JournalElectronic.model.User;
import com.example.JournalElectronic.service.UserService;
import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/post")
    public String post(String name) {
        System.out.println(name);
        return "Server" + name;
    }

    @PostMapping("/register")
        public String addUser(@ModelAttribute User user){
        System.out.println("New user has been registered!");
        userService.saveUser(user);
        return "logged";
        }

    @GetMapping("/testujemy")
    public String test() {
        return "test";
    }
        public String updateUserEmail(int id, String email){
            UserDAO.updateUserEmail(id,email);
            return "Email update";
    }

    @PostMapping("/signedIn")
    public void SignedIn(){
        System.out.println("User " + SecurityContextHolder.getContext().getAuthentication().getName() + " is logged in!");
    }

//    @RequestMapping(value = "/signedIn", method = RequestMethod.GET)
//    @ResponseBody
//    public String currentUserName(Authentication authentication){
//        return authentication.getName();
//    }

}