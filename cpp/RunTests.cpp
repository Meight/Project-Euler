/*
 * @author Matthieu Le Boucher <matt.leboucher@gmail.com>
 */

#include <iostream>
#include <vector>
#include <chrono>
#include <stdio.h>
#include <fstream>

#include "EulerSolution.h"
#include "Problem001.cpp"
#include "Problem002.cpp"
#include "Problem003.cpp"

using namespace std;

typedef std::chrono::nanoseconds time_resolution;

int main() {
    ofstream testLogs;
    testLogs.open ("../tests.dat");

    EulerSolution* solutions[] = {
            new Problem001(),
            new Problem002(),
            new Problem003()
    };

    for (EulerSolution *solution : solutions) {
        auto startTime = std::chrono::high_resolution_clock::now();
        bool isCorrect = solution->solution() == solution->answer();
        std::chrono::duration<double> duration = std::chrono::high_resolution_clock::now() - startTime;
        time_resolution elapsed = std::chrono::duration_cast<time_resolution>(duration);

        testLogs << solution->number() << " " << elapsed.count() / 1000.0 << (isCorrect ? "" : "*** FAILURE. ***") << endl;
    }

    testLogs.close();

    return 0;
}