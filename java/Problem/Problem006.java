/*
 * This file contains a solution to the problem number 1 of the Project Euler, last modified on 5/6/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

package Problem;

import Test.Solution;

@Solution(number = 6, answer = 25164150)
public class Problem006 implements EulerSolution {
    public double solution() {
        int n = 100;

        int result = (int) (3 * Math.pow(n, 4) + 2 * Math.pow(n, 3) - 3 * Math.pow(n, 2) - 2 * n);

        return result / 12;
    }

    public static void main(String[] args) {
        System.out.println((new Problem006()).solution());
    }
}
