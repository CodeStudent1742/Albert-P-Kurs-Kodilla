package com.kodilla.good.patterns.flights;

public class FlightApplication {

    public static void main(String[] args) {

        FlightBase flightbase = new FlightBase();

        flightbase.flightFromPlace("Gdansk",true);
        System.out.println("");
        flightbase.flightToPlace("Wroclaw",true);
        System.out.println("");
        flightbase.flightFromTo("Gdansk","Wroclaw");
        System.out.println("");
        flightbase.flightFromTo("Krakow","Warsaw");
    }

}
