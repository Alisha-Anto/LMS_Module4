package com.ust.module4.ass2;
import java.util.Scanner;
public class EcommmerceMainApp {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Sample products
	        Product product1 = new Product(1, "Laptop", 1200.99, 10);
	        Product product2 = new Product(2, "Smartphone", 699.99, 15);

	        // Sample user
	        User user = new User(101, "John Doe", "john@example.com");

	        int choice;
	        do {
	            System.out.println("\n--- E-Commerce Menu ---");
	            System.out.println("1. Add Laptop to Cart");
	            System.out.println("2. Add Smartphone to Cart");
	            System.out.println("3. View Cart");
	            System.out.println("4. Checkout");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    user.addToCart(product1);
	                    break;
	                case 2:
	                    user.addToCart(product2);
	                    break;
	                case 3:
	                    user.viewCart();
	                    break;
	                case 4:
	                    Order order = user.checkout();
	                    order.viewOrderDetails();
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 5);

	        scanner.close();
	    }
	}


