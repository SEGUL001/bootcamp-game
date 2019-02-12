package com.bootcamp.game.service;

import com.bootcamp.game.dao.CategoryRepository;
import com.bootcamp.game.exception.AppException;
import com.bootcamp.game.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category saveCategory(Category category){
        try {
            return categoryRepository.save(category);
        }
        catch (Exception e) {
            throw new AppException("Error saving game");
        }
    }

    public List getCategories(){
        return categoryRepository.findAll();
    }

}
