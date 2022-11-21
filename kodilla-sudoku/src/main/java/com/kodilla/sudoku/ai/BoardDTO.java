package com.kodilla.sudoku.ai;

import com.kodilla.sudoku.SudokuBoard;

public class BoardDTO {

    private int col;
    private int row;
    private SudokuBoard sudokuBoard;

    public BoardDTO(int col, int row, SudokuBoard sudokuBoard) {
        this.col = col;
        this.row = row;
        this.sudokuBoard = sudokuBoard;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public SudokuBoard getSudokuBoard() {
        return sudokuBoard;
    }
}
