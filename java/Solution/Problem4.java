/*
 * This file contains a solution to the problem number 1 of the Project Euler, last modified on 5/6/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

package Solution;import Test.EulerSolution;
import Test.Solution;

@Solution(answer = 906609)
public class Problem4 implements EulerSolution {
    public double solution() {
        int maximalProduct = 0;
        int product;
        String productString;

        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                product = i * j;

                if (product > maximalProduct) {
                    productString = Integer.toString(product);

                    if (productString.equals(new StringBuilder(productString).reverse().toString()))
                        maximalProduct = product;
                }
            }
        }

        return maximalProduct;
    }

    public static void main(String[] args) {
        System.out.println((new Problem4()).solution());
    }
}
