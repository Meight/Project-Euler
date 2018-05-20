#include "EulerSolution.h"
#include "EulerUtils.h"
#include <string>
#include <cmath>

/*
 * @author Matthieu Le Boucher <matt.leboucher@gmail.com>
 */

using namespace std;

class Problem006 : public EulerSolution {
public:
    int number() override {
        return 6;
    }

    double solution() override {
        int n = 100;

        double result = 3 * pow(n, 4) + 2 * pow(n, 3) - 3 * pow(n, 2) - 2 * n;

        return result / 12;
    }

    double answer() override {
        return 25164150;
    }
};