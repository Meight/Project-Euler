/*
 * This file contains a solution to the problem number 1 of the Project Euler, last modified on 5/9/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

package Problem;

import Test.Solution;

@Solution(number = 10, answer = 142913828922L)
public class Problem10 implements EulerSolution {
    public double solution() {
        int limit = 2000000;
        boolean[] sieve = EulerUtils.getSieve(limit);

        double sum = 2;
        for (int i = 1; i <= (limit - 1) / 2; i++) {
            if (!sieve[i]) {
                sum += 2 * i + 1;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(String.format("%.0f", (new Problem10()).solution()));
    }
}
