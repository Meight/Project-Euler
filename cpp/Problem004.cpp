#include "EulerSolution.h"
#include <string>
#include <algorithm>

/*
 * @author Matthieu Le Boucher <matt.leboucher@gmail.com>
 */

using namespace std;

class Problem004 : public EulerSolution {
public:
    int number() override {
        return 4;
    }

    double solution() override {
        int maximalProduct = 0;
        int product;
        string productString;

        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                product = i * j;

                if (product > maximalProduct) {
                    productString = to_string(product);
                    string reversedString(productString);
                    reverse(reversedString.begin(), reversedString.end());

                    if (productString == reversedString)
                        maximalProduct = product;
                }
            }
        }

        return maximalProduct;
    }

    double answer() override {
        return 906609;
    }
};