package com.kodilla.good.patterns.flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightBase {

    private Set<Flight> flights = new HashSet<>();

    public FlightBase() {
        flights.add(new Flight("Krakow", "Gdansk"));
        flights.add(new Flight("Gdansk", "Krakow"));
        flights.add(new Flight("Gdansk", "Warsaw"));
        flights.add(new Flight("Warsaw", "Gdansk"));
        flights.add(new Flight("Krakow", "Warsaw"));
        flights.add(new Flight("Warsaw", "Krakow"));
        flights.add(new Flight("Krakow", "Wroclaw"));
        flights.add(new Flight("Wroclaw", "Krakow"));
        flights.add(new Flight("Poznan", "Warsaw"));
        flights.add(new Flight("Warsaw", "Poznan"));
    }

    public List<Flight> flightFromPlace(String departurePort, boolean print) {
        if(print) {
            System.out.println("Available Flight/s from: " + departurePort + " is/are:");
            flights.stream()
                    .filter(s -> s.getDeparturePort().equals(departurePort))
                    .forEach(System.out::println);
        }
        List<Flight> list = flights.stream()
                .filter(s -> s.getDeparturePort().equals(departurePort))
                .collect(Collectors.toList());
                return list;

    }

    public List<Flight> flightToPlace(String arrivalPort,boolean print) {
        if(print) {
            System.out.println("Available flight/s to: " + arrivalPort + " is/are: ");
            flights.stream()
                    .filter(s -> s.getArrivalPort().equals(arrivalPort))
                    .forEach(System.out::println);
        }
         List<Flight> list = flights.stream()
                .filter(s -> s.getArrivalPort().equals(arrivalPort))
                .collect(Collectors.toList());
        return list;
    }

    public void flightFromTo(String departurePort, String arrivalPort) {

        List<Flight> result = flights.stream()
                .filter(s -> s.getDeparturePort().equals(departurePort) && s.getArrivalPort().equals(arrivalPort))
                .collect(Collectors.toList());
        if (result.isEmpty()) {
            List<Flight> middle1 = flightFromPlace(departurePort,false);
            List<Flight> middle2 = flightToPlace(arrivalPort,false);

            for (int i = 0; i < middle1.size(); i++) {
                for (int j = 0; j < middle2.size(); j++) {
                    if (middle1.get(i).getArrivalPort() == middle2.get(j).getDeparturePort()) {
                        System.out.println("To reach " + arrivalPort + ", first you need to take flight: "
                                + middle1.get(i) + "\n and then: " + middle2.get(j));
                    }
                }
            }
        } else {
            System.out.println("You can flight directly from:" + departurePort + " to: " + arrivalPort);
        }
    }
}

