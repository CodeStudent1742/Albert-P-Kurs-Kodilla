package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
     private Calculator calculator;

    @Test
    void testCalculations(){
        //Given
        double a = 10;
        double b = 5;

        //When
        double add = calculator.add(a,b);
        double sub = calculator.sub(a,b);
        double mul = calculator.mul(a,b);
        double div = calculator.div(a,b);

        //Then
        assertEquals(15, add);
        assertEquals(5, sub);
        assertEquals(50, mul);
        assertEquals(2, div);
    }

}
