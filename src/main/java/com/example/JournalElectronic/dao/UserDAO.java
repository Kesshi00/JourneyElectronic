package com.example.JournalElectronic.dao;

import com.example.JournalElectronic.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAO {
    private static List<User> users = new ArrayList<>();

    public static List<User> getUsers() {
        users.add(new User("Tomasz", "Kowalski", "tom@tom.com", "123", "tom"));
        return users;
    }

    public void addUser(User user) {
        user.add(user);
    }

    public static void updateUserEmail(int id, String login) {
        if (id >= 0 && id < users.size()) {
            users.get(id).setLogin(login);
        } else {
            throw new IllegalArgumentException("Invalid user id");
        }
    }
}
