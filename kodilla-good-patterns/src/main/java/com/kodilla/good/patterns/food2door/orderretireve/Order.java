package com.kodilla.good.patterns.food2door.orderretireve;

public class Order {
    private Supplier supplier;
    private String product;
    private String quantity;

    public Order(final Supplier supplier, final String product, final String quantity){
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public String getProduct() {
        return product;
    }

    public String getQuantity() {
        return quantity;
    }
}
