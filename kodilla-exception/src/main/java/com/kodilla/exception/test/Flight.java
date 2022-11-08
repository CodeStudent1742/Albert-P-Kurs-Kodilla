package com.kodilla.exception.test;

public class Flight {
    String departureAirport;
    String ArrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        ArrivalAirport = arrivalAirport;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureAirport='" + departureAirport + '\'' +
                ", ArrivalAirport='" + ArrivalAirport + '\'' +
                '}';
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return ArrivalAirport;
    }
}
