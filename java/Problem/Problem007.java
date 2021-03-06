/*
 * This file contains a solution to the problem number 1 of the Project Euler, last modified on 5/9/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

package Problem;

import Test.Solution;
import Utils.Arithmetics;

@Solution(number = 7, answer = 104743)
public class Problem007 implements EulerSolution {
    public double solution() {
        int currentNumber = 1;
        int primesCounter = 1;

        while (primesCounter < 10_001) {
            currentNumber += 2;

            if (Arithmetics.isPrime(currentNumber))
                primesCounter++;
        }

        return currentNumber;
    }

    public static void main(String[] args) {
        System.out.println((new Problem007()).solution());
    }
}
