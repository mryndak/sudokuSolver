package com.sudoku;

import java.util.ArrayList;

public class SudokuRow {

    private ArrayList<SudokuElement> sudokuElements;

    public SudokuRow() {
        sudokuElements = new ArrayList<SudokuElement>() {{
            add(new SudokuElement());
            add(new SudokuElement());
            add(new SudokuElement());
            add(new SudokuElement());
            add(new SudokuElement());
            add(new SudokuElement());
            add(new SudokuElement());
            add(new SudokuElement());
            add(new SudokuElement());
        }};
    }

    public ArrayList<SudokuElement> getSudokuElements() {
        return sudokuElements;
    }

    public void setSudokuElements(ArrayList<SudokuElement> sudokuElements) {
        this.sudokuElements = sudokuElements;
    }
}
