package com.kodilla.good.patterns.food2door.orderretireve;

public class GFSOrder {

    public Order retrieve(){
        Supplier supplier = new Supplier("GlutenFreeShop","Skawina XYZ1/2");
        String product = "Chleb";
        String quantity = "20";

        return new Order(supplier,product,quantity);
    }
}
