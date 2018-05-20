#include "EulerSolution.h"
#include "EulerUtils.h"
#include <string>

/*
 * @author Matthieu Le Boucher <matt.leboucher@gmail.com>
 */

using namespace std;

class Problem005 : public EulerSolution {
public:
    int number() override {
        return 5;
    }

    double solution() override {
        int result = 1;

        for (int i = 1; i <= 20; i++) {
            result *= i / EulerUtils::gcd(i, result);
        }

        return result;
    }

    double answer() override {
        return 232792560;
    }
};