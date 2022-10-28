package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearching  {

   public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = new HashMap<>();

        airports.put("Krakow", true);
        airports.put("Warszawa", true);
        airports.put("Rzeszow", true);
        airports.put("Radom", false);
        airports.put("Gdansk", true);
        airports.put("Szczecin", false);

//        for(Map.Entry<String, boolean> eentry :: airports.entrySet()){
//        }
        try {
            boolean checkD = airports.get(flight.getDepartureAirport());
            boolean checkA = airports.get(flight.getArrivalAirport());
            if (checkD==true) {
                System.out.println("You can departure from: " + flight.getDepartureAirport());
            }else {
                System.out.println("you cannot departure from: " + flight.getDepartureAirport());
            }
            if(checkA==true){
                System.out.println("You can arrive to " + flight.getArrivalAirport());
            }else{
                System.out.println("You cannot arrive to " + flight.getArrivalAirport());
            }
        }catch(Exception e){
            throw new RouteNotFoundException() ;
        }finally{
            System.out.println("Just to practice - finally");
        }

    }
}
