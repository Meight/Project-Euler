/*
 * @author Matthieu Le Boucher <matt.leboucher@gmail.com>
 */

#include <iostream>
#include <vector>
#include <chrono>
#include <fstream>

#include "EulerSolution.h"
#include "Problem001.cpp"
#include "Problem002.cpp"
#include "Problem003.cpp"
#include "Problem004.cpp"
#include "Problem005.cpp"
#include "Problem006.cpp"
#include "Problem007.cpp"
#include "Problem008.cpp"
#include "Problem009.cpp"
#include "Problem014.cpp"

using namespace std;

typedef std::chrono::nanoseconds time_resolution;

int main(int argc, char *argv[]) {
    string fileName(argc > 0 ? argv[1] : "tests.dat");

    ofstream testLogs;
    testLogs.open(fileName);

    EulerSolution* solutions[] = {
            new Problem001(),
            new Problem002(),
            new Problem003(),
            new Problem004(),
            new Problem005(),
            new Problem006(),
            new Problem007(),
            new Problem008(),
            new Problem009(),
            new Problem014(),
    };


    for (EulerSolution *solution : solutions) {
        auto startTime = std::chrono::high_resolution_clock::now();
        double computedSolution = solution->solution();
        std::chrono::duration<double> duration = std::chrono::high_resolution_clock::now() - startTime;
        time_resolution elapsed = std::chrono::duration_cast<time_resolution>(duration);

        bool isCorrect = computedSolution == solution->answer();

        if(isCorrect)
            testLogs << solution->number() << " " << elapsed.count() / 1000.0 << endl;
        else
            testLogs << solution->number() << " *** FAILURE: " << computedSolution << " vs. " << solution->answer() << endl;
    }

    testLogs.close();

    return 0;
}