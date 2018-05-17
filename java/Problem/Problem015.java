/*
 * This file contains a solution to the problem number 1 of the Project Euler, last modified on 5/9/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

package Problem;

import Test.Solution;
import Utils.Combinatorics;

@Solution(number = 15, answer = 837799)
public class Problem015 implements EulerSolution {
    public double solution() {
        int n = 20;

        return Combinatorics.choose(2 * n, n);
    }

    public static void main(String[] args) {
        System.out.println(String.format("%.0f", (new Problem015()).solution()));
    }
}
