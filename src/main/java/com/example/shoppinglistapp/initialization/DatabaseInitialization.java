package com.example.shoppinglistapp.initialization;


import com.example.shoppinglistapp.service.CategoryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitialization implements CommandLineRunner {
    private final CategoryService categoryService;

    public DatabaseInitialization(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @Override
    public void run(String... args) throws Exception {

    }
}
