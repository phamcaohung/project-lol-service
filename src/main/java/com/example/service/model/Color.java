package com.example.service.model;

import jakarta.persistence.Column;

public class Color {
    private String name;

    private int quantity;

    private String image;

    @Column(name = "in_stock")
    private Boolean inStock;

    private String color;

    public Color() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.updateInStock();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void updateInStock() {
        inStock = quantity > 0;
    }
}
