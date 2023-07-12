package com.HotelManagementSystem.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RecipeManagementSystem.repos.Recipe;
import com.RecipeManagementSystem.repos.RecipeRepository;

@Service
public class HotelService {
    private final RecipeRepository recipeRepository;

    @Autowired
    public HotelService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Recipe saveRecipe(Recipe recipe) {
        // logic to save a recipe
        return recipeRepository.save(recipe);
    }

    public List<Recipe> getAllRecipes() {
        // logic to retrieve all recipes
        return recipeRepository.findAll();
    }

    public Recipe getRecipeById(Long id) {
        // logic to retrieve a recipe by id
        return recipeRepository.findById(id).orElse(null);
    }

    public void deleteRecipe(Long id) {
        // logic to delete a recipe by id
        recipeRepository.deleteById(id);
    }
    // other methods as needed
}
