package com.example.solid.srp;

public class Invoice {
    private String customer;
    private double amount;
    private static final double TAX_RATE = 0.21;

    public Invoice(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public double calculateTotal() {
        return amount * (1+TAX_RATE);
    }


    public String getCustomer() {
        return customer;
    }
    public double getAmount() {
        return amount;
    }
}
