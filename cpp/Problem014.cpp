#include "EulerSolution.h"
#include <iostream>

/*
 * @author Matthieu Le Boucher <matt.leboucher@gmail.com>
 */

using namespace std;

#define MAX_STARTING_NUMBER 1000000

class Problem014 : public EulerSolution {
public:
    int number() override {
        return 14;
    }

    double solution() override {
        int maxChainLength = 1;
        int maxChainNumber = 1;

        int* chainLengths = new int[MAX_STARTING_NUMBER];
        chainLengths[1] = 1;

        int currentChainLength;
        long i;

        for (int n = 500000; n < MAX_STARTING_NUMBER; n++) {
            // Compute current chain length.
            i = n;
            currentChainLength = 1;

            while (i != 1) {
                if (i % 2 == 0) {
                    i /= 2;

                    // If Collatz(i) has already been seen.
                    if (i < n) {
                        chainLengths[n] = currentChainLength + chainLengths[i];

                        if (chainLengths[n] > maxChainLength) {
                            maxChainLength = chainLengths[n];
                            maxChainNumber = n;
                        }

                        break;
                    }
                } else
                    i = 3 * i + 1;

                currentChainLength++;
            }
        }

        return maxChainNumber;
    }

    double answer() override {
        return 837799;
    }
};