package Problem;

import java.util.Arrays;

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

    public static boolean[] getSieve(int limit) {
        int sieveBound = (limit - 1 ) / 2;
        boolean[] sieve = new boolean[sieveBound];
        Arrays.fill(sieve, false);

        int halfLimit = (int) ((Math.sqrt(limit) - 1) / 2);

        for (int i = 1; i < halfLimit; i++)
            if (!sieve[i])
                for (int j = 2 * i * (i + 1); j < sieveBound; j += 2 * i + 1)
                    sieve[j] = true;

        return sieve;
    }

    public static boolean isPrimeInSieve(int n, boolean[] sieve) {
        return n % 2 != 0 && !sieve[(n - 1) / 2];
    }
}
