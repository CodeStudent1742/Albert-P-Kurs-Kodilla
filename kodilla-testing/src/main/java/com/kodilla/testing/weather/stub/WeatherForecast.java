package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public Double averageTemperature(){
        double sum = 0;
        int quantity = 0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue() ;
            quantity++;
        }
        return sum/quantity;
    }
    public Double medianTemperature(){
        List<Double> list = new ArrayList<>();
        double median = 0;
        double middleAverage = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            list.add(temperature.getValue()) ;
        }
        Collections.sort(list);
        if(list.size() % 2 == 0){
            middleAverage = list.get(list.size()/2) + list.get(list.size()/2 -1);
            median = middleAverage/2;
        }else{
            median = list.get(list.size()/2);
        }
        return median;
    }
}
