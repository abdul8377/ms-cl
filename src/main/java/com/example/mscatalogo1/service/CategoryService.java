package com.example.mscatalogo1.service;


import com.example.mscatalogo1.entity.Category;
import com.example.mscatalogo1.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public interface CategoryService {
    public List<Category> list();
    public Category save(Category category);
    public Category update(Category category);
    public Optional<Category> listarPorId(Integer id);
    public void eliminarPorId(Integer id);
}

