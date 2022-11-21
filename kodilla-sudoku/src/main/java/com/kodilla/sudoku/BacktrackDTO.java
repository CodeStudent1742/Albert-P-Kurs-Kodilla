package com.kodilla.sudoku;

public class BacktrackDTO {
    private SudokuBoard sudokuBoard;
    private int col;
    private int row;
    private int value;

    public BacktrackDTO(SudokuBoard sudokuBoard, int col, int row, int value) {
        this.sudokuBoard = sudokuBoard;
        this.col = col;
        this.row = row;
        this.value = value;
    }

    public SudokuBoard getSudokuBoard() {
        return sudokuBoard;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int newValue){
        this.value = newValue;
    }
}
