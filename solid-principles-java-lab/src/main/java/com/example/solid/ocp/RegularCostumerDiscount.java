package com.example.solid.ocp;

public class RegularCostumerDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.10;
    }
}
