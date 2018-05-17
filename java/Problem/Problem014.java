/*
 * This file contains a solution to the problem number 1 of the Project Euler, last modified on 5/9/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

package Problem;

import Test.Solution;

@Solution(number = 14, answer = 837799)
public class Problem014 implements EulerSolution {
    private static final int MAX_STARTING_NUMBER = 1_000_000;

    public double solution() {
        int maxChainLength = 1;
        int maxChainNumber = 1;

        int[] chainLengths = new int[MAX_STARTING_NUMBER];
        chainLengths[1] = 1;

        int currentChainLength;
        double i;

        for (int n = 500000; n < MAX_STARTING_NUMBER; n++) {
            // Compute current chain length.
            i = n;
            currentChainLength = 1;

            while (i != 1) {
                if (i % 2 == 0) {
                    i /= 2;

                    // If Collatz(i) has already been seen.
                    if (i < n) {
                        chainLengths[n] = currentChainLength + chainLengths[(int) i];

                        if (chainLengths[n] > maxChainLength) {
                            maxChainLength = chainLengths[n];
                            maxChainNumber = n;
                        }

                        break;
                    }
                } else
                    i = 3 * i + 1;

                currentChainLength++;
            }
        }

        return maxChainNumber;
    }

    public static void main(String[] args) {
        System.out.println(String.format("%.0f", (new Problem014()).solution()));
    }
}
