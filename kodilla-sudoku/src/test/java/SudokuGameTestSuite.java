import com.kodilla.sudoku.ExampleBoard.Example1;
import com.kodilla.sudoku.SudokuBoard;
import com.kodilla.sudoku.ai.Solver;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SudokuGameTestSuite {

    @Test
    void testDeepCopy() {
        //given
        SudokuBoard sBoard = new SudokuBoard();;
        Example1.fill(sBoard);
//        System.out.println(sBoard);

        //making a deep copy of object board
        SudokuBoard deepClonedBoard = null;
        try {
            deepClonedBoard = sBoard.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        sBoard.setElement(0,0,4);
        sBoard.setElement(2,0,6);
        SudokuBoard deepClonedBoard2=null;
        try {
            deepClonedBoard2 = sBoard.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        sBoard.setElement(4,0,7);
        //Then
//        System.out.println(sBoard);
//        System.out.println("Deep Clone:");
//        System.out.println(deepClonedBoard);
//        System.out.println("Deep Clone2:");
//        System.out.println(deepClonedBoard2);
        assertNotEquals(sBoard.getElement(0,0),deepClonedBoard.getElement(0,0));
        assertNotEquals(sBoard.getElement(4,0),deepClonedBoard2.getElement(4,0));
    }
    @Test
    void testPossibleValues() {
        //given
        SudokuBoard sBoard = new SudokuBoard();
        Example1.fill(sBoard);
//        System.out.println(sBoard);
        //making a deep copy of object board
        SudokuBoard deepClonedBoard = null;
        try {
            deepClonedBoard = sBoard.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        sBoard.setElement(0, 0, 4);
        sBoard.setElement(2, 0, 6);
        sBoard.setElement(4, 0, 7);
        sBoard.setElement(6, 0, 3);
        for(int i = 1; i<8; i++) {
            sBoard.getElement(8, 0).getPossibleValues().remove(0);
        }
        sBoard.getElement(8, 0).getPossibleValues().remove(Integer.valueOf(9));

        //Then
        int check1 = sBoard.getElement(8, 0).getPossibleValues().size();
        int check2 = deepClonedBoard.getElement(8, 0).getPossibleValues().size();
//        System.out.println(sBoard.getElement(8, 0).possibleValuesToString());
//        System.out.println(deepClonedBoard.getElement(8, 0).possibleValuesToString());
//        System.out.println("Size of sBoard Possible Value is: "+ check1 +"\n Size of clonnedBoard Possible Value is: "+ check2);
        assertNotEquals(check1,check2);
    }
    @Test
    void testExampleBoard(){
        //Given
        SudokuBoard sBoard = new SudokuBoard();
        //When
        Example1.fill(sBoard);
        System.out.println(sBoard);
        Solver solver = new Solver(sBoard);
        boolean result = solver.solve();
        System.out.println(sBoard);
        //Then
        assertEquals(true,result);
    }
}

