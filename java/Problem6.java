/*
 * This file contains a solution to the problem number 1 of the Project Euler, last modified on 5/5/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

public class Problem6 {
    private static int solution() {
        int n = 100;

        int result = (int) (3 * Math.pow(n, 4) + 2 * Math.pow(n, 3) - 3 * Math.pow(n, 2) - 2 * n);

        return result / 12;
    }

    public static void main(String[] args) {
        System.out.println(Problem6.solution());
    }
}
