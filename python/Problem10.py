#
# This file contains a solution to the problem number 10 of the Project Euler, last modified on 5/13/2018.
# Copyright (c) Matthieu Le Boucher. All rights reserved.
#

import EulerUtils

def result():
    n = 2_000_000
    sieve = EulerUtils.sieve(n)

    sum = 2
    for i in range(1, int((n - 1) / 2)):
        if not sieve[i]:
            sum += 2 * i + 1

    return sum

if __name__ == "__main__":
    print(result())
