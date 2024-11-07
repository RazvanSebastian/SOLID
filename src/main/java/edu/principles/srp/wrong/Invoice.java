package edu.principles.srp.wrong;

/**
 * Uncle Bob Martin suggests that "components should be broken until each one has only one reason to change".
 * When we split responsibilities between smaller methods and classes, usually the system becomes easier to learn overall.
 * <p>
 * We can easily combine independent components in different ways for different purposes or depending on configuration
 * <p>
 * - Flexibility: It becomes possible to reuse components when they have a single, narrow responsibility
 * - Testability: It’s easier to write and maintain tests for methods and classes with focused, independent concerns.
 * */
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

    /*
    * Violates SRP: what if we want to save into the DB => add new method to save into DB => change the class
    */
    public void saveToFile() {
        // save to file
    }

    /*
    * Follows SRP: Only one reason to change: for example, by adding a taxRate parameter, we can change how the total is calculated.
    */
    private double calculateTotal() {
        return quantity * price;
    }
}
