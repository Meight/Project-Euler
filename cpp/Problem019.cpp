#include "EulerSolution.h"
#include <cmath>

/*
 * @author Matthieu Le Boucher <matt.leboucher@gmail.com>
 */

using namespace std;

class Problem019 : public EulerSolution {
public:
    int number() override {
        return 19;
    }

    double solution() override {
        return round(1200 / 7);
    }

    double answer() override {
        return 171;
    }
};