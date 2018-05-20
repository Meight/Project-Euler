/*
 * @author Matthieu Le Boucher <matt.leboucher@gmail.com>
 */

#include "EulerUtils.h"
#include <cmath>

int EulerUtils::gcd(int &a, int &b) {
    if (b == 0)
        return a;

    int r = a % b;
    return gcd(b, r);
}

int EulerUtils::is_prime(int &n) {
    if (n == 1)
        return false;

    if (n < 4)
        return true;

    if (n % 2 == 0)
        return false;

    if (n < 9)
        return true;

    if (n % 3 == 0)
        return false;

    for (int i = 5; i <= ceil(sqrt(n)); i += 6) {
        if (n % i == 0 || n % (i + 2) == 0)
            return false;
    }

    return true;
}
