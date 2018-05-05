#
# This file contains a solution to the problem number 5 of the Project Euler, last modified on 5/5/2018.
# Copyright (c) Matthieu Le Boucher. All rights reserved.
#

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def result():
    result = 1

    for i in range(1, 20):
        result = result * i // gcd(result, i)

    return result

print(result())