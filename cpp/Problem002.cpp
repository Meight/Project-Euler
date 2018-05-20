#include "EulerSolution.h"

/*
 * @author Matthieu Le Boucher <matt.leboucher@gmail.com>
 */

class Problem002 : public EulerSolution {
public:
    int number() override {
        return 2;
    }

    double solution() override {
        int sum = 0;

        int x = 1;
        int y = 2;
        int z;

        while (x <= 4000000) {
            if (x % 2 == 0)
                sum += x;

            z = x + y;
            x = y;
            y = z;
        }

        return sum;
    }

    double answer() override {
        return 4613732;
    }
};