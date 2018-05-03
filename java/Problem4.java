/*
 * This file contains a solution to the problem number 4 of the Project Euler, last modified on 5/3/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

public class Problem4 {
    private static int solution() {
        int n = 0;
        int product;
        String productString;

        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                product = i * j;

                if (product > n) {
                    productString = Integer.toString(product);

                    if (productString.equals(new StringBuilder(productString).reverse().toString()))
                        n = product;
                }
            }
        }

        return n;
    }

    public static void main(String[] args) {
        System.out.println(Problem4.solution());
    }
}
