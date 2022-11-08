package com.kodilla.good.patterns.food2door.orderretireve;

public class HSOrder {

    public Order retrieve(){
        Supplier supplier = new Supplier("HealthyShop", "Bochnia XYZ1/2");
        String product = "Jablko";
        String quantity = "30";

        return new Order(supplier,product,quantity);
    }
}
