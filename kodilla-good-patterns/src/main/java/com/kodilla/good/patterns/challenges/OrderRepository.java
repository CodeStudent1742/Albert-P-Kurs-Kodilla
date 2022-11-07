package com.kodilla.good.patterns.challenges;

public interface OrderRepository {

    void createOrder(User user, String fromShop, String toLocation);
}
