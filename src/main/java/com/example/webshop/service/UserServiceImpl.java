package com.example.webshop.service;

import com.example.webshop.entity.User;
import com.example.webshop.repository.UserRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return Lists.newArrayList(userRepository.findAll());
    }

    @Override
    public int addUser(User user) {
        User saved = userRepository.save(user);

        return saved.getId();
    }
}
