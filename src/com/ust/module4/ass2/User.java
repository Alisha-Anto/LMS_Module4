package com.ust.module4.ass2;
public class User {
    private int userId;
    private String name;
    private String email;
    private Cart shoppingCart;

    public User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.shoppingCart = new Cart();
    }

    public void addToCart(Product product) {
        shoppingCart.addProduct(product);
    }

    public void viewCart() {
        shoppingCart.viewCart();
    }

    public Order checkout() {
        double total = shoppingCart.calculateTotal();
        Order order = new Order(userId, shoppingCart.getProducts(), total);
        shoppingCart = new Cart(); // Reset the cart after checkout
        System.out.println("Order placed successfully!");
        return order;
    }
}
