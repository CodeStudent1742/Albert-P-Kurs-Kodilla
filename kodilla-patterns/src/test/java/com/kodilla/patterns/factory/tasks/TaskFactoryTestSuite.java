package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.takeTask(TaskFactory.DRIVING);
        //Then
        assertEquals("DRIVING", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
        assertTrue(driving.executeTask());
    }

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.takeTask(TaskFactory.PAINTING);
        //Then
        assertEquals("PAINTING", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
        assertTrue(painting.executeTask());
    }

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.takeTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("SHOPPING", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
        assertTrue(shopping.executeTask());

    }
}
