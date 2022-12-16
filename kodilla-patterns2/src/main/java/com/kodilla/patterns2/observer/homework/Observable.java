package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void registerObserver(ObserverHomework observer);
    void notifyObservers();
    void removeObserver(ObserverHomework observer);
}
