#include "EulerSolution.h"
#include <cmath>
#include "EulerUtils.h"

/*
 * @author Matthieu Le Boucher <matt.leboucher@gmail.com>
 */

class Problem009 : public EulerSolution {
public:
    int number() override {
        return 9;
    }

    double solution() override {
        int sum = 1000;
        int halfSum = sum / 2;

        double upperBound = floor(sqrt(halfSum));

        for (int m = 2; m <= upperBound; m++) {
            int remainder = halfSum / m;

            while (remainder % 2 == 0)
                remainder /= 2;

            int k = (m % 2 == 1) ? m + 2 : m + 1;

            while (k < 2 * m && k <= remainder) {
                if (remainder % k == 0 && EulerUtils::gcd(k, m) == 1) {
                    int d = halfSum / (k * m);
                    int n = k - m;

                    int a = (m * m - n * n) * d;
                    int b = 2 * m * n * d;
                    int c = (m * m + n * n) * d;

                    return a * b * c;
                }

                k += 2;
            }
        }

        return 0;
    }

    double answer() override {
        return 31875000;
    }
};