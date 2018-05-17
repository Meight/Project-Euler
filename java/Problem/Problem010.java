/*
 * This file contains a solution to the problem number 1 of the Project Euler, last modified on 5/9/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

package Problem;

import Test.Solution;
import Utils.Arithmetics;

@Solution(number = 10, answer = 142913828922L)
public class Problem010 implements EulerSolution {
    /**
     * Since we know the amount of prime numbers we want to sum up, we can just use a good ol' sieve.
     * @return The sum of all prime numbers below 2 million.
     */
    public double solution() {
        int limit = 2_000_000;
        boolean[] sieve = Arithmetics.getSieve(limit);

        double sum = 2;
        for (int i = 1; i <= (limit - 1) / 2; i++)
            if (!sieve[i]) sum += 2 * i + 1;

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(String.format("%.0f", (new Problem010()).solution()));
    }
}
