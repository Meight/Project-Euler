/*
 * @author Matthieu Le Boucher <matt.leboucher@gmail.com>
 */

#include <iostream>
#include <vector>
#include <chrono>
#include <stdio.h>

#include "EulerSolution.h"
#include "Problem001.cpp"
#include "Problem002.cpp"

using namespace std;

int main() {
    EulerSolution* solutions[] = {
            new Problem001(),
            new Problem002()
    };

    for (EulerSolution *solution : solutions) {
        auto startTime = std::chrono::high_resolution_clock::now();
        bool isCorrect = solution->solution() == solution->answer();
        std::chrono::duration<double> elapsed = std::chrono::high_resolution_clock::now() - startTime;

        cout << solution->number() << " " << elapsed.count() << (isCorrect ? "" : "*** FAILURE. ***") << endl;
    }

    return 0;
}