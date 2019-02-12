package com.bootcamp.game.service;

import com.bootcamp.game.dao.UserRepository;
import com.bootcamp.game.exception.AppException;
import com.bootcamp.game.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserService  {

    @Autowired
    private UserRepository userRepository;


    public User saveUser(User user){
        try{
           return userRepository.save(user);
        }
        catch (Exception e) {
            throw new AppException("Error saving user");
        }
    }

    public List getUsers(){
        return userRepository.findAll();
    }

}
