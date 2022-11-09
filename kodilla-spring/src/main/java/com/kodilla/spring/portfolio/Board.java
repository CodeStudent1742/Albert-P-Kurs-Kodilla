package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.config.Task;

public class Board {

    @Autowired
    @Qualifier("toDoList")
    private TaskList toDoList;

    @Autowired
    @Qualifier("inProgress")
    private TaskList inProgressList;

    @Autowired
    @Qualifier("doneList")
    private TaskList doneList;

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

//        public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList){
//        this.toDoList = toDoList;
//        this.inProgressList = inProgressList;
//        this.doneList = doneList;
//    }
}
