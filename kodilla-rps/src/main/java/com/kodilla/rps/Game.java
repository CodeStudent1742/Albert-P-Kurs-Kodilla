package com.kodilla.rps;

public class Game {
    private final String name;
    private final int turnsToWin;
    private int currentTurn = 0;

    public Game(String name, int turnsToWin) {
        this.name = name;
        this.turnsToWin = turnsToWin;
    }

}
