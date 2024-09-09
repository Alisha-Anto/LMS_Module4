package com.ust.module4.ass2;
import java.util.List;

public class Order {
    private static int idCounter = 1000;
    private int orderId;
    private int userId;
    private List<Product> products;
    private double totalPrice;

    public Order(int userId, List<Product> products, double totalPrice) {
        this.orderId = idCounter++;
        this.userId = userId;
        this.products = products;
        this.totalPrice = totalPrice;
    }

    public void viewOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("User ID: " + userId);
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
        System.out.println("Total Price: $" + totalPrice);
    }
}

