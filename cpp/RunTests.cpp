/*
 * @author Matthieu Le Boucher <matt.leboucher@gmail.com>
 */

#include <iostream>
#include <map>
#include <chrono>

#include "EulerSolution.h"
#include "Problem001.cpp"

using namespace std;

int main() {
    map<EulerSolution*, double> solutions;
    solutions[new Problem001()] = 233168;

    auto iterator = solutions.begin();

    while(iterator != solutions.end())
    {
        EulerSolution *solution = iterator->first;

        auto startTime = std::chrono::high_resolution_clock::now();
        bool isCorrect = solution->solution() == iterator->second;
        std::chrono::duration<double> elapsed = std::chrono::high_resolution_clock::now() - startTime;

        cout << solution->number() << " " << elapsed.count() << (isCorrect ? "" : "*** FAILURE. ***") << endl;
        iterator++;
    }

    return 0;
}