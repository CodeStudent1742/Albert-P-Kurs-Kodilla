package com.kodilla.good.patterns.challenges;

public class orderService {

    public boolean send(final User user, final String fromShop, final String toLocation) {
        System.out.println("Sending parcel to:" + user.getName() + " " + user.getSurname() + " from: " + fromShop + "to:" + toLocation);
        return true;
    }
}
