package com.sesi.cadastro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesi.cadastro.model.User;

@RestController
@RequestMapping("/users")
public class UserController {

    private List<User> users = new ArrayList<>();

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        users.add(user);
        return user;
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        for (User user : users) {
            System.out.println(user.getName());
        }
        return users;
    }
}
