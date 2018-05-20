#include "EulerSolution.h"

/*
 * @author Matthieu Le Boucher <matt.leboucher@gmail.com>
 */

class Problem003 : public EulerSolution {
public:
    int number() override {
        return 3;
    }

    double solution() override {
        // Target number is too large for 32-bit integer representation.
        long n = 600851475143L;

        // Look for prime factors in [2, sqrt(n)].
        int currentFactor = 2;
        while (currentFactor * currentFactor < n) {
            while (n % currentFactor == 0)
                n /= currentFactor;

            currentFactor++;
        }

        return n;
    }

    double answer() override {
        return 6857;
    }
};