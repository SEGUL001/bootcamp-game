package com.bootcamp.game.controller;

import com.bootcamp.game.model.User;
import com.bootcamp.game.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/new")
    public User userCreate(@RequestBody User user){
        return userService.saveUser(user);
    }
    @GetMapping("/all")
    public List getUsers(){
        return userService.getUsers();
    }
}
