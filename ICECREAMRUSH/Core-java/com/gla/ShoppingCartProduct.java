package com.gla;
public class ShoppingCartProduct {
    static class Product {
        static double discount = 10.0;
        final int productID;
        String productName;
        double price;
        int quantity;
        public Product(int productID, String productName, double price, int quantity) {
            this.productID = productID;
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }
        public void displayDetails() {
            if (this instanceof Product) {
                System.out.println("Product ID: " + productID);
                System.out.println("Name: " + productName);
                System.out.println("Price: " + price);
                System.out.println("Quantity: " + quantity);
                System.out.println("Discount: " + discount + "%");
            }
        }
        public static void updateDiscount(double d) {
            discount = d;
        }
    }
    public static void main(String[] args) {
        Product p = new Product(1, "Pen", 10, 2);
        if (p instanceof Product) {
            p.displayDetails();
        }
        Product.updateDiscount(15.0);
        p.displayDetails();
    }
} 