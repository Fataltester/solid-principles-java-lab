package com.example.solid.lsp;

public class ElectricCar implements Vehicle, Rechargeable {
    @Override
    public void drive() {
        System.out.println("Conduciendo coche eléctrico...");
    }

    @Override
    public void recharge() {
        System.out.println("Recargando batería...");
    }
    
}
