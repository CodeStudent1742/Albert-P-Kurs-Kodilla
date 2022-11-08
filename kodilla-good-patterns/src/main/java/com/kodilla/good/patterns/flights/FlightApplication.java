package com.kodilla.good.patterns.flights;

import com.kodilla.good.patterns.flights.ui.Print;

import java.util.List;

public class FlightApplication {

    public static void main(String[] args) {
        FlightBase flightBase = new FlightBase();
        FlightHandling flightHandling = new FlightHandling(flightBase.getFlights());

        List<Flight> fromGdansk = flightHandling.flightFromPlace(Destination.GDANSK);
        Print.print(fromGdansk);
        System.out.println("");
        List<Flight> toWroclaw = flightHandling.flightToPlace(Destination.WROCLAW);
        Print.print(toWroclaw);
        System.out.println("");
        flightHandling.flightFromTo(Destination.GDANSK, Destination.WROCLAW);
        System.out.println("");
        flightHandling.flightFromTo(Destination.WARSAW, Destination.POZNAN);
    }

}
