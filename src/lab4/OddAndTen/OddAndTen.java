package lab4.OddAndTen;

import java.util.List;

public class OddAndTen {
    /**
     * Decide if it is possible to divide the integers in a list into two sets,
     * so that the sum of one set is odd, and the sum of the other set is a multiple of 10.
     * Every integer must be in one set or the other.
     * For example, oddAndTen([5, 5, 3])  →  true,
     * and oddAndTen([5, 5, 4])  →  false.
     * @param list is a list of integers.
     * @return true iff there is one odd partition and the other multiple of 10.
     */
    // passed
    public static boolean oddAndTen(List<Integer> list) {
        return oddAndTenHelper(list, 0, 0, 0);
    }

    private static boolean oddAndTenHelper(List<Integer> list, int start, int sum1, int sum2) {
        // base case
        if (start == list.size())
            return (sum1 % 2 == 1 && sum2 % 10 == 0) || (sum2 % 2 == 1 && sum1 % 10 == 0);

        // recursive step
        if (oddAndTenHelper(list, start + 1, sum1 + list.get(start), sum2))
            return true;
        if (oddAndTenHelper(list, start + 1, sum1, sum2 + list.get(start)))
		    return true;

		return false;
    }
}
