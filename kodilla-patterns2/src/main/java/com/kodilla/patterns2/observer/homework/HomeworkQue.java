package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public abstract class HomeworkQue implements Observable {

    public  final List<ObserverHomework> observers;
    public  final Deque<String> homeworks;
    public  final String studentName ;

    public HomeworkQue(String studentName) {
        observers = new ArrayList<>();
        homeworks = new ArrayDeque<>();
        this.studentName = studentName;
    }

    public  void addHomework(String homework) {
        homeworks.offer(homework);
        notifyObservers();
    }

    @Override
    public void registerObserver(ObserverHomework observer) {
        observers.add(observer);
    }

    @Override
    public  void notifyObservers() {
        for (ObserverHomework observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public  void removeObserver(ObserverHomework observer) {
        observers.remove(observer);
    }
    public  Deque<String> getHomeworks() {
        return homeworks;
    }

    public  String getStudentName() {
        return studentName;
    }
}

