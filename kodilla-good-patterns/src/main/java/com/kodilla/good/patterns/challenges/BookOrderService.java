package com.kodilla.good.patterns.challenges;

public class BookOrderService implements SendService{

    @Override
    public boolean send(User user, String fromShop, String toLocation) {
        return true;
    }
}
