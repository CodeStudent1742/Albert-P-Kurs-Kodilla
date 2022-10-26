package com.kodillla.stream.array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Given
        int[] numbers = new int[20];
        for(int i=0; i<20; i++) {
            numbers[i] = i + 1;
        }
        //When
        double received = ArrayOperations.getAverage(numbers);
        //Then
        assertEquals(10.5,received);
    }
}
