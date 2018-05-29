/*
 * @author Matthieu Le Boucher <matt.leboucher@gmail.com>
 */

#include "EulerUtils.h"
#include <cmath>
#include <vector>

using namespace std;

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

vector<bool> EulerUtils::get_sieve(int limit) {
    int sieveBound = (limit) / 2;

    vector<bool> sieve(sieveBound);
    fill(sieve.begin(), sieve.end(), false);

    float halfLimit = (int) ((floor(sqrt(limit)) - 1) / 2);

    for (int i = 1; i <= halfLimit; i++)
        if (!sieve[i]) // 2i + 1 is prime, mark its multiples.
            for (int j = 2 * i * (i + 1); j < sieveBound; j += 2 * i + 1)
                sieve[j] = true;

    return sieve;
}
