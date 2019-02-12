package com.bootcamp.game.controller;

import com.bootcamp.game.model.User;
import com.bootcamp.game.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
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

    @PostMapping("/give_game")
    public User giveGame(@RequestParam Long user_id, @RequestParam Long game_id){
        return userService.addGame(user_id,game_id);
    }
    @PostMapping("/give_mod")
    public User giveMod(@RequestParam Long user_id, @RequestParam Long mod_id){
        return userService.addMod(user_id,mod_id);
    }

    @PutMapping("/change_name")
    public User changeName(@RequestBody User user){
        return userService.changeName(user);
    }

    @DeleteMapping("/delete")
    public ResponseEntity deleteUser(@RequestBody User user){
        return userService.removeUser(user);
    }

}
