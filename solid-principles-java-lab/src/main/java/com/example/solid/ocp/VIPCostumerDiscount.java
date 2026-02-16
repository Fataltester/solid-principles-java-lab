package com.example.solid.ocp;

public class VIPCostumerDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.20;
    }
}
