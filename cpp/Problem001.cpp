#include "EulerSolution.h"

/*
 * @author Matthieu Le Boucher <matt.leboucher@gmail.com>
 */

class Problem001 : public EulerSolution {
public:
    int number() override {
        return 1;
    }

    double solution() override {
        int sum = 0;

        for (int n = 3; n < 1000; n++)
            if (n % 3 == 0 || n % 5 == 0)
                sum += n;

        return sum;
    }

    double answer() override {
        return 233168;
    }
};