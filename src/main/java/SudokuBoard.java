import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SudokuBoard {

    private List<List<Integer>> sudokuBoard = new ArrayList<>();


    SudokuBoard() {
        Random random = new Random();
        for (int i = 0; i < 9; i++) {
            List<Integer> randomList = new ArrayList<>();
            for (int j = 0; j < 9; j++) {
                randomList.add(random.nextInt(9));
            }
            sudokuBoard.add(randomList);
        }
    }

    public void printSudokuBoard() {
        for (int i = 0; i < 9; i++) {
            List<Integer> printedList = sudokuBoard.get(i);
            for (int j = 0; j < 9; j++) {
                System.out.print(printedList.get(j));
            }
            System.out.println();
        }
    }
}