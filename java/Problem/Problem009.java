/*
 * This file contains a solution to the problem number 9 of the Project Euler, last modified on 5/9/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

package Problem;

import Test.Solution;
import Utils.Arithmetics;

@Solution(number = 9, answer = 31875000)
public class Problem009 implements EulerSolution {
    /**
     * We use a parametrization of Pythagorean triplets (a, b, c), and several properties:
     *      - GCD(a, b) = GCD(b, c) = GCD(a, c).
     *      - if GCD(a, b) = 1 (primitive triplet), then there exists m and n s.t. m > n > 0 and
     *             a = m² - n², b = 2mn, c = m² + n².
     *      - the triplet is therefore primitive only if GCD(m, n) = 1 and either m or n is even.
     * We try to get from any triplet to a primitive triplet by dividing by the GCD d. Using this parametrization,
     * one has:
     *              a + b + c = 2md(m + n).
     *
     * The problem is equivalent to finding a divisor m of half the total sum, and an odd divisor k of the same half
     * divided by m. (with k in [m, 2m] and GCD(k, m) = 1).
     * @return The product a * b * c.of the triplet (a, b, c) such that a + b + c = 1000.
     */
    public double solution() {
        int sum = 1000;
        int halfSum = sum / 2;

        int upperBound = (int) Math.floor(Math.sqrt(halfSum));

        for (int m = 2; m <= upperBound; m++) {
            int remainder = halfSum / m;

            while (remainder % 2 == 0)
                remainder /= 2;

            int k = (m % 2 == 1) ? m + 2 : m + 1;

            while (k < 2 * m && k <= remainder) {
                if (remainder % k == 0 && Arithmetics.gcd(k, m) == 1) {
                    int d = halfSum / (k * m);
                    int n = k - m;

                    int a = (m * m - n * n) * d;
                    int b = 2 * m * n * d;
                    int c = (m * m + n * n) * d;

                    return a * b * c;
                }

                k += 2;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(String.format("%.0f", (new Problem009()).solution()));
    }
}
