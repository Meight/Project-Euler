#
# This file contains a solution to the problem number 1 of the Project Euler, last modified on 5/2/2018.
# Copyright (c) Matthieu Le Boucher. All rights reserved.
#

print(sum(i for i in range(1000) if (i % 3 == 0 or i % 5 == 0)))