package com.example.JournalElectronic.controller;

import com.example.JournalElectronic.dao.UserDAO;
import com.example.JournalElectronic.model.User;
import com.example.JournalElectronic.service.UserService;
import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/post")
    public String post(String name) {
        System.out.println(name);
        return "Server" + name;
    }

    @PostMapping("/user")
        public User addUser(@ModelAttribute User user){
//            User user = new User(name, surname, password, login );
            return userService.saveUser(user);
        }
    @GetMapping("/testujemy")
    public String test() {
        return "test";
    }
        public String updateUserEmail(int id, String email){
            UserDAO.updateUserEmail(id,email);
            return "Email update";
    }
}
