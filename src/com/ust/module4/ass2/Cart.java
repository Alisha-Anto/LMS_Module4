package com.ust.module4.ass2;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;
    private double totalPrice;

    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
        totalPrice += product.getPrice();
        System.out.println(product.getName() + " added to cart.");
    }

    public void removeProduct(Product product) {
        if (products.remove(product)) {
            totalPrice -= product.getPrice();
            System.out.println(product.getName() + " removed from cart.");
        } else {
            System.out.println("Product not found in cart.");
        }
    }

    public void viewCart() {
        System.out.println("Your Cart:");
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
        System.out.println("Total: $" + totalPrice);
    }

    public double calculateTotal() {
        return totalPrice;
    }

    public List<Product> getProducts() {
        return products;
    }
}
