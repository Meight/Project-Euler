# Project Euler

This repository contains a set of solutions to some problems from [Project Euler](https://projecteuler.net/), a series of challenging mathematical/computer programming problems that require more than just mathematical insights to solve.

My current statistics on Project Euler are:

![My stats.](https://projecteuler.net/profile/Meight.png "My stats.")

I solved these a long time ago using brute force the vast majority of the time. I'm now rewriting each one of these solutions in a much smarter, faster, economic way.

# Solutions and programming languages

Most solutions are derived in three different approaches (paradigms) using Java, Python and F# programming languages.

| Problem        | Java           | Python  | F# |
| :--------------: |:--------------:| :-------:|:----:|
| 1 | ✔ | ✔ | ✔ |
| 2 | ✔ | ✔ | ✔ |
| 3 | ✔ | ✔ | ✔ |
| 4 | ✔ | ✔ | ✔ |
| 5 | ✔ | ✔ | ✔ |
| 6 | ✔ | ✔ | ✔ |
| 7 | ✔ | ✔ |  |
| 8 | ✔ | ✔ |  |
| 9 | ✔ | ✔ |  |
| 10 | ✔ | ✔ | |
| 11 | ✔ | ✔ | |
| 12 | ✔ |  | |
| 13 | ✔ |  | |
| 14 | ✔ | ✔ | |
| 15 | ✔ |  | |
| 16 | ✔ | ✔ | |

## Performances

All performances are automatically gathered and compared in a [beautiful graph](report/graph.pdf). Please note that the time scale is logarithmic and in microseconds.

## Work in progress

F# for problem 7 is bugged; looks like the primality test lets a few non-primal numbers through at some point (10,001th is only off by about 50 prime numbers). Currently investigating.

# Upcoming

## New programming languages

For learning purposes, solutions will be transcribed over time in the following programming languages (in order of priority).

* Haskell;
* R;
* Rust;
* good ol' PHP for fun.

## Statistical analysis

- [x] Automate tests; 
- [ ] Log execution time for each approach/programming language;
- [x] Automate graph generation from gathered data.
