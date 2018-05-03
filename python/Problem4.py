#
# This file contains a solution to the problem number 4 of the Project Euler, last modified on 5/3/2018.
# Copyright (c) Matthieu Le Boucher. All rights reserved.
#

def result():
    n = 0

    for i in range(999, 100, -1):
        for j in range(i, 100, -1):
            product = i * j

            if product > n:
                productString = str(product)

                if productString == productString[::-1]:
                    n = product

    return n

print(result())