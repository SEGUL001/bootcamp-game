package com.bootcamp.game.controller;

import com.bootcamp.game.model.Category;
import com.bootcamp.game.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/new")
    public Category categorySave(@RequestBody Category category){
        return categoryService.saveCategory(category);
    }
    @GetMapping("/all")
    public List getUsers(){
        return categoryService.getCategories();
    }
}