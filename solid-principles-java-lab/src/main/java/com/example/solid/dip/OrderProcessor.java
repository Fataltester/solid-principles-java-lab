package com.example.solid.dip;

public class OrderProcessor {
    private Database database;
    public OrderProcessor(Database database) {
    this.database = database;
    }

    // Método setter para cambiar la base de datos en runtime
    public void setDatabase(Database database) {
        this.database = database;
    }

    public void processOrder() {
        System.out.println("Procesando pedido: ");      
        database.saveOrder();     
        System.out.println("Pedido procesado exitosamente\n");
    }
}
