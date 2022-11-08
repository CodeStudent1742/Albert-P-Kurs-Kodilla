package com.kodilla.good.patterns.flights.ui;

import com.kodilla.good.patterns.flights.Flight;

import java.util.List;

public class Print {

    public static void print(List<Flight> flights){
        for (Flight flight : flights){
            System.out.println(flight);
        }
    }
}
