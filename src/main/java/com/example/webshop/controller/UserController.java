package com.example.webshop.controller;

import com.example.webshop.entity.User;
import com.example.webshop.repository.UserRepository;
import com.example.webshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    UserService userService;
/*
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
*/

    @GetMapping(value = "/api/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    /*@PostMapping(value = "/api/users")
    public int addUser(@RequestBody User user) {
        String password = bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(password);
        int id = userService.addUser(user);
        user.setId(id);
        System.out.println(user);
        return id;
    }*/

    /*@Transactional(rollbackFor = Exception.class)
    public String saveDto(UserDto userDto) {
        userDto.setPassword(bCryptPasswordEncoder
                .encode(userDto.getPassword()));
        return save(new User(userDto)).getId();
    }*/
}
