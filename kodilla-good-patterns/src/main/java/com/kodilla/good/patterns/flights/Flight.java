package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Flight {
    private String departurePort;
    private String arrivalPort;

    public Flight(String departurePort, String arrivalPort){
        this.departurePort = departurePort;
        this.arrivalPort = arrivalPort;
    }

    public String getDeparturePort() {
        return departurePort;
    }

    public String getArrivalPort() {
        return arrivalPort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departurePort, flight.departurePort) && Objects.equals(arrivalPort, flight.arrivalPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departurePort, arrivalPort);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departurePort='" + departurePort + '\'' +
                ", arrivalPort='" + arrivalPort + '\'' +
                '}';
    }
}
