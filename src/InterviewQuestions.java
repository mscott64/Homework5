/**
 * For this assignment, you'll be implementing methods as though they are interview
 * questions meaning there's no starter code and no test cases.
 * You get a problem description and one or two clarifying examples.
 * You must use good style and naming standards.
 * Feel free to ask me more clarifying questions if needed.
 *
 * Implement your methods under their problem description.
 */
public class InterviewQuestions {

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

    /**
     * Problem 3
     * Write a method that prints out all of the odd numbers from 0 to 100 that are NOT divisble by 3
     * and do NOT have a 1 at any position (e.g don't print 11, 21, 31, etc)
     */

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

    public class Interval {
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
    }
}
