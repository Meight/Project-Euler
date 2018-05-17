/*
 * This file contains a solution to the problem number 1 of the Project Euler, last modified on 5/9/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

package Problem;

import Test.Solution;

import java.math.BigInteger;

@Solution(number = 16, answer = 1366)
public class Problem016 implements EulerSolution {
    private static final int POWER = 1_000;
    /**
     * This one is kind of straightforward. We use big integers to avoid the unavoidable overflow, and that's it.
     * @return The sum of the digits of 2
     */
    public double solution() {
        long sum = 0;

        char chars[] = BigInteger.valueOf(2).pow(POWER).toString().toCharArray();
        for(char c : chars)
            sum += Character.digit(c, 10);

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(String.format("%.0f", (new Problem016()).solution()));
    }
}
