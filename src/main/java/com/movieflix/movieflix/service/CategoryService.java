package com.movieflix.movieflix.service;

import com.movieflix.movieflix.entity.Category;
import com.movieflix.movieflix.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    //injecao de dependencia
    @Autowired
    private CategoryRepository repository;

    //metodos
    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category saveCategory(@RequestBody Category saveCategory){
        return repository.save(saveCategory);
    }

    // Com optional garante que nao tenha null pointer exception
    public Optional<Category> findById(Long id){
        return repository.findById(id);
    }

    public void deleteCategory(Long id){
        repository.deleteById(id);
    }
}
