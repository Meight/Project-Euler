/*
 * This file contains a solution to the problem number 1 of the Project Euler, last modified on 5/9/2018.
 *
 * Copyright (c) Matthieu Le Boucher. All rights reserved.
 */

package Problem;

import Test.Solution;
import Utils.Parsing;

@Solution(number = 18, answer = 1074)
public class Problem018 implements EulerSolution {
    public double solution() {
        String input = "75\n" +
                "95 64\n" +
                "17 47 82\n" +
                "18 35 87 10\n" +
                "20 04 82 47 65\n" +
                "19 01 23 75 03 34\n" +
                "88 02 77 73 07 63 67\n" +
                "99 65 04 28 06 16 70 92\n" +
                "41 41 26 56 83 40 80 70 33\n" +
                "41 48 72 33 47 32 37 16 94 29\n" +
                "53 71 44 65 25 43 91 52 97 51 14\n" +
                "70 11 33 28 77 73 17 78 39 68 17 57\n" +
                "91 71 52 38 17 14 91 43 58 50 27 29 48\n" +
                "63 66 04 68 89 53 67 30 73 16 69 87 40 31\n" +
                "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";
        int[][] triangle = Parsing.mapTriangleToArray(input);

        for (int currentLine = triangle.length - 2; currentLine >= 0; currentLine--) {
            for (int i = 0; i < triangle[currentLine].length; i++) {
                triangle[currentLine][i] = triangle[currentLine][i] +
                        Math.max(triangle[currentLine + 1][i], triangle[currentLine + 1][i + 1]);
            }
        }

        return triangle[0][0];
    }

    public static void main(String[] args) {
        System.out.println(String.format("%.0f", (new Problem018()).solution()));
    }
}
