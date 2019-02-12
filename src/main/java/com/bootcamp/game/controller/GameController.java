package com.bootcamp.game.controller;

import com.bootcamp.game.model.Game;
import com.bootcamp.game.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping("/new")
    public Game gameSave(@RequestBody Game game){
        return gameService.saveGame(game);
    }
    @GetMapping("/all")
    public List getUsers(){
        return gameService.getGames();
    }
}