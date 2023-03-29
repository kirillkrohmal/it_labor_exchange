package com.example.webshop.service;


import com.example.webshop.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> getUsers();

    int addUser(User user);
}
