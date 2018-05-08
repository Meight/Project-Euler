#
# This file contains a solution to the problem number 6 of the Project Euler, last modified on 5/5/2018.
# Copyright (c) Matthieu Le Boucher. All rights reserved.
#

def result():
    n = 100

    result = 3 * pow(n, 4) + 2 * pow(n, 3) - 3 * pow(n, 2) - 2 * n
    result = result / 12

    return result

if __name__ == "__main__":
    print(result())