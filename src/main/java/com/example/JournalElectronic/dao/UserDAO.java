package com.example.JournalElectronic.dao;

import com.example.JournalElectronic.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAO {
    static List<User> users  = new ArrayList<>();

    public static List<User> getUsers(){
        users.add(new User( "Tomasz", "Kowalski", "tom@tom.com", "123","tom"));
        return users;
    }
    public void addUser(User users){
        users.add(users);
    }
    public static void updateUserEmail(int id, String login){
        users.get(id).setLogin(login);
    }
}
