#
# This file contains a solution to the problem number 9 of the Project Euler, last modified on 5/9/2018.
# Copyright (c) Matthieu Le Boucher. All rights reserved.
#

import EulerUtils, math

def result():
    sum = 1000
    halfSum = sum / 2

    upperBound = int(math.sqrt(halfSum))

    for m in range(2, upperBound):
        remainder = halfSum / m

        while remainder % 2 == 0:
            remainder /= 2

        k = m + 2 if m % 2 == 1 else m + 1

        while k < 2 * m and k <= remainder:
            if remainder % k == 0 and EulerUtils.gcd(k, m) == 1:
                (d, n) = (halfSum / (k * m), k - m)

                (a, b, c) = (m ** 2 - n ** 2) * d, 2 * m * n * d, (m ** 2 + n ** 2) * d
                return a * b * c

            k += 2

if __name__ == "__main__":
    print(result())
