package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void runLogger() {
        logger = logger.INSTANCE;
    }

    @Test
    void testGetLastLog() {
        //Given
        logger.log("Something for the Test");
        //When
        String result = logger.getLastLog();
        //Then
        assertEquals("Something for the Test", result);
    }
    @Test
    void testGetLastLogAdded() {
        //Given
        logger.log("Something for the Test");
        logger.log("Added");
        //When
        String result = logger.getLastLog();
        //Then
        assertEquals("Added", result);
    }

}
