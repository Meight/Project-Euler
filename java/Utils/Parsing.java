package Utils;

/**
 * @author Matthieu Le Boucher
 */
public class Parsing {
    public static int[][] mapTriangleToArray(String input) {

        String[] inputLines = input.split("\n");

        int[][] result = new int[inputLines.length][];

        int currentLine = 0;
        for (String line : inputLines) {
            String[] stringDigits = line.split(" ");
            int[] digits = new int[stringDigits.length];

            int i = 0;
            for (String digit : stringDigits) {
                digits[i++] = Integer.parseInt(digit);
            }

            result[currentLine++] = digits;
        }

        return result;
    }
}
