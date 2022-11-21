package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    private int value;
    public static int EMPTY = -1;

    List<Integer> possibleValues = new ArrayList<>();

    public SudokuElement(){
        value = EMPTY;
        for(int i = 0;i<9;i++){
            possibleValues.add(i+1);
        }
    }

    @Override
    public String toString() {
        String s ="";
        if (value != EMPTY && value != 0)
            s +=" " + value;
        else
            s +="  ";
        return s;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }
    public void renewPossibleValues(){
        possibleValues = new ArrayList<>();
        for(int i = 0;i<9;i++){
            possibleValues.add(i+1);
        }
    }
    public String possibleValuesToString(){
        String s = "Possible values are: ";
        for ( int i = 0;i<getPossibleValues().size(); i ++){
            s+= getPossibleValues().get(i)+" ";
        }
        return s;
    }

    public void setPossibleValues(List<Integer> possibleValues) {
        this.possibleValues = possibleValues;
    }
}
