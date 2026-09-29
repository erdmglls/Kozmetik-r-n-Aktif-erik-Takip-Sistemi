package com.skincare.tracker.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name; 

    private String purpose; 

    
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    public Ingredient() {
    }

    public Ingredient(String name, String purpose, Product product) {
        this.name = name;
        this.purpose = purpose;
        this.product = product;
    }

    // Getter ve Setter'lar
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPurpose() { return purpose; }
    public void setPurpose(String purpose) { this.purpose = purpose; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
}