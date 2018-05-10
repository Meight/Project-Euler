#
# This file contains a solution to the problem number 7 of the Project Euler, last modified on 5/9/2018.
# Copyright (c) Matthieu Le Boucher. All rights reserved.
#

import EulerUtils

def result():
    targetPrimeNumber = 10_001
    primesCounter = 1
    currentNumber = 1

    while primesCounter < targetPrimeNumber:
        currentNumber += 2

        if EulerUtils.isPrime(currentNumber):
            print("{}: {}".format(primesCounter, currentNumber))
            primesCounter += 1

    return currentNumber

if __name__ == "__main__":
    print(result())