package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class probablyIWillThrowException {

    @Test
    public void  throwExceptionIfXBiggerOrEqual2()  {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        // When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,2));
    }
    @Test
    public void throwExceptionIfXSmallerThan1(){
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        // When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5,2));
    }
    @Test
    public void throwExceptionIfYBoundary(){
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        // When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.5,1.5));
    }
    @Test
    public void notThrowException(){
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        // When & Then
        assertDoesNotThrow( () -> secondChallenge.probablyIWillThrowException(1.5,2));
    }
}
