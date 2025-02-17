package com.movieflix.movieflix.service;

import com.movieflix.movieflix.entity.Category;
import com.movieflix.movieflix.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    //injecao de dependencia
    @Autowired
    private CategoryRepository repository;

    //metodos
    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category saveCategory(Category saveCategory){
        return repository.save(saveCategory);
    }
}
