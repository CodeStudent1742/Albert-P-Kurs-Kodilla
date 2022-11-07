package com.kodilla.good.patterns.challenges;

public class EmpikOrderRepository implements OrderRepository {
            private User user;
            private String fromShop;
            private String toLocation;
    @Override
    public void createOrder(final User user, final String fromShop, final String toLocation) {

    }

    public User getUser() {
        return user;
    }

    public String getFromShop() {
        return fromShop;
    }

    public String getToLocation() {
        return toLocation;
    }
}
