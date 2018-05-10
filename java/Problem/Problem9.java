/*
 * This file contains a solution to the problem number 9 of the Project Euler, last modified on 5/9/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

package Problem;

import Test.Solution;

@Solution(number = 9, answer = 31875000)
public class Problem9 implements EulerSolution {
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
                if (remainder % k == 0 && EulerUtils.gcd(k, m) == 1) {
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
        System.out.println(String.format("%.0f", (new Problem9()).solution()));
    }
}
