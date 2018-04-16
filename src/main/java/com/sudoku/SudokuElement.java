package com.sudoku;

import java.util.Arrays;
import java.util.List;

public class SudokuElement {

    public static int EMPTY = -1;
    private int value;
    private List possibleValues;

    public SudokuElement() {
        this.value = EMPTY;
        this.possibleValues = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void removeValue(int value) {
        for (int i = 0; i < possibleValues.size(); i ++) {
            if (possibleValues.get(i).equals(value)) {
            possibleValues.remove(i);
            }
        }
    }
}
