package com.bootcamp.game.service;

import com.bootcamp.game.dao.ItemRepository;
import com.bootcamp.game.dao.UserRepository;
import com.bootcamp.game.exception.AppException;
import com.bootcamp.game.exception.Errors;
import com.bootcamp.game.model.Game;
import com.bootcamp.game.model.Item;
import com.bootcamp.game.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service
public class UserService  {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ItemRepository itemRepository;


    public User saveUser(User user){
        try{
           return userRepository.save(user);
        }
        catch (Exception e) {
            throw new AppException(Errors.ERROR_SAVING_USER);
        }
    }

    public User addGame(Long userRequest, Long gameRequest){

        try{
            User user = userRepository.findById(userRequest).orElseThrow(()->new AppException(Errors.USER_NOT_FOUND));
            Item item = itemRepository.findById(gameRequest).orElseThrow(()->new AppException(Errors.GAME_NOT_FOUND));
            user.getItems().add(item);
            return userRepository.save(user);
        }
        catch(Exception e){
            throw new AppException(Errors.ERROR_GIVING_GAME);
        }
    }

    public User addMod(Long userRequest, Long modRequest){

        try{
            User user = userRepository.findById(userRequest).orElseThrow(()->new AppException(Errors.USER_NOT_FOUND));
            Item item = itemRepository.findById(modRequest).orElseThrow(()->new AppException(Errors.MOD_NOT_FOUND));
            user.getItems().add(item);
            return userRepository.save(user);
        }
        catch(Exception e){
            throw new AppException(Errors.ERROR_GIVING_MOD);
        }
    }

    public User changeName(User user){
        return userRepository.save(user);
    }

    public List getUsers(){
        return userRepository.findAll();
    }

    public ResponseEntity removeUser(User user){
        try {
            userRepository.delete(user);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch(Exception e){
            throw new AppException(Errors.USER_NOT_FOUND);
        }
    }

}
