package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    private int boardSize;
    private List<SudokuElement> cols = new ArrayList<>();

    public SudokuRow(int boardSize){
        this.boardSize = boardSize;
        for (int col = 0; col<boardSize;col++){
            cols.add( new SudokuElement());
        }
    }

    public List<SudokuElement> getCols() {
        return cols;
    }

    public void setCols(List<SudokuElement> cols) {
        this.cols = cols;
    }

    public int getBoardSize() {
        return boardSize;
    }

    @Override
    public String toString() {
        String s = "|";
        for (int col = 0;col<boardSize;col++){
            s+=getCols().get(col)  +"|";
        }
        s+="\n";
        return s;
    }
}
