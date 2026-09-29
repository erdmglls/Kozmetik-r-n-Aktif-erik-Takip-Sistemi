package com.skincare.tracker.controller;

import com.skincare.tracker.entity.Product;
import com.skincare.tracker.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    
    @GetMapping
    public String listProducts(Model model) {
        
        model.addAttribute("products", productService.getAllProducts());
        return "product-list"; 
    }

    
    @GetMapping("/new")
    public String createProductForm(Model model) {
        
        Product product = new Product();
        model.addAttribute("product", product);
        return "product-form"; 
    }

    
    @PostMapping
    public String saveProduct(@ModelAttribute("product") Product product) {
        
        productService.saveProduct(product);
        
        return "redirect:/products";
   
 
   }
   
    @GetMapping("/edit/{id}")
    public String editProductForm(@PathVariable Long id, Model model) {
        model.addAttribute("product", productService.getProductById(id));
        return "product-form"; 
    }

    
    @PostMapping("/{id}")
    public String updateProduct(@PathVariable Long id, @ModelAttribute("product") Product product) {
        Product existingProduct = productService.getProductById(id);
        existingProduct.setName(product.getName());
        existingProduct.setBrand(product.getBrand());
        existingProduct.setCategory(product.getCategory());
        productService.saveProduct(existingProduct);
        return "redirect:/products";
    }

    
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "redirect:/products";
    }
}