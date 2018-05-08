#
# This file contains a solution to the problem number 2 of the Project Euler, last modified on 5/2/2018.
# Copyright (c) Matthieu Le Boucher. All rights reserved.
#

def result():
    sum = 0
    x = 1
    y = 2

    while x <= 4_000_000:
        if x % 2 == 0:
            sum += x
        (x, y) = (y, x + y)

    return sum

print(result())