package Problem;

/**
 * @author Matthieu Le Boucher
 */
public class EulerUtils {
    public static boolean isPrime(int number) {
        if (number == 1)
            return false;

        if (number < 4)
            return true;

        if (number % 2 == 0)
            return false;

        if (number < 9)
            return true;

        if (number % 3 == 0)
            return false;

        for (int i = 5; i <= Math.ceil(Math.sqrt(number)); i += 6) {
            if (number % i == 0 || number % (i + 2) == 0)
                return false;
        }

        return true;
    }

    /**
     * Computes the greater common divisor of two integers that are not all zero.
     * @param a First integer.
     * @param b Second integer.
     * @return The largest integer that divides each of the integers.
     */
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
