/*
 * This file contains a solution to the problem number 5 of the Project Euler, last modified on 5/5/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

public class Problem5 {
    private static int solution() {
        int result = 1;

        for (int i = 1; i <= 20; i++) {
            result *= i / gcd(i, result);
        }

        return result;
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(Problem5.solution());
    }
}
