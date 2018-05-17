/*
 * This file contains a solution to one of the problems from the Project Euler, last modified on 5/13/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

package Problem;

import Test.Solution;
import Utils.Arithmetics;

@Solution(number = 12, answer = 76576500)
public class Problem012 implements EulerSolution {
    private static final int DIVISORS_WANTED = 500;

    /**
     * Two observations:
     *      - the n-th triangular number T(n) is given by T(n) = n(n + 1) / 2.
     *      - n and its successor are co-prime, which means that the numbers of divisors of their product is
     *      just the product of divisors of each (easy to prove by reasoning on GCDs).
     *
     * @return Returns the value of the n-th triangular number which has at least DIVISORS_WANTED divisors.
     */
    public double solution() {
        int i = 1;

        while (true) {
            int divisorsAmount =
                    (i % 2 == 0)
                            ? Arithmetics.divisorsAmount(i / 2) * Arithmetics.divisorsAmount(i + 1)
                            : Arithmetics.divisorsAmount(i) * Arithmetics.divisorsAmount((i + 1) / 2);

            if (divisorsAmount >= DIVISORS_WANTED)
                return nthTriangularNumber(i);

            i++;
        }
    }

    private int nthTriangularNumber(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        System.out.println(String.format("%.0f", (new Problem012()).solution()));
    }
}
