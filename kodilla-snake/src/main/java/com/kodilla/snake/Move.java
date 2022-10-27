package com.kodilla.snake;

public class Move {
    int colSource;
    int rowSource;
    int colFinal;
    int rowFinal;

    public Move(int colSource, int rowSource, int colFinal, int rowFinal) {
        this.colSource = colSource;
        this.rowSource = rowSource;
        this.colFinal = colFinal;
        this.rowFinal = rowFinal;
    }

    public int getColSource() {
        return colSource;
    }

    public int getRowSource() {
        return rowSource;
    }

    public int getColFinal() {
        return colFinal;
    }

    public int getRowFinal() {
        return rowFinal;
    }
}

