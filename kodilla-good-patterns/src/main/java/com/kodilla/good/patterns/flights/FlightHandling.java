package com.kodilla.good.patterns.flights;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.*;
import java.util.stream.Collectors;

public class FlightHandling {

    private Set<Flight> flights = new HashSet<>();

    public FlightHandling( HashSet<Flight> flights) {
        this.flights = flights;
    }

    public FlightHandling(Set<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> flightFromPlace(Destination departurePort) {
        return flights.stream()
                .filter(s -> s.getDeparturePort().equals(departurePort))
                .collect(Collectors.toList());
    }

    public List<Flight> flightToPlace(Destination arrivalPort) {
        List<Flight> list = flights.stream()
                .filter(s -> s.getArrivalPort().equals(arrivalPort))
                .collect(Collectors.toList());
        return list;
    }

    public void flightFromTo(Destination departurePort, Destination arrivalPort) {

        List<Flight> result = flights.stream()
                .filter(s -> s.getDeparturePort().equals(departurePort) && s.getArrivalPort().equals(arrivalPort))
                .collect(Collectors.toList());
        if (result.isEmpty()) {
            List<Flight> middle1 = flightFromPlace(departurePort);
            List<Flight> middle2 = flightToPlace(arrivalPort);

            for (int i = 0; i < middle1.size(); i++) {
                for (int j = 0; j < middle2.size(); j++) {
                    if (middle1.get(i).getArrivalPort() == middle2.get(j).getDeparturePort()) {
                        System.out.println("To reach " + arrivalPort + ", first you need to take flight: "
                                + middle1.get(i) + "\nand then: " + middle2.get(j));
                    }
                }
            }
        } else {
            System.out.println("You can flight directly from:" + departurePort + " to: " + arrivalPort);
        }
    }
}

