/*
 * @author Matthieu Le Boucher <matt.leboucher@gmail.com>
 */

#ifndef CPP_EULERUTILS_H
#define CPP_EULERUTILS_H

#include <vector>

using namespace std;

class EulerUtils {
public:
    static int gcd(int &a, int &b);
    static int is_prime(int &n);
    static vector<bool> get_sieve(int limit);
};


#endif //CPP_EULERUTILS_H
