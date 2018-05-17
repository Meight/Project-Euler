#
# This file contains a solution to the problem number 16 of the Project Euler, last modified on 5/13/2018.
# Copyright (c) Matthieu Le Boucher. All rights reserved.
#

def result():
    return sum(map(int, str(2**1000)))

if __name__ == "__main__":
    print(result())
