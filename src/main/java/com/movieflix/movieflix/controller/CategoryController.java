package com.movieflix.movieflix.controller;

import com.movieflix.movieflix.entity.Category;
import com.movieflix.movieflix.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/movieflix/category")
public class CategoryController {

    //injecao de dependencia
    @Autowired
    private CategoryService categoryService;

    //metodos
    public List<Category> getAllCategories(){
        return categoryService.findAll();
    }
}
