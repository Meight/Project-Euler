#
# This file contains a solution to the problem number 3 of the Project Euler, last modified on 5/3/2018.
# Copyright (c) Matthieu Le Boucher. All rights reserved.
#

def result():
    n = 600_851_475_143
    currentFactor = 2

    while currentFactor * currentFactor < n:
        while n % currentFactor == 0:
            n = n / currentFactor

        currentFactor = currentFactor + 1

    return n

if __name__ == "__main__":
    print(result())