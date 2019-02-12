package com.bootcamp.game.controller;

import com.bootcamp.game.exception.AppException;
import com.bootcamp.game.model.Game;
import com.bootcamp.game.payload.GameRequest;
import com.bootcamp.game.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping("/new")
    public Game gameSave(@Validated @RequestBody GameRequest gameRequest, Errors errors){
        if(errors.hasErrors()){
            throw new AppException(com.bootcamp.game.exception.Errors.INVALID_FIELDS_GAME);
        }
        else return gameService.saveGame(gameRequest);
    }
    @GetMapping("/all")
    public List getUsers(){
        return gameService.getGames();
    }
}