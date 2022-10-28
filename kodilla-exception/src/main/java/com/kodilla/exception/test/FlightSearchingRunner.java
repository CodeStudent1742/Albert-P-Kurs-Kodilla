package com.kodilla.exception.test;

public class FlightSearchingRunner {

    public static void main(String[] args) {
        FlightSearching flightSearching = new FlightSearching();
        try {
            flightSearching.findFlight(new Flight("Krakow","Bialystok"));
            System.out.println("Flight possible");
        }catch(RouteNotFoundException e){
            System.out.println("Flight impossible, one of airports not existing");
        }
    }
}
