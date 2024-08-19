package com.example.mscatalogo1.service.impl;
import com.example.mscatalogo1.entity.Category;
import com.example.mscatalogo1.repository.CategoryRepository;
import com.example.mscatalogo1.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImplement implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public List<Category> list() {
        return categoryRepository.findAll();
    }


    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }


    @Override
    public Category update(Category category) {
        return categoryRepository.save(category);
    }


    @Override
    public Optional<Category> listarPorId(Integer id) {
        return categoryRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        categoryRepository.deleteById(id);
    }
}