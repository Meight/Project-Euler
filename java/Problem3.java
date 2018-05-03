/*
 * This file contains a solution to the problem number 3 of the Project Euler, last modified on 5/3/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

public class Problem3 {
    private static long solution() {
        long n = 600_851_475_143L;
        int i = 2;

        while (i * i < n) {
            while (n % i == 0)
                n = n / i;

            i++;
        }

        return n;
    }

    public static void main(String[] args) {
        System.out.println(Problem3.solution());
    }
}
