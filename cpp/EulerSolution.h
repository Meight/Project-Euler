/*
 * @author Matthieu Le Boucher <matt.leboucher@gmail.com>
 */

#ifndef CPP_EULERSOLUTION_H
#define CPP_EULERSOLUTION_H

class EulerSolution {
public:
    virtual int number() = 0;
    virtual double solution() = 0;
    virtual double answer() = 0;
};

#endif
