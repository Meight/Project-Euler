#include "EulerSolution.h"
#include <cmath>
#include "EulerUtils.h"
#include <iostream>
/*
 * @author Matthieu Le Boucher <matt.leboucher@gmail.com>
 */

using namespace std;

class Problem010 : public EulerSolution {
public:
    int number() override {
        return 10;
    }

    double solution() override {
        int limit = 2000000;
        vector<bool> sieve = EulerUtils::get_sieve(limit);

        double sum = 2;
        for (int i = 1; i <= (limit - 1) / 2; i++)
            if (!sieve[i]) sum += 2 * i + 1;

        return sum;
    }

    double answer() override {
        return 142913828922L;
    }
};