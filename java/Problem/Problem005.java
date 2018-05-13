/*
 * This file contains a solution to the problem number 1 of the Project Euler, last modified on 5/6/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

package Problem;

import Test.Solution;

@Solution(number = 5, answer = 232792560)
public class Problem005 implements EulerSolution {
    /**
     * We're practically looking for the LCM (lowest common multiple) of {1, ..., 20},
     * which we'll compute using the relation between LCM and GCD: LCM(a, b) = a * b / GCD(a, b).
     * We also use the commutative and associative properties of LCM to compute this result.
     */
    public double solution() {
        int result = 1;

        for (int i = 1; i <= 20; i++) {
            result *= i / EulerUtils.gcd(i, result);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println((new Problem005()).solution());
    }
}
