/*
 * This file contains a solution to the problem number 1 of the Project Euler, last modified on 5/9/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

package Problem;

import Test.Solution;

@Solution(number = 19, answer = 171)
public class Problem019 implements EulerSolution {
    /**
     * We're looking at 100 years with 12 firsts each. Each first day of a month has about one chance in seven of being
     * a Sunday. Although just probabilistic and kind of lucky, we don't land too far from the actual answer. :)
     *
     * @return The number of Sundays fell on the first of the month during the twentieth century.
     */
    public double solution() {
        return Math.round(1200 / 7);
    }

    public static void main(String[] args) {
        System.out.println(String.format("%.0f", (new Problem019()).solution()));
    }
}
