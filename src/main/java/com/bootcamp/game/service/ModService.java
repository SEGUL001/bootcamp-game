package com.bootcamp.game.service;

import com.bootcamp.game.dao.CategoryRepository;
import com.bootcamp.game.dao.ItemRepository;
import com.bootcamp.game.exception.AppException;
import com.bootcamp.game.exception.Errors;
import com.bootcamp.game.model.Mod;
import com.bootcamp.game.payload.GameRequest;
import com.bootcamp.game.payload.ModRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModService {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private CategoryRepository categoryRepository;


    public Mod createMod(ModRequest modRequest){
        Mod mod = new Mod();
        mod.setCategory(categoryRepository.findById(modRequest.getCategory()).orElseThrow(()-> new AppException(Errors.CATEGORY_NOT_FOUND)));
        mod.setGame(itemRepository.findById(modRequest.getGame()).orElseThrow(()-> new AppException(Errors.GAME_NOT_FOUND)));
        mod.setName(modRequest.getName());
        return itemRepository.save(mod);
    }
}
