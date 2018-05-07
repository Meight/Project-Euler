/*
 * This file contains a solution to the problem number 1 of the Project Euler, last modified on 5/1/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

public class Problem1 implements EulerSolution {
    @Override
    public double solution() {
        int sum = 0;

        for (int n = 3; n < 1000; n++)
            if (n % 3 == 0 || n % 5 == 0)
                sum += n;

        return sum;
    }

    public static void main(String[] args) {
        System.out.println((new Problem1()).solution());
    }
}
