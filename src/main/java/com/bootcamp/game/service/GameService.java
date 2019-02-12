package com.bootcamp.game.service;

import com.bootcamp.game.dao.CategoryRepository;
import com.bootcamp.game.dao.ItemRepository;
import com.bootcamp.game.exception.AppException;
import com.bootcamp.game.exception.Errors;
import com.bootcamp.game.model.Game;
import com.bootcamp.game.payload.GameRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public Game saveGame(GameRequest gameRequest){
            Game game = new Game();
            game.setCategory(categoryRepository.findById(gameRequest.getCategory()).orElseThrow(()-> new AppException(Errors.CATEGORY_NOT_FOUND)));
            game.setName(gameRequest.getName());
            try{
            return itemRepository.save(game);
            }
            catch (Exception e){
                throw new AppException(Errors.ERROR_SAVING_GAME);
            }

   }

    public List getGames(){
        return itemRepository.findAll();
    }

}
