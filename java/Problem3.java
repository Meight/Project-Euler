/*
 * This file contains a solution to the problem number 3 of the Project Euler, last modified on 5/3/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

public class Problem3 implements EulerSolution {
    public double solution() {
        // Target number is too large for 32-bit integer representation.
        long n = 600_851_475_143L;

        // Look for prime factors in [2, sqrt(n)].
        int currentFactor = 2;
        while (currentFactor * currentFactor < n) {
            while (n % currentFactor == 0)
                n /= currentFactor;

            currentFactor++;
        }

        return n;
    }

    public static void main(String[] args) {
        System.out.println((new Problem3()).solution());
    }
}
