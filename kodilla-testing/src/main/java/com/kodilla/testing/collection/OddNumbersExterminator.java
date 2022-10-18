package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    private List<Integer> exterminate = new ArrayList<>();
    public OddNumbersExterminator(){
    }
    public  List<Integer> exterminate(List<Integer> numbers){
        for(Integer number : numbers){
            if (number%2==0){
                exterminate.add(number);
            }
        }
        return exterminate;
    }
}
