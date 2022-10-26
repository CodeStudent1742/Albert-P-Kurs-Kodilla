package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers){
        IntStream range = IntStream.rangeClosed(numbers[0], numbers[numbers.length-1]);
        range.forEach(System.out::println);
        OptionalDouble result = IntStream.rangeClosed(numbers[0], numbers[numbers.length-1])
                .average();
        return result.getAsDouble();
    }
}
