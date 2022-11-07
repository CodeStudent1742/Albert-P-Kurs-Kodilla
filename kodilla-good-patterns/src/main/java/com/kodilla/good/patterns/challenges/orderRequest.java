package com.kodilla.good.patterns.challenges;

public class orderRequest {
    private User user ;
    private String fromShop;
    private String toLocation;

    public orderRequest(final User user, final String fromShop, final String toLocation){
        this.user = user;
        this.fromShop = fromShop;
        this.toLocation = toLocation;
    }
    public User getUser(){
        return user;
    }
    public String getFromShop(){
        return fromShop;
    }
    public String getToLocation(){
        return toLocation;
    }
}
