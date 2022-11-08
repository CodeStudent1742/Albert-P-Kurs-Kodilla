package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightBase {
    private Set<Flight> flights = new HashSet<>();

    public FlightBase() {
        flights.add(new Flight(Destination.KRAKOW, Destination.GDANSK));
        flights.add(new Flight(Destination.GDANSK, Destination.KRAKOW));
        flights.add(new Flight(Destination.GDANSK, Destination.WARSAW));
        flights.add(new Flight(Destination.WARSAW, Destination.GDANSK));
        flights.add(new Flight(Destination.KRAKOW, Destination.WARSAW));
        flights.add(new Flight(Destination.WARSAW, Destination.KRAKOW));
        flights.add(new Flight(Destination.KRAKOW, Destination.WROCLAW));
        flights.add(new Flight(Destination.WROCLAW, Destination.KRAKOW));
        flights.add(new Flight(Destination.POZNAN, Destination.WARSAW));
        flights.add(new Flight(Destination.WARSAW, Destination.POZNAN));
    }

    public Set<Flight> getFlights() {
        return flights;
    }
}
