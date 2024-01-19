package io.creh.productsservice.service;

import io.creh.productsservice.model.Category;
import io.creh.productsservice.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public ArrayList<Category> listCategory() {
        return (ArrayList<Category>) categoryRepository.findAll();
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Optional<Category> searchCategoryById(Integer id) {
        return categoryRepository.findById(id);
    }
}
