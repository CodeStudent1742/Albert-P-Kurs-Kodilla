package com.kodilla.good.patterns.challenges;

public class  OrderRequestRetriever {

    public orderRequest retrieve(){
        User user = new User("John", "Wekl");
        String fromShop = "Empik";
        String toLocation = "Krakow";

        return new orderRequest(user,fromShop,toLocation);
    }
}
