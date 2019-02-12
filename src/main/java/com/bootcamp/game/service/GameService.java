package com.bootcamp.game.service;

import com.bootcamp.game.dao.GameRepository;
import com.bootcamp.game.exception.AppException;
import com.bootcamp.game.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public Game saveGame(Game game){
        try {
            return gameRepository.save(game);
        }
        catch (Exception e) {
            throw new AppException("Error saving game");
        }
   }

    public List getGames(){
        return gameRepository.findAll();
    }

}
