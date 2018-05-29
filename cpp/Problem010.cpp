#include "EulerSolution.h"
#include <cmath>
#include "EulerUtils.h"

/*
 * @author Matthieu Le Boucher <matt.leboucher@gmail.com>
 */

class Problem010 : public EulerSolution {
public:
    int number() override {
        return 10;
    }

    double solution() override {
        int limit = 2000000;
        /*boolean[] sieve = Arithmetics.getSieve(limit);

        double sum = 2;
        for (int i = 1; i <= (limit - 1) / 2; i++)
            if (!sieve[i]) sum += 2 * i + 1;*/

        return sum;
    }

    double answer() override {
        return 31875000;
    }
};