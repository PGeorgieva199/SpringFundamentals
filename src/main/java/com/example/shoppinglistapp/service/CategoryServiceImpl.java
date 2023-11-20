package com.example.shoppinglistapp.service;


import com.example.shoppinglistapp.model.entity.Category;
import com.example.shoppinglistapp.model.entity.NameEnum;
import com.example.shoppinglistapp.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CategoryServiceImpl implements CategoryService{


    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public void initCategories() {
        if (this.categoryRepository.count() == 0) {

            Arrays.stream(NameEnum.values())
                    .forEach(categoryName -> {
                        Category category = new Category();
                        category.setName(categoryName);
                        this.categoryRepository.save(category);
                    });
        }
    }
}