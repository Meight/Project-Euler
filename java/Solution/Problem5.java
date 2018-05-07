/*
 * This file contains a solution to the problem number 1 of the Project Euler, last modified on 5/6/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

package Solution;import Test.EulerSolution;
import Test.Solution;

@Solution(answer = 232792560)
public class Problem5 implements EulerSolution {
    /**
     * We're practically looking for the LCM (lowest common multiple) of {1, ..., 20},
     * which we'll compute using the relation between LCM and GCD: LCM(a, b) = a * b / GCD(a, b).
     * We also use the commutative and associative properties of LCM to compute this result.
     */
    public double solution() {
        int result = 1;

        for (int i = 1; i <= 20; i++) {
            result *= i / gcd(i, result);
        }

        return result;
    }

    /**
     * Computes the greater common divisor of two integers that are not all zero.
     * @param a First integer.
     * @param b Second integer.
     * @return The largest integer that divides each of the integers.
     */
    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println((new Problem5()).solution());
    }
}
