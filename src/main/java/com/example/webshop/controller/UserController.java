package com.example.webshop.controller;

import com.example.webshop.entity.User;
import com.example.webshop.repository.UserRepository;
import com.example.webshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/api/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }
}
