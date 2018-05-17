package Utils;

/**
 * Set of recurrent mathematical helpers used here and there in various solutions.
 *
 * @author Matthieu Le Boucher
 */
public class Combinatorics {
    public static double choose(int n, int k) {
        if (n == 2 * k) {
            double result = 1;

            for (int i = 1; i < n; i++) {
                result *= result * (n + i) / i;
            }

            return result;
        }

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
