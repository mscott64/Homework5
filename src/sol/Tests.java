package sol;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static sol.InterviewQuestionsSolutions.*;

public class Tests {

    @Test
    public void testSpiralPrint() {
        int[][] arr = new int[][] {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8},
        };
        assertEquals("0, 1, 2, 5, 8, 7, 6, 3, 4", spiralPrint(arr));
        arr = new int[][] {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11},
                {12, 13, 14, 15},
        };
        assertEquals("0, 1, 2, 3, 7, 11, 15, 14, 13, 12, 8, 4, 5, 6, 10, 9", spiralPrint(arr));

        arr = new int[][] {
                {0, 1, 2, 3, 4},
                {4, 5, 6, 7, 8},
                {8, 9, 10, 11, 12},
                {12, 13, 14, 15, 16},
                {16, 17, 18, 19, 20},
        };
        assertEquals("0, 1, 2, 3, 4, 8, 12, 16, 20, 19, " +
                "18, 17, 16, 12, 8, 4, 5, 6, 7, 11, 15, 14, 13, 9, 10", spiralPrint(arr));

        arr = new int[][] {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
        };
        assertEquals("0, 1, 2, 3, 7, 6, 5, 4", spiralPrint(arr));

        arr = new int[][] {
                {0},
                {3},
                {6},
        };
        assertEquals("0, 3, 6", spiralPrint(arr));

        arr = new int[][] {
                {0, 1, 2},
        };
        assertEquals("0, 1, 2", spiralPrint(arr));

        arr = new int[][] {
                {1},
        };
        assertEquals("1", spiralPrint(arr));

        arr = new int[][] {{}};
        assertEquals("", spiralPrint(arr));
    }

    @Test
    public void testPascalsTriangle() {
        assertEquals("Invalid input", pascalsTriangle(-1));
        assertEquals("  1\n 1,1\n1,2,1\n", pascalsTriangle(2));
        assertEquals("    1\n   1,1\n  1,2,1\n 1,3,3,1\n1,4,6,4,1\n", pascalsTriangle(4));
        assertEquals("1\n", pascalsTriangle(0));
    }

    @Test
    public void testSelectFew() {
        assertEquals("5 7 23 25 29 35 37 43 47 49 53 55 59 65 67 73 77 79 83 85 89 95 97 ", selectFew());
    }

    @Test
    public void testIsBlockParty() {
        assertEquals(false, isBlockParty(new int[]{1, 1, -1}));
        assertEquals(false, isBlockParty(new int[]{2, 1, -1}));
        assertEquals(true, isBlockParty(new int[]{2, 1, 0}));
        assertEquals(false, isBlockParty(new int[]{2, 0, 0}));
        assertEquals(false, isBlockParty(new int[]{-1, -1, -1}));
        assertEquals(true, isBlockParty(new int[]{0}));
        assertEquals(false, isBlockParty(new int[]{}));
    }

    @Test
    public void testGetComplement() {
        ArrayList<Interval> inList = new ArrayList<>();
        inList.add(new Interval(3, 20));
        inList.add(new Interval(50, 70));
        inList.add(new Interval(95, 100));
        ArrayList<Interval> outList = new ArrayList<>();
        outList.add(new Interval(0, 2));
        outList.add(new Interval(21, 49));
        outList.add(new Interval(71, 94));
        assertEquals(outList, getComplement(inList));
        inList.clear();
        outList.clear();
        inList.add(new Interval(0, 20));
        inList.add(new Interval(50, 70));
        inList.add(new Interval(95, 100));
        outList.add(new Interval(21, 49));
        outList.add(new Interval(71, 94));
        assertEquals(outList, getComplement(inList));
        inList.clear();
        outList.clear();
        inList.add(new Interval(5, 20));
        inList.add(new Interval(50, 70));
        inList.add(new Interval(80, 95));
        outList.add(new Interval(0, 4));
        outList.add(new Interval(21, 49));
        outList.add(new Interval(71, 79));
        outList.add(new Interval(96, 100));
        assertEquals(outList, getComplement(inList));
        inList.clear();
        outList.clear();
        inList.add(new Interval(35, 75));
        outList.add(new Interval(0, 34));
        outList.add(new Interval(76, 100));
        assertEquals(outList, getComplement(inList));
        inList.clear();
        outList.clear();
        outList.add(new Interval(0, 100));
        assertEquals(outList, getComplement(inList));
        assertEquals(inList, getComplement(outList));
    }

}
