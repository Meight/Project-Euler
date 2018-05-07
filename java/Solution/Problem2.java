/*
 * This file contains a solution to the problem number 1 of the Project Euler, last modified on 5/6/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

package Solution;import Test.EulerSolution;
import Test.Solution;

@Solution(answer = 4613732)
public class Problem2 implements EulerSolution {
    public double solution() {
        int sum = 0;

        int x = 1;
        int y = 2;
        int z;

        while (x <= 4_000_000) {
            if (x % 2 == 0)
                sum += x;

            z = x + y;
            x = y;
            y = z;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println((new Problem2()).solution());
    }
}
