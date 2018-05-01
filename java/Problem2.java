/*
 * This file contains a solution to the problem number 2 of the Project Euler, last modified on 5/1/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

public class Problem2 {
    private static int solution() {
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
        System.out.println(Problem2.solution());
    }
}
