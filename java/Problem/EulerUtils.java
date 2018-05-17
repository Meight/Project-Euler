package Problem;

import java.util.Arrays;

/**
 * Set of recurrent mathematical helpers used here and there in various solutions.
 *
 * @author Matthieu Le Boucher
 */
public class EulerUtils {
    /**
     * Optimized approach to check for the primality of a given number.
     * @param number The number whose primality is to check.
     * @return True if the number is prime, false otherwise.
     */
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

    /**
     * Generates an optimized sieve of Eratosthenes of given size under the form of an array of booleans.
     * @param limit The expected size of the sieve.
     * @return An optimized sieve such that sieve[i] is false if and only if (2i + 1 is prime).
     */
    public static boolean[] getSieve(int limit) {
        int sieveBound = (limit) / 2;
        boolean[] sieve = new boolean[sieveBound];
        Arrays.fill(sieve, false);

        int halfLimit = (int) ((Math.floor(Math.sqrt(limit)) - 1) / 2);

        for (int i = 1; i <= halfLimit; i++)
            if (!sieve[i]) // 2i + 1 is prime, mark its multiples.
                for (int j = 2 * i * (i + 1); j < sieveBound; j += 2 * i + 1)
                    sieve[j] = true;


        return sieve;
    }

}
