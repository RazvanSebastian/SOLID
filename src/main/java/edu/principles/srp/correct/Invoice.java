package edu.principles.srp.correct;

public class Invoice {
    private String productName;
    private int quantity;
    private double price;
    private double total;

    public Invoice(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.total = calculateTotal();
    }

    private double calculateTotal() {
        return quantity * price;
    }
}