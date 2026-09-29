package com.skincare.tracker;

import com.skincare.tracker.entity.Ingredient;
import com.skincare.tracker.entity.Product;
import com.skincare.tracker.service.IngredientService;
import com.skincare.tracker.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProductService productService;
    private final IngredientService ingredientService;

    public DataLoader(ProductService productService, IngredientService ingredientService) {
        this.productService = productService;
        this.ingredientService = ingredientService;
    }

    @Override
    public void run(String... args) throws Exception {
        
        Product p1 = new Product("Azelaic Acid %10", "The Ordinary", "Krem");
        Product p2 = new Product("Niacinamide %10", "The Purest Solutions", "Serum");
        Product p3 = new Product("BHA Peeling Liquid", "Cosrx", "Tonik");

        
        productService.saveProduct(p1);
        productService.saveProduct(p2);
        productService.saveProduct(p3);

        
        Ingredient i1 = new Ingredient("Azelaik Asit", "Sivilce ve Leke Giderici", p1);
        Ingredient i2 = new Ingredient("Niacinamide", "Gözenek Sıkılaştırıcı", p2);
        Ingredient i3 = new Ingredient("Çinko (Zinc)", "Sebum Dengeleyici", p2);
        Ingredient i4 = new Ingredient("Salisilik Asit (BHA)", "Siyah Nokta Temizleyici", p3);

        // İçerikleri Veritabanına Kaydediyoruz
        ingredientService.saveIngredient(i1);
        ingredientService.saveIngredient(i2);
        ingredientService.saveIngredient(i3);
        ingredientService.saveIngredient(i4);

        System.out.println("====== ÖRNEK VERİLER VERİTABANINA BAŞARIYLA YÜKLENDİ! ======");
    }
}