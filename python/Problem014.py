#
# This file contains a solution to the problem number 14 of the Project Euler, last modified on 5/13/2018.
# Copyright (c) Matthieu Le Boucher. All rights reserved.
#

def result():
    MAX_SIZE = 1_000_000
    max_chain_length = 1
    max_chain_number = 1

    chain_lengths = [0] * MAX_SIZE
    chain_lengths[1] = 1

    for i in range(2, MAX_SIZE):
        n = i
        current_length = 1

        while n != 1:
            if n % 2 == 0:
                n //= 2

                if n < i:
                    chain_lengths[i] = current_length + chain_lengths[n]

                    if chain_lengths[i] > max_chain_length:
                        max_chain_length = chain_lengths[i]
                        max_chain_number = i

                    break
            else:
                n = 3 * n + 1

            current_length += 1

    return max_chain_number

if __name__ == "__main__":
    print(result())
