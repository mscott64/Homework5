package sol;

import java.util.ArrayList;
import java.util.List;

/**
 * For this assignment, you'll be implementing methods as though they are interview
 * questions meaning there's no starter code and no test cases.
 * You get a problem description and one or two clarifying examples.
 * You must use good style and naming standards.
 * Feel free to ask me more clarifying questions if needed.
 *
 * Implement your methods under their problem description.
 */
public class InterviewQuestionsSolutions {

    /**
     * Problem 1
     * Write a method that takes in a 2-d array (of any size) and
     * prints the contents of that array in a clockwise spiral. So for example:
     * [[1, 2, 3, 4],
     *  [5, 6, 7, 8],
     *  [9, 10, 11, 12]] would print 1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7
     *
     *  [[9, 8, 7],
     *   [6, 5, 4],
     *   [3, 2, 1]] would print 9, 8, 7, 4, 1, 2, 3, 6, 5
     *
     *  [[6, 5, 4, 3],
     *   [2, 1, 0, 1],
     *   [2, 3, 4, 5],
     *   [6, 7, 8, 9]] would print 6, 5, 4, 3, 1, 5, 9, 8, 7, 6, 2, 2, 1, 0, 4, 3
     */
    public static String spiralPrint(int[][] arr) {
        if (arr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();

        int colStart = 0;
        int colEnd = arr[0].length - 1;
        int rowStart = 0;
        int rowEnd = arr.length - 1;
        while (colStart <= colEnd && rowStart <= rowEnd) {
            // Row across the top
            for (int i = colStart; i <= colEnd; i++) {
                sb.append(", ");
                sb.append(arr[rowStart][i]);
            }
            rowStart++;
            // Column on the right
            for (int i = rowStart; i <= rowEnd; i++) {
                sb.append(", ");
                sb.append(arr[i][colEnd]);
            }
            colEnd--;
            // Row across the bottom
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    sb.append(", ");
                    sb.append(arr[rowEnd][i]);
                }
                rowEnd--;
            }
            if (colStart <= colEnd) {
                // Column on the left
                for (int i = rowEnd; i >= rowStart; i--) {
                    sb.append(", ");
                    sb.append(arr[i][colStart]);
                }
                colStart++;
            }
        }
        String result = sb.length() == 0 ? "" : sb.substring(2);
        System.out.println(result);
        return result;
    }


    /**
     * Problem 2
     * Write a method that takes in a number n that is greater than or equal to 0
     * and prints the first n rows of Pascal's Triangle. The first row (a single 1) is the 0th row.
     * You can find more information about Pascal's Triangle on the internet.
     *    n = 2          n = 4
     *      1              1
     *     1,1            1,1
     *    1,2,1          1,2,1
     *                  1,3,3,1
     *                 1,4,6,4,1
     */
    public static String pascalsTriangle(int n) {
        if (n < 0) {
            final String invalid = "Invalid input";
            System.out.println(invalid);
            return invalid;
        }

        StringBuilder sb = new StringBuilder();
        int[] row = new int[n + 1]; // width of widest row
        row[0] = 1;
        sb.append(spaceString(n) + "1\n");
        int value, before;
        for (int curr = 1; curr <= n; curr++) {
            before = 0; // imaginary 0 before the first 1
            sb.append(spaceString(n - curr));
            for (int i = 0; i <= curr; i++) {
                value = row[i] + before; // Get the new value at this position
                before = row[i]; // Store the previous value for the next calculation
                row[i] = value; // Update with the new value
                // Add value to output string
                sb.append(value);
                if (i < curr) {
                    sb.append(',');
                }
            }
            sb.append('\n');
        }
        String result = sb.toString();
        System.out.println(result);
        return result;
    }

    private static String spaceString(int numberOfSpaces) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfSpaces; i++) {
            sb.append(' ');
        }
        return sb.toString();
    }

    /**
     * Problem 3
     * Write a method that prints out all of the odd numbers from 0 to 100 that are NOT divisble by 3
     * and do NOT have a 1 at any position (e.g don't print 11, 21, 31, etc)
     */

    public static String selectFew() {
        StringBuilder sb = new StringBuilder();
        for (int i = 5; i < 100; i += 2) {
            // Skip numbers between 10 and 19
            if (i >= 10 && i <= 19) {
                continue;
            }
            // Check that value isn't a multiple of 3 and isn't 21, 31, 41, etc.
            if (i % 3 != 0 && (i - 1) % 10 != 0) {
                sb.append(i);
                sb.append(" ");
            }
        }
        String result = sb.toString();
        System.out.println(result);
        return result;
    }

    /**
     * Problem 4
     * Going to the party? Imagine an array, where each position is a house on a street.
     * The number in the array at that position represents how far the person
     * living in that house plans to travel on Friday night, e.g. in the array [1, 0, -1],
     * the person in the first house will move one house forward, the person in
     * the second house will stay home, and the person in the last house will move one
     * house backward.
     *
     * Write a method to determine if everyone ends up
     * at the last house on the street - where the party is! (in this case return true)
     *
     * [2,1,0] -> A person starting at house 0 will move forward two houses and
     * reach the last house. A person starting at house 1 will move forward
     * one house and also reach the last house. A person starting at the last
     * house will not move. So everyone will reach the party!
     *
     * [0,1,0] -> A person starting at house 0 will not move forward at all,
     * so everyone will NOT reach the party.
     */
    public static boolean isBlockParty(int[] houses) {
        if (houses == null || houses.length == 0) {
            return false;
        }
        int last = houses.length - 1;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != last) {
                return false;
            }
            last--;
        }
        return true;
    }

    /**
     * Problem 5
     * Write a method that takes in a list of disjoint integer intervals over the range [0, 100] and
     * returns a list of the complement of those intervals.
     *
     * For example:
     * {[3, 5], [10, 12], [20, 50], [80, 100]} as input should return
     * {[0, 2], [6, 9], [13, 19], [51, 79]}
     *
     * The intervals are inclusive.
     * The intervals can not be trivially merged, so you'll never see [a, b], [b+1, c]
     * Use this Interval class to help in defining the inputs and outputs.
     * Do not add or remove any functionality from this class.
     */

    public static List<Interval> getComplement(List<Interval> input) {
        ArrayList<Interval> output = new ArrayList<>();
        // If the input is empty, the result is the whole range
        if (input == null || input.isEmpty()) {
            output.add(new Interval(0, 100));
            return output;
        }

        int start = -1, end;
        // If the first interval doesn't start with 0, create the preceding interval
        Interval first = input.get(0);
        if (first.getStart() != 0) {
            start = 0;
        }

        // Create intervals for everything in between.
        for (Interval interval : input) {
            end = interval.start - 1;
            if (start != -1) {
                output.add(new Interval(start, end));
            }
            start = interval.end + 1;
        }

        // If the last interval doesn't end with 100, then add the final interval
        Interval last = input.get(input.size() - 1);
        if (last.getEnd() != 100) {
            output.add(new Interval(start, 100));
        }
        return output;
    }

    public static class Interval {
        int start;
        int end;

        public Interval(int s, int e) {
            start = s;
            end = e;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }

        @Override
        public String toString() {
            return "Interval{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Interval interval = (Interval) o;

            if (start != interval.start) return false;
            return end == interval.end;

        }

        @Override
        public int hashCode() {
            int result = start;
            result = 31 * result + end;
            return result;
        }
    }
}
