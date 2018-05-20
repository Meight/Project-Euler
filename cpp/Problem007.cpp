#include "EulerSolution.h"
#include "EulerUtils.h"
#include <string>
#include <cmath>

/*
 * @author Matthieu Le Boucher <matt.leboucher@gmail.com>
 */

using namespace std;

class Problem007 : public EulerSolution {
public:
    int number() override {
        return 7;
    }

    double solution() override {
        int currentNumber = 1;
        int primesCounter = 1;

        while (primesCounter < 10001) {
            currentNumber += 2;

            if (EulerUtils::is_prime(currentNumber))
                primesCounter++;
        }

        return currentNumber;
    }

    double answer() override {
        return 104743;
    }
};