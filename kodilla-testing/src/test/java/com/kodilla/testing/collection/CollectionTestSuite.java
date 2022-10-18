package com.kodilla.testing.collection;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }
    @DisplayName("When create Empty List , " +
            "check if class OddNumbersExterminator work without fail"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator empty = new OddNumbersExterminator();
        //When
        List<Integer> result = empty.exterminate(new ArrayList<Integer>());
        System.out.println("Testing Empty List");
        //Then
        Assertions.assertEquals(0, result.size());
    }
    @DisplayName("When create Normal List , " +
            "check if class OddNumbersExterminator work without fail"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator normal = new OddNumbersExterminator();
        //When
        List<Integer> result = normal.exterminate(new ArrayList<Integer>(Arrays.asList(1,2,3,5,7,9,12)));
        System.out.println(" normal list w content" + result);
        //Then
        Assertions.assertEquals(2, result.size());
    }
}

