package com.kodilla.spring.portfolio;


import com.kodilla.spring.reader.Book;
import com.kodilla.spring.reader.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {


    @Bean(name = "toDoList")
    public TaskList getToDoList() {
        TaskList toDoList = new TaskList();
        return toDoList;
    }
    @Bean(name = "inProgress")
    public TaskList getInProgress() {
        TaskList inProgress = new TaskList();
        return inProgress;
    }
    @Bean(name = "doneList")
    public TaskList getDoneList() {
        TaskList doneList = new TaskList();
        return doneList;
    }

    @Bean
    public Board getBoard() {
        return new Board();
    }

}
