package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getInProgressList().addTask("Task in Progress");
        board.getToDoList().addTask("Task to Do");
        board.getDoneList().addTask("Task to be done");
        //Then
        assertEquals("Task in Progress",board.getInProgressList().getTasks().get(0));
        assertEquals("Task to Do", board.getToDoList().getTasks().get(0));
        assertEquals("Task to be done", board.getDoneList().getTasks().get(0));
    }

}
