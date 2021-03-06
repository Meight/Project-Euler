package Utils;

/**
 * Set of recurrent mathematical helpers used here and there in various solutions.
 *
 * @author Matthieu Le Boucher
 */
public class Combinatorics {

    /**
     * Computes binomial coefficients, or n choose k,
     * i.e. the number of ways to choose a subset of
     * k elements within a set of n elements.
     */
    public static double choose(int n, int k) {
        if (k < 0 || k > n)
            return 0;

        if (k > n / 2)
            k = n - k;

        double denominator = 1,
                numerator = 1;

        for (int i = 1; i <= k; i++) {
            numerator *= (n + 1 - i);
            denominator *= i;
        }

        return numerator / denominator;
    }
}
