package com.kodilla.good.patterns.food2door.orderretireve;


public class EFSOrder {

    public Order retrieve(){
         Supplier supplier = new Supplier("ExtraFoodShop", "Kraków XYZ1/2");
         String product = "Marchew";
         String quantity = "50";

        return new Order(supplier,product,quantity);
    }
}
