package com.kodilla.snake;

import com.kodilla.snake.fields.Field;
import com.kodilla.snake.fields.None;

import java.util.ArrayList;
import java.util.List;

public class BoardRow {
    private List<Field> cols = new ArrayList<>();

    public BoardRow() {
        for (int col = 0; col < 10; col++) {
            cols.add(new None());
        }
    }

    public List<Field> getCols() {
        return cols;
    }

    @Override
    public String toString() {
        String s = "|";
        for (int col = 0; col < 10; col++) {
            s += cols.get(col) + "|";
        }
        s += "\n";
        return s;
    }
}
