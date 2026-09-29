package com.skincare.tracker.controller;

import com.skincare.tracker.entity.Ingredient;
import com.skincare.tracker.service.IngredientService;
import com.skincare.tracker.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ingredients")
public class IngredientController {

    private final IngredientService ingredientService;
    private final ProductService productService;

    public IngredientController(IngredientService ingredientService, ProductService productService) {
        this.ingredientService = ingredientService;
        this.productService = productService;
    }

    @GetMapping
    public String listIngredients(Model model) {
        model.addAttribute("ingredients", ingredientService.getAllIngredients());
        return "ingredient-list";
    }

    @GetMapping("/new")
    public String createIngredientForm(Model model) {
        model.addAttribute("ingredient", new Ingredient());
        
        model.addAttribute("products", productService.getAllProducts()); 
        return "ingredient-form";
    }

    @PostMapping
    public String saveIngredient(@ModelAttribute("ingredient") Ingredient ingredient) {
        ingredientService.saveIngredient(ingredient);
        return "redirect:/ingredients";
    }

    @GetMapping("/delete/{id}")
    public String deleteIngredient(@PathVariable Long id) {
        ingredientService.deleteIngredient(id);
        return "redirect:/ingredients";
    }
}