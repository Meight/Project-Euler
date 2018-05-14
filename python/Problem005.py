#
# This file contains a solution to the problem number 5 of the Project Euler, last modified on 5/5/2018.
# Copyright (c) Matthieu Le Boucher. All rights reserved.
#

import EulerUtils

def result():
    result = 1

    for i in range(1, 20):
        result = result * i // EulerUtils.gcd(result, i)

    return result

if __name__ == "__main__":
    print(result())